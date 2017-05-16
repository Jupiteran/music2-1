package com.music.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.music.dao.*;
import com.music.model.*;
import com.opensymphony.xwork2.ActionSupport;
@Controller @Scope("prototype")
public class GenreAction extends ActionSupport{
	/*ÒµÎñ²ã*/
	@Resource GenreDao genreDao;
	private Genre genre;
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public String addGenre() throws Exception{
		genreDao.AddGenre(genre);
		return "message_Genre";
		
	}

}
