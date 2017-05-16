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
public class UserDao {
	@Resource SessionFactory factory;
	/*���User��Ϣ*/
    public void AddUser(User user) throws Exception {
    	Session s = factory.getCurrentSession();
    	s.save(user);
    }
    /*ɾ��User��Ϣ*/
    public void DeleteUser(Integer userid) throws Exception {
        Session s = factory.getCurrentSession(); 
        Object user = s.load(User.class, userid);
        s.delete(user);
    }
    
    /*����User��Ϣ*/
    public void UpdateUser(User user) throws Exception {
        Session s = factory.getCurrentSession();
        s.update(user);
    }
    
    /*��ѯ����User��Ϣ*/
    public ArrayList<User> QueryAllUsers() {
        Session s = factory.getCurrentSession();
        String hql = "From user";
        Query q = s.createQuery(hql);
        List userList = q.list();
        return (ArrayList<User>) userList;
    }

    /*����������ȡ����*/
    public User GetUserById(Integer userid) {
        Session s = factory.getCurrentSession();
        User user = (User)s.get(User.class, userid);
        return user;
    }
    
    /*���ݲ�ѯ������ѯ*/
    public User QueryUserInfo(String username) { 
    	Session s = factory.getCurrentSession();
    	//String hql = "From user";
    	String hql = "From User user where 1=1";
    	if(!username.equals("")) hql = hql + " and user.username like '%" + username + "%'";
    	Query q = s.createQuery(hql);
    	User user = (User) q.uniqueResult();
    	return user;
    }
    public ArrayList<User> QueryUserInfo2(String name) {
    	
    	Session s = factory.getCurrentSession();
    	List userList;
    	String hql = "From User user where 1=1";
    	if(!name.equals("")){ 
    		
    		hql = hql + " and user.username like '%" + name + "%'";
	    	Query q = s.createQuery(hql);
	    	userList = q.list();
	    	
    	}else{
    		
    	    userList =null;	
    	
    	}
    	return (ArrayList<User>) userList;
    }

}
