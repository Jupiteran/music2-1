<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
    <base href="<%=basePath%>">
    
    <title>歌曲详情</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/style1.css"rel="stylesheet"type="text/css">
	<link rel="shortcut icon" href="<%=basePath %>images/logo.png">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->  
  <body>
  <div id="box_absolute7">
<header>
<h1>音乐详情</h1>
<nav>
<ul>
<li><a href="index.jsp">首页</a></li>
<li><a href="song/song_showSongByGenre?song.genre.genreid=1">流行乐</a></li>
<li><a href="song/song_showSongByGenre?song.genre.genreid=2">乡村乐</a></li>
<li><a href="song/song_showSongByGenre?song.genre.genreid=3">民谣乐</a></li>
<li><a href="song/song_showSongByGenre?song.genre.genreid=4">蓝调乐</a></li>
<li><a href="song/song_showSongByGenre?song.genre.genreid=5">摇滚乐</a></li>
</ul>
</nav>
</header>
    <p>歌曲名称: <c:out value="${song.name}"></c:out></p>
    <p>演唱歌手: <c:out value="${song.singer.singername}"></c:out></p>
    <p>所属专辑: <c:out value="${song.album.albumname}"></c:out></p>
    <p>歌曲流派: <c:out value="${song.genre.genrename}"></c:out></p>
    <p><audio controls>
	        <source src="${song.filepath}" type="${song.contentType}"></source>
        </audio></p>
   </div> 
    </body>
    </html>