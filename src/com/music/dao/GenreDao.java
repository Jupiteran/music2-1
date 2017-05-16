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
public class GenreDao {
	@Resource SessionFactory factory;
	/*添加genre信息*/
    public void AddGenre(Genre genre) throws Exception {
    	Session s = factory.getCurrentSession();
    	s.save(genre);
    }
    /*删除genre信息*/
    public void DeleteGenre(Integer genreid) throws Exception {
        Session s = factory.getCurrentSession(); 
        Object genre = s.load(Genre.class, genreid);
        s.delete(genre);
    }
    
    /*更新genre信息*/
    public void UpdateGenre(Genre genre) throws Exception {
        Session s = factory.getCurrentSession();
        s.update(genre);
    }
    
    /*查询所有genre信息*/
    public ArrayList<Genre> QueryAllgenres() {
        Session s = factory.getCurrentSession();
        String hql = "From Genre";
        Query q = s.createQuery(hql);
        List genreList = q.list();
        return (ArrayList<Genre>) genreList;
    }

    /*根据主键获取对象*/
    public Genre GetGenreById(Integer genreid) {
        Session s = factory.getCurrentSession();
        Genre genre = (Genre)s.get(Genre.class, genreid);
        return genre;
    }
    /*根据歌手名字获取对象*/
    public Genre GetGenreByName(String genrename) { 
    	Session s = factory.getCurrentSession();
    	String hql = "From Genre genre where 1=1";
    	if(!genrename.equals("")) hql = hql + " and genre.genrename like '%" + genrename + "%'";
    	Query q = s.createQuery(hql);
    	Genre genre = (Genre) q.uniqueResult();
    	return genre;
    }
    
    /*根据查询条件查询*/
    public ArrayList<Genre> QuerygenreInfo(String genrename) { 
    	Session s = factory.getCurrentSession();
    	String hql = "From Genre genre where 1=1";
    	if(!genrename.equals("")) hql = hql + " and genre.genrename like '%" + genrename + "%'";
    	Query q = s.createQuery(hql);
    	List genreList = q.list();
    	return (ArrayList<Genre>) genreList;
    }

}
