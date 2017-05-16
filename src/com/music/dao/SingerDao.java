package com.music.dao;
import java.util.ArrayList;
import java.util.List;

import com.music.model.*;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service @Transactional 
public class SingerDao {
	@Resource SessionFactory factory;
	/*添加Singer信息*/
    public void AddSinger(Singer singer) throws Exception {
    	Session s = factory.getCurrentSession();
    	s.save(singer);
    }
    /*删除Singer信息*/
    public void DeleteSinger(Integer singerid) throws Exception {
        Session s = factory.getCurrentSession(); 
        Object singer = s.load(Singer.class, singerid);
        s.delete(singer);
    }
    
    /*更新Singer信息*/
    public void UpdateSinger(Singer singer) throws Exception {
        Session s = factory.getCurrentSession();
        s.update(singer);
    }
    
    /*查询所有Singer信息*/
    public ArrayList<Singer> QueryAllSingers() {
        Session s = factory.getCurrentSession();
        String hql = "From Singer";
        Query q = s.createQuery(hql);
        List singerList = q.list();
        return (ArrayList<Singer>) singerList;
    }

    /*根据主键获取对象*/
    public Singer GetSingerById(Integer singerid) {
        Session s = factory.getCurrentSession();
        Singer singer = (Singer)s.get(Singer.class, singerid);
        return singer;
    }
    /*根据歌手名字获取对象*/
    public Singer GetSingerByName(String singername) { 
    	Session s = factory.getCurrentSession();
    	String hql = "From Singer singer where 1=1";
    	if(!singername.equals("")) hql = hql + " and singer.singername like '%" + singername + "%'";
    	Query q = s.createQuery(hql);
    	Singer singer = (Singer) q.uniqueResult();
    	return singer;
    }
    
    /*根据查询条件查询*/
    public ArrayList<Singer> QuerySingerInfo(String singername) { 
    	Session s = factory.getCurrentSession();
    	String hql = "From Singer singer where 1=1";
    	if(!singername.equals("")) hql = hql + " and Singer.singername like '%" + singername + "%'";
    	Query q = s.createQuery(hql);
    	List singerList = q.list();
    	return (ArrayList<Singer>) singerList;
    }

}
