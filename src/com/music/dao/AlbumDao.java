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
public class AlbumDao {
	@Resource SessionFactory factory;
	/*���Album��Ϣ*/
    public void AddAlbum(Album album) throws Exception {
    	Session s = factory.getCurrentSession();
    	s.save(album);
    }
    /*ɾ��Album��Ϣ*/
    public void DeleteAlbum(Integer albumid) throws Exception {
        Session s = factory.getCurrentSession(); 
        Object album = s.load(Album.class, albumid);
        s.delete(album);
    }
    
    /*����Album��Ϣ*/
    public void UpdateAlbum(Album album) throws Exception {
        Session s = factory.getCurrentSession();
        s.update(album);
    }
    
    /*��ѯ����Album��Ϣ*/
    public ArrayList<Album> QueryAllAlbums() {
        Session s = factory.getCurrentSession();
        String hql = "From Album";
        Query q = s.createQuery(hql);
        List albumList = q.list();
        return (ArrayList<Album>) albumList;
    }

    /*����������ȡ����*/
    public Album GetAlbumById(Integer albumid) {
        Session s = factory.getCurrentSession();
        Album album = (Album)s.get(Album.class, albumid);
        return album;
    }
    /*���ݸ������ֻ�ȡ����*/

	public Album GetAlbumByName(String albumname) { 
    	Session s = factory.getCurrentSession();
    	String hql = "From Album album where 1=1";
    	if(!albumname.equals("")) hql = hql + " and album.albumname like '%" + albumname + "%'";
    	Query q = s.createQuery(hql);
    	Album album = (Album) q.uniqueResult();
    	return album;
    }
    
    /*���ݲ�ѯ������ѯ*/
    public ArrayList<Album> QueryAlbumInfo(String albumname) { 
    	Session s = factory.getCurrentSession();
    	String hql = "From Album album where 1=1";
    	if(!albumname.equals("")) hql = hql + " and album.Albumname like '%" + albumname + "%'";
    	Query q = s.createQuery(hql);
    	List albumList = q.list();
    	return (ArrayList<Album>) albumList;
    }

}
