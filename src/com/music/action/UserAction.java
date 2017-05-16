package com.music.action;

import java.util.ArrayList;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.music.dao.*;
import com.music.model.*;
import com.opensymphony.xwork2.ActionSupport;
@Controller @Scope("prototype")
public class UserAction extends ActionSupport implements SessionAware{
	/*业务层*/
	@Resource UserDao userDao;
	private Map<String,Object> session;
	private String prePage;
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String addUser() throws Exception{
		userDao.AddUser(user);
		return "message_user";
		
	}
	public String reg() throws Exception{
		userDao.AddUser(user);
		session.put("user", user);
		return "login_message";
	}
    private String errMessage;
	
	public String getErrMessage() {
		return errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
	public void setSession(Map<String, Object> arg0) {
		session=arg0;
	}
	public String getPrePage() {
		return prePage;
	}
	public void setPrePage(String prePage) {
		this.prePage = prePage;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	/* 验证用户登录 */
	/*public String login(){
		User db_user=userDao.QueryUserInfo(user.getUsername());
		if(db_user == null) { 
			this.errMessage = " 账号不存在 ";
			System.out.print(this.errMessage);
			return INPUT;
		} else if( !db_user.getPassword().equals(user.getPassword())) {
			this.errMessage = " 密码不正确! ";
			System.out.print(this.errMessage);
			return INPUT;
		}
		session.put("user", db_user);
		return "login_message";
	}*/
	public String login(){
		ArrayList<User> listUser = userDao.QueryUserInfo2(user.getUsername());
		if(listUser.size()==0) { 
			
			this.errMessage = " 账号不存在 ";
			System.out.print(this.errMessage);
			return "input";
			
		} 
		else{
			
		    User db_user = listUser.get(0);
			if(!db_user.getPassword().equals(user.getPassword())) {
			
			this.errMessage = " 密码不正确! ";
			System.out.print(this.errMessage);
			return "input";
			
		    }else{
			
			session.put("user", db_user);
			prePage = (String) session.get("prePage");
            if(prePage!=null){
            	System.out.println("将要跳到："+ prePage );
    			session.remove("prePage");  
    			return "success";
			}
			System.out.println("将要跳到：首页" );  
			return "index";
			
		    }
		}
	}
	
	
}
