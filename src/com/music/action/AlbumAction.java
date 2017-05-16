package com.music.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.music.dao.*;
import com.music.model.*;
import com.opensymphony.xwork2.ActionSupport;
@Controller @Scope("prototype")
public class AlbumAction extends ActionSupport{
	/*ÒµÎñ²ã*/
	@Resource AlbumDao albumDao;
	private Album album;
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	public String addAlbum() throws Exception{
		albumDao.AddAlbum(album);
		return "message_Album";
		
	}

}
