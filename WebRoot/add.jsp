<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>


<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>添加音乐</title>

<!-- Bootstrap -->
<link rel="stylesheet" href="css/bootstrap.css">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<nav>
   <div class="container">    
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
      <a class="navbar-brand" href="index.jsp">MyMusic</a> </div>
    
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse">
      <ul class="nav navbar-nav">
        <li class="active"><a href="login.jsp">登录 <span class="sr-only">(current)</span></a> </li>
        <li><a href="reg.jsp">注册</a> </li>
        <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">全部··· <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="showSingers.jsp">全部歌手</a> </li>
            <li><a href="main.jsp">全部歌曲</a> </li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-right" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="搜索歌曲/歌手/流派">
        </div>
        <button type="submit" class="btn btn-default">搜索</button>
      </form>
      <ul class="nav navbar-nav navbar-right hidden-sm">
        <li><a href="index.jsp">回到首页</a> </li>
        <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">流派 <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="pop music.jsp">POP</a> </li>
            <li><a href="country music.jsp">country</a> </li>
            <li><a href="folk music.jsp">folk</a> </li>
            <li><a href="Rhythm and Blues.jsp">R&B</a> </li>
            <li><a href="Rock and Roll.jsp">rock</a> </li>
          </ul>
        </li>
      </ul>
    </div>
    <!-- /.navbar-collapse --> 
  </div>
  </div>
</nav>

<body>
<footer class="text-center">
    <div class="container1" align="right">
		<div class="well">
      <h3 class="text-center">添加音乐</h3>
        <form action="song/song_addSong" enctype="multipart/form-data" method="post">
          <div class="form-group">
            
            <label for="location1" class="control-label"></label>
            <div class="input-group">
              <div class="input-group-addon">歌曲名称</div>
              <input type="text" class="form-control input-sm"  id="song.name"  required>
              </div>
          </div>
          
          <label for="location1" class="control-label"></label>
            <div class="input-group">
              <div class="input-group-addon">演唱歌手</div>
              <input type="text" class="form-control input-sm"  id="song.singer.singername"required>
              </div>
			   
		<label for="location1" class="control-label"></label>
            <div class="input-group">
              <div class="input-group-addon">所属专辑</div>
              <input type="text" class="form-control input-sm"  id="song.album.albumname"required>
              </div>
        
          <label for="location1" class="control-label"></label>
   			<div class="input-group">
              <div class="input-group-addon">所属流派</div>
              <input type="text" class="form-control input-sm"  id="song.genre.genrename"required>
              </div>
  				
  			<label for="location1" class="control-label"></label>	
  			<div class="input-group">
              <div class="input-group-addon">歌曲路径</div>
              <input type="file" class="form-control input-sm"  id="songpath"required>
              </div>
          
           <p class="text-center">
          	<p><button type="submit" >提交</button></p>
          </p>
</div>
   </footer>
   
<footer class="text-center">
  <div class="container">
    <div class="row">
      <div class="col-xs-12">
        <p>Copyright © MyWebsite. All rights reserved.</p>
      </div>
    </div>
  </div>
  </footer>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> 
<script src="js/jquery-1.11.2.min.js"></script> 
<!-- Include all compiled plugins (below), or include individual files as needed --> 
</body>
</html>
