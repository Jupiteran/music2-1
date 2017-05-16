package com.music.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Singer entity. @author MyEclipse Persistence Tools
 */

public class Singer implements java.io.Serializable {

	// Fields

	private Integer singerid;
	private String singername;
	private String introduction;
	private String singerfilepath;
	private Set albums = new HashSet(0);
	private Set songs = new HashSet(0);
	private Set songs_1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public Singer() {
	}

	/** minimal constructor */
	public Singer(String singername) {
		this.singername = singername;
	}

	/** full constructor */
	public Singer(String singername, String introduction,
			String singerfilepath, Set albums, Set songs, Set songs_1) {
		this.singername = singername;
		this.introduction = introduction;
		this.singerfilepath = singerfilepath;
		this.albums = albums;
		this.songs = songs;
		this.songs_1 = songs_1;
	}

	// Property accessors

	public Integer getSingerid() {
		return this.singerid;
	}

	public void setSingerid(Integer singerid) {
		this.singerid = singerid;
	}

	public String getSingername() {
		return this.singername;
	}

	public void setSingername(String singername) {
		this.singername = singername;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getSingerfilepath() {
		return this.singerfilepath;
	}

	public void setSingerfilepath(String singerfilepath) {
		this.singerfilepath = singerfilepath;
	}

	public Set getAlbums() {
		return this.albums;
	}

	public void setAlbums(Set albums) {
		this.albums = albums;
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