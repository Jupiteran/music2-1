package com.music.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.music.dao.*;
import com.music.model.*;
import com.opensymphony.xwork2.ActionSupport;
@Controller @Scope("prototype")
public class SongAction extends ActionSupport{
	/*ҵ���*/
	@Resource SongDao songDao;
	@Resource SingerDao singerDao;
	@Resource AlbumDao albumDao;
	@Resource GenreDao genreDao;
	private File songpath;
	private String songpathFileName;
    private String songpathContentType;
	private Song song;
	private List<Song> songList;
	public String showAdd() throws Exception{
		return "addSong";
	}
	public String addSong() throws Exception{
		String path = ServletActionContext.getServletContext().getRealPath("/song"); 
		Singer singer=singerDao.GetSingerByName(song.getSinger().getSingername());
		if(singer==null){
			Singer reSinger=new Singer();
			reSinger.setSingername(song.getSinger().getSingername());
			reSinger.setSingerfilepath("upload/NoImage.jpg");
			singerDao.AddSinger(reSinger);
			song.setSinger(reSinger);
			
		}else{
			song.setSinger(singer);
		}
		Album album=albumDao.GetAlbumByName(song.getAlbum().getAlbumname());
		if(album==null){
			Album reAlbum=new Album();
			reAlbum.setAlbumname(song.getAlbum().getAlbumname());
			reAlbum.setSinger(song.getSinger());
			albumDao.AddAlbum(reAlbum);
			song.setAlbum(reAlbum);
		}else{
			song.setAlbum(album);
		}
		Genre genre=genreDao.GetGenreByName(song.getGenre().getGenrename());
		song.setGenre(genre);
        System.out.println(path);
		/*��������ϴ�*/
   	 	if(songpath!= null) {
   	 		InputStream is = new FileInputStream(songpath); //����Ŀ¼ΪFile��������
   			String fileContentType = this.getSongpathContentType();
   			System.out.println(fileContentType);
   			song.setContentType(fileContentType);
   			if(fileContentType.equals("audio/mpeg") || fileContentType.equals("audio/mp3"))//����ͼƬ�����͸�Ҫд�����ͼƬ����File�ж�����д�룩����
   				songpathFileName = UUID.randomUUID().toString() +  ".mp3";
   			else if(fileContentType.equals("audio/wav"))
   				songpathFileName = UUID.randomUUID().toString() +  ".wav";
   			else if(fileContentType.equals("audio/x-ms-wma"))
   				songpathFileName = UUID.randomUUID().toString() +  ".wma";

   			File file = new File(path, songpathFileName);//�������Ƶ���ͼƬ��Ŀ¼������
   			OutputStream os = new FileOutputStream(file);//���������д���ļ���ָ����File
   			byte[] b = new byte[1024];//�����ֽ��������ڻ�ȡ��ԭĿ¼�������ֽ���
   			int bs = 0;//ÿ�ζ�ȡ�����ֽڳ���
   			while ((bs = is.read(b)) > 0) {
   				os.write(b, 0, bs);//д��ÿ�ζ�ȡ�����ֽ�write(byte[],int off,int length)
   			}
   			is.close();
   			os.close();
   	 	}
        if(songpath != null)
        	song.setFilepath("song/" + songpathFileName);//��������ӵ�ʳ���Filepath
       
		songDao.AddSong(song);
		return "message";
		
	}
		
	public String showDetail() throws Exception{
		song=songDao.GetSongById(song.getSongid());
		return "detail_view";
	}
	public String showSong() throws Exception{
		songList=songDao.QueryAllSongs();
		return "show_view";
	}
	public String showSongByGenre() throws Exception{
		songList=songDao.QuerySongsInfo(null,song.getGenre().getGenreid());
		switch (song.getGenre().getGenreid()) {
		case 1:
			return "pop";
		case 2:
			return "country";	
		case 3:
			return "folk";
		case 4:
			return "Rhythm and Blues";
		case 5:
			return "RR";
			
		}
		return null;
	}
	public String showSongBySinger() throws Exception{
		songList=songDao.QuerySongsInfoBySinger(song.getSinger().getSingername());
		return null;
	}
	/*��ʾSong���޸���*/
	public String showEdit() throws Exception{
		song=songDao.GetSongById(song.getSongid());
		return "edit_view";
		
	}
	public String editSong() throws Exception{
		Song reSong=songDao.GetSongById(song.getSongid());
		reSong.setName(song.getName());
		Singer reSinger=singerDao.GetSingerByName(song.getSinger().getSingername());
		reSong.setSinger(reSinger);
		Album reAlbum=albumDao.GetAlbumByName(song.getAlbum().getAlbumname());
		reSong.setAlbum(reAlbum);
		Genre reGenre=genreDao.GetGenreByName(song.getGenre().getGenrename());
		reSong.setGenre(reGenre);
		
		String path = ServletActionContext.getServletContext().getRealPath("/song"); 
		
		if(songpath!= null) {
			
   	 		InputStream is = new FileInputStream(songpath); //����Ŀ¼ΪFile��������
   			String fileContentType = this.getSongpathContentType();
   			System.out.println(fileContentType);
   			song.setContentType(fileContentType);
   			if(fileContentType.equals("audio/mpeg") || fileContentType.equals("audio/mp3"))//����ͼƬ�����͸�Ҫд�����ͼƬ����File�ж�����д�룩����
   				songpathFileName = UUID.randomUUID().toString() +  ".mp3";
   			else if(fileContentType.equals("audio/wav"))
   				songpathFileName = UUID.randomUUID().toString() +  ".wav";
   			else if(fileContentType.equals("audio/x-ms-wma"))
   				songpathFileName = UUID.randomUUID().toString() +  ".wma";

   			File file = new File(path, songpathFileName);//�������Ƶ���ͼƬ��Ŀ¼������
   			OutputStream os = new FileOutputStream(file);//���������д���ļ���ָ����File
   			byte[] b = new byte[1024];//�����ֽ��������ڻ�ȡ��ԭĿ¼�������ֽ���
   			int bs = 0;//ÿ�ζ�ȡ�����ֽڳ���
   			while ((bs = is.read(b)) > 0) {
   				os.write(b, 0, bs);//д��ÿ�ζ�ȡ�����ֽ�write(byte[],int off,int length)
   			}
   			is.close();
   			os.close();
   			song.setFilepath("song/" + songpathFileName);//��������ӵ�ʳ���Filepath
   	 	}
		songDao.UpdateSong(reSong);
		
		return "edit_message";
		
	}
	public String deleteSong() throws Exception{
		songDao.DeleteSong(song.getSongid());
		return "delete_message";
		
	}
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	public List<Song> getSongList() {
		return songList;
	}
	public void setSongList(List<Song> songList) {
		this.songList = songList;
	}
	public File getSongpath() {
		return songpath;
	}
	public void setSongpath(File songpath) {
		this.songpath = songpath;
	}
	public String getSongpathFileName() {
		return songpathFileName;
	}
	public void setSongpathFileName(String songpathFileName) {
		this.songpathFileName = songpathFileName;
	}
	public String getSongpathContentType() {
		return songpathContentType;
	}
	public void setSongpathContentType(String songpathContentType) {
		this.songpathContentType = songpathContentType;
	}

}
