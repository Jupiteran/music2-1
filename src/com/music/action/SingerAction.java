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
public class SingerAction extends ActionSupport{
	/*业务层*/
	@Resource SingerDao singerDao;
	private Singer singer;
	private List<Singer> singerList;
	private File singerPhoto;
    private String singerPhotoFileName;
    private String singerPhotoContentType;
    public String showAdd() throws Exception{
		return "addSinger";
	}
	public Singer getSinger() {
		return singer;
	}
	public void setSinger(Singer singer) {
		this.singer = singer;
	}
	public String addSinger() throws Exception{
		String path = ServletActionContext.getServletContext().getRealPath("/upload"); 
		System.out.println(path);
        /*处理图片上传*/
        String singerPhotoFileName = ""; 
   	 	if(singerPhoto!= null) {
   	 		InputStream is = new FileInputStream(singerPhoto); //生成目录为File的输入流
   			String fileContentType = this.getSingerPhotoContentType();
   			System.out.println(fileContentType);
   			if(fileContentType.equals("image/jpeg")  || fileContentType.equals("image/pjpeg"))//根据图片的类型给要写入的新图片（从File中读出并写入）命名
   				singerPhotoFileName = UUID.randomUUID().toString() +  ".jpg";
   			else if(fileContentType.equals("image/gif"))
   				singerPhotoFileName = UUID.randomUUID().toString() +  ".gif";
   			else if(fileContentType.equals("image/png"))
   				singerPhotoFileName = UUID.randomUUID().toString() +  ".png";

   			File file = new File(path, singerPhotoFileName);//创建复制的新图片的目录及名字
   			OutputStream os = new FileOutputStream(file);//创建输出流写出文件到指定的File
   			byte[] b = new byte[1024];//创建字节数组用于获取从原目录读出的字节流
   			int bs = 0;//每次读取到的字节长度
   			while ((bs = is.read(b)) > 0) {
   				os.write(b, 0, bs);//写入每次读取到的字节write(byte[],int off,int length)
   			}
   			is.close();
   			os.close();
   	 	}
        if(singerPhoto != null)
        	singer.setSingerfilepath("upload/" + singerPhotoFileName);//设置新添加的食物的Filepath
        else
        	singer.setSingerfilepath("upload/NoImage.jpg");
        
        singerDao.AddSinger(singer);
		return "message_singer";
		
	}
	/*public String addSinger() throws Exception{
		singerDao.AddSinger(singer);
		return "message_singer";
		
	}*/
	public String showSinger() throws Exception{
		singerList=singerDao.QueryAllSingers();
		return "show_singers";
	}
	public String showDetail() throws Exception{
		singer=singerDao.GetSingerById(singer.getSingerid());
		return "detail_singer";
	}
	public String showEdit() throws Exception{
		singer=singerDao.GetSingerById(singer.getSingerid());
		return "edit_singer";
		
	}
	public String editSinger() throws Exception{
		Singer reSinger=singerDao.GetSingerById(singer.getSingerid());
		reSinger.setSingername(singer.getSingername());
		reSinger.setIntroduction(singer.getIntroduction());
		String path = ServletActionContext.getServletContext().getRealPath("/upload"); 
		System.out.println(path);
        /*处理图片上传*/
        if(singerPhoto == null && reSinger.getSingerfilepath()==null)
        	reSinger.setSingerfilepath("upload/NoImage.jpg");
   	 	if(singerPhoto!= null) {
   	 	    String singerPhotoFileName = ""; 
   	 		InputStream is = new FileInputStream(singerPhoto); //生成目录为File的输入流
   			String fileContentType = this.getSingerPhotoContentType();
   			System.out.println(fileContentType);
   			if(fileContentType.equals("image/jpeg")  || fileContentType.equals("image/pjpeg"))//根据图片的类型给要写入的新图片（从File中读出并写入）命名
   				singerPhotoFileName = UUID.randomUUID().toString() +  ".jpg";
   			else if(fileContentType.equals("image/gif"))
   				singerPhotoFileName = UUID.randomUUID().toString() +  ".gif";
   			else if(fileContentType.equals("image/png"))
   				singerPhotoFileName = UUID.randomUUID().toString() +  ".png";

   			File file = new File(path, singerPhotoFileName);//创建复制的新图片的目录及名字
   			OutputStream os = new FileOutputStream(file);//创建输出流写出文件到指定的File
   			byte[] b = new byte[1024];//创建字节数组用于获取从原目录读出的字节流
   			int bs = 0;//每次读取到的字节长度
   			while ((bs = is.read(b)) > 0) {
   				os.write(b, 0, bs);//写入每次读取到的字节write(byte[],int off,int length)
   			}
   			is.close();
   			os.close();
   			reSinger.setSingerfilepath("upload/" + singerPhotoFileName);//设置新添加的食物的Filepath
   	 	}
		singerDao.UpdateSinger(reSinger);
		
		return "edit_singer_message";
		
	}
	public String deleteSinger() throws Exception{
		singerDao.DeleteSinger(singer.getSingerid());
		return "delete_singer";
		
	}
	public File getSingerPhoto() {
		return singerPhoto;
	}
	public void setSingerPhoto(File singerPhoto) {
		this.singerPhoto = singerPhoto;
	}
	public String getSingerPhotoFileName() {
		return singerPhotoFileName;
	}
	public void setSingerPhotoFileName(String singerPhotoFileName) {
		this.singerPhotoFileName = singerPhotoFileName;
	}
	public String getSingerPhotoContentType() {
		return singerPhotoContentType;
	}
	public void setSingerPhotoContentType(String singerPhotoContentType) {
		this.singerPhotoContentType = singerPhotoContentType;
	}
	public List<Singer> getSingerList() {
		return singerList;
	}
	public void setSingerList(List<Singer> singerList) {
		this.singerList = singerList;
	}

}
