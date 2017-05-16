package com.music.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Genre entity. @author MyEclipse Persistence Tools
 */

public class Genre implements java.io.Serializable {

	// Fields

	private Integer genreid;
	private String genrename;
	private Set songs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Genre() {
	}

	/** minimal constructor */
	public Genre(String genrename) {
		this.genrename = genrename;
	}

	/** full constructor */
	public Genre(String genrename, Set songs) {
		this.genrename = genrename;
		this.songs = songs;
	}

	// Property accessors

	public Integer getGenreid() {
		return this.genreid;
	}

	public void setGenreid(Integer genreid) {
		this.genreid = genreid;
	}

	public String getGenrename() {
		return this.genrename;
	}

	public void setGenrename(String genrename) {
		this.genrename = genrename;
	}

	public Set getSongs() {
		return this.songs;
	}

	public void setSongs(Set songs) {
		this.songs = songs;
	}

}