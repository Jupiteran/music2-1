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
    
    <title>全部歌手</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/style1.css"rel="stylesheet"type="text/css">
	<link rel=“stylesheet” href="<%=basePath%>css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/font-awesome.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/main.css">
	
	<link rel="shortcut icon" href="<%=basePath %>images/logo.png">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->  
  <body>
  <div id="box_absolute7">
  <div>
  <c:choose>
		       <c:when test="${user.username ==null}">
		         <a href="login.jsp">登录</a>
		         <a href="reg.jsp">注册</a>
		       </c:when>
		       <c:otherwise>
		         <c:out value="${user.username}"></c:out>欢迎您!
		       </c:otherwise>
  </c:choose>
  </div>
  <header>
  <h1>全部歌手</h1>
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
  <main>
      <ul>
       <li>		        
		            <div class="add"><a href="singer/singer_showAdd"><i class="fa fa-plus"></i> 添加歌手</a></div>
		              <p>
		              <a href="singer/singer_showAdd">
		        <i class="fa fa-plus"></i>      
		              点击上面的链接可以添加歌手
		              
		              </a>
		              </p>		        
	   </li>
	  <s:iterator value="singerList" status="status">
	          <li>
	             <img src="<%=basePath%><s:property value='singerfilepath'/>">
	             <p>
	                <a href="singer/singer_showDetail?singer.singerid=<s:property value='singerid'/>">
	                  <s:property value="singername"/>
	                </a>
	                <a href="singer/singer_showEdit?singer.singerid=<s:property 
	                  value='singerid'/>">
	                  <i class="fa fa-pencil"></i> 
	                </a>
	                &nbsp;&nbsp;delete<a href="singer/singer_deleteSinger?singer.singerid=<s:property 
	                  value='singerid'/>">
	                  <i class="fa fa-trash"></i> 
	                </a>
	             </p>
	          </li>
	   </s:iterator>
	   </ul>
	   </main>
    </div>
    </body>
    </html>