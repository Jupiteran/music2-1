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
public class SongDao {
	@Resource SessionFactory factory;
	/*添加Song信息*/
    public void AddSong(Song song) throws Exception {
    	Session s = factory.getCurrentSession();
    	s.save(song);
    }
    /*删除Song信息*/
    public void DeleteSong(Integer songid) throws Exception {
        Session s = factory.getCurrentSession(); 
        Object song = s.load(Song.class, songid);
        s.delete(song);
    }
    
    /*更新Song信息*/
    public void UpdateSong(Song song) throws Exception {
        Session s = factory.getCurrentSession();
        s.update(song);
    }
    
    /*查询所有Song信息*/
    public ArrayList<Song> QueryAllSongs() {
        Session s = factory.getCurrentSession();
        String hql = "From Song";
        Query q = s.createQuery(hql);
        List songList = q.list();
        return (ArrayList<Song>) songList;
    }

    /*根据主键获取对象*/
    public Song GetSongById(Integer songid) {
        Session s = factory.getCurrentSession();
        Song song = (Song)s.get(Song.class, songid);
        return song;
    }
    
    /*根据查询条件查询*/
    public ArrayList<Song> QuerySongInfo(String songname) { 
    	Session s = factory.getCurrentSession();
    	//String hql = "From Song";
    	String hql = "From Song song where 1=1";
    	if(!songname.equals("")) hql = hql + " and song.name like '%" + songname + "%'";
    	Query q = s.createQuery(hql);
    	List songList = q.list();
    	return (ArrayList<Song>) songList;
    }
    
    public ArrayList<Song> QuerySongsInfo(String songname, Integer genreid) {
    	Session s = factory.getCurrentSession();
    	String hql = "From Song song where 1=1";
    	if(null != songname) 
    		hql = hql + " and song.name like '%" + songname + "%'";
    	if(null !=genreid ) 
    		hql = hql + " and song.genre.genreid =" + genreid;
    	Query q = s.createQuery(hql);
    	List songList = q.list();
    	return (ArrayList<Song>) songList;
    }
    public ArrayList<Song> QuerySongsInfoBySinger(String singername) {
    	Session s = factory.getCurrentSession();
    	String hql = "From Song song where 1=1";
    	if(null != singername) 
    		hql = hql + " and song.singer.singername like '%" + singername + "%'";
    	Query q = s.createQuery(hql);
    	List songList = q.list();
    	return (ArrayList<Song>) songList;
    }

}
