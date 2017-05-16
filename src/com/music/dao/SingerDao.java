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
	/*���Singer��Ϣ*/
    public void AddSinger(Singer singer) throws Exception {
    	Session s = factory.getCurrentSession();
    	s.save(singer);
    }
    /*ɾ��Singer��Ϣ*/
    public void DeleteSinger(Integer singerid) throws Exception {
        Session s = factory.getCurrentSession(); 
        Object singer = s.load(Singer.class, singerid);
        s.delete(singer);
    }
    
    /*����Singer��Ϣ*/
    public void UpdateSinger(Singer singer) throws Exception {
        Session s = factory.getCurrentSession();
        s.update(singer);
    }
    
    /*��ѯ����Singer��Ϣ*/
    public ArrayList<Singer> QueryAllSingers() {
        Session s = factory.getCurrentSession();
        String hql = "From Singer";
        Query q = s.createQuery(hql);
        List singerList = q.list();
        return (ArrayList<Singer>) singerList;
    }

    /*����������ȡ����*/
    public Singer GetSingerById(Integer singerid) {
        Session s = factory.getCurrentSession();
        Singer singer = (Singer)s.get(Singer.class, singerid);
        return singer;
    }
    /*���ݸ������ֻ�ȡ����*/
    public Singer GetSingerByName(String singername) { 
    	Session s = factory.getCurrentSession();
    	String hql = "From Singer singer where 1=1";
    	if(!singername.equals("")) hql = hql + " and singer.singername like '%" + singername + "%'";
    	Query q = s.createQuery(hql);
    	Singer singer = (Singer) q.uniqueResult();
    	return singer;
    }
    
    /*���ݲ�ѯ������ѯ*/
    public ArrayList<Singer> QuerySingerInfo(String singername) { 
    	Session s = factory.getCurrentSession();
    	String hql = "From Singer singer where 1=1";
    	if(!singername.equals("")) hql = hql + " and Singer.singername like '%" + singername + "%'";
    	Query q = s.createQuery(hql);
    	List singerList = q.list();
    	return (ArrayList<Singer>) singerList;
    }

}
