package com.music.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Album entity. @author MyEclipse Persistence Tools
 */

public class Album implements java.io.Serializable {

	// Fields

	private Integer albumid;
	private Singer singer;
	private String introduction;
	private String albumname;
	private String albumfilepath;
	private Set songs = new HashSet(0);
	private Set songs_1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public Album() {
	}

	/** minimal constructor */
	public Album(Singer singer, String albumname) {
		this.singer = singer;
		this.albumname = albumname;
	}

	/** full constructor */
	public Album(Singer singer, String introduction, String albumname,
			String albumfilepath, Set songs, Set songs_1) {
		this.singer = singer;
		this.introduction = introduction;
		this.albumname = albumname;
		this.albumfilepath = albumfilepath;
		this.songs = songs;
		this.songs_1 = songs_1;
	}

	// Property accessors

	public Integer getAlbumid() {
		return this.albumid;
	}

	public void setAlbumid(Integer albumid) {
		this.albumid = albumid;
	}

	public Singer getSinger() {
		return this.singer;
	}

	public void setSinger(Singer singer) {
		this.singer = singer;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getAlbumname() {
		return this.albumname;
	}

	public void setAlbumname(String albumname) {
		this.albumname = albumname;
	}

	public String getAlbumfilepath() {
		return this.albumfilepath;
	}

	public void setAlbumfilepath(String albumfilepath) {
		this.albumfilepath = albumfilepath;
	}

	public Set getSongs() {
		return this.songs;
	}

	public void setSongs(Set songs) {
		this.songs = songs;
	}

	public Set getSongs_1() {
		return this.songs_1;
	}

	public void setSongs_1(Set songs_1) {
		this.songs_1 = songs_1;
	}

}