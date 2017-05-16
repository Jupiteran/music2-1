<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Country music</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
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
      <a class="navbar-brand" href="index.html">MyMusic</a> </div>
    
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse">
      <ul class="nav navbar-nav">
        <li class="active"><a href="login.jsp">登录 <span class="sr-only">(current)</span></a> </li>
        <li><a href="reg.jsp">注册</a> </li>
        <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">全部··· <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="singer/singer_showSinger">全部歌手</a> </li>
            <li><a href="song/song_showSong">全部歌曲</a> </li>
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
    <!-- /.navbar-collapse --> 
  </div>
  <!-- /.container-fluid --> 
</nav>
<div class="title">
<div align="center">
  <h1>Country Music</h1>
  <p>回归田园，享受自然</p>
</div>
</div>
<hr>
<div id="carousel1" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carousel1" data-slide-to="0" class="active"></li>
    <li data-target="#carousel1" data-slide-to="1"></li>
    <li data-target="#carousel1" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner" role="listbox">
    <div class="item active"><img src="images/0b46f21fbe096b631c6037e60c338744ebf8ac0f.jpg" alt="First slide image" width="1240" height="500" class="center-block" >
      <div class="carousel-caption"  align="center">
        <h3>MV1</h3>
        <p>First slide Caption</p>
      </div>
    </div>
    <div class="item"><img src="images/img-1c8cf888fadf3aaf7f0005cd2f45f6f3.jpg" alt="Second slide image" width="1240" height="500" class="center-block">
      <div class="carousel-caption">
        <h3>MV2</h3>
        <p>Second slide Caption</p>
      </div>
    </div>
    <div class="item"><img src="images/img-9f99fc565a2172a35a77e2ce988ab75c.jpg" alt="Third slide image" width="1240" height="500" class="center-block">
      <div class="carousel-caption">
        <h3>MV3</h3>
        <p>Third slide Caption</p>
      </div>
    </div>
  </div>
  <a class="left carousel-control" href="#carousel1" role="button" data-slide="prev"><span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span><span class="sr-only">Previous</span></a><a class="right carousel-control" href="#carousel1" role="button" data-slide="next"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span><span class="sr-only">Next</span></a></div>   <hr>
<h2 class="text-center">MV</h2>
<hr>
<div class="container">
	<div class="col-sm-4 col-md-4 col-lg-4 col-xs-6">
      <div class="thumbnail"> <img src="images/img-9aca1fd9e0312e8692460b38e401f82c.jpg" alt="Thumbnail Image 1" width="400" height="200" class="img-responsive">
        <div class="caption">
          <h3>MV1</h3>
          <p>少年们强势回归！</p>
          <p><a href="#" class="btn btn-primary" role="button">播放</a></p>
        </div>
      </div>
    </div>
<div class="col-sm-4 col-md-4 col-lg-4 col-xs-6">
      <div class="thumbnail"> <img src="images/img-9aca1fd9e0312e8692460b38e401f82c.jpg" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>MV2</h3>
          <p>少年们强势回归！</p>
          <p><a href="#" class="btn btn-primary" role="button"> 播放</a> </p>
        </div>
      </div>
    </div>
    <div class="col-sm-4 col-md-4 col-lg-4 col-xs-6">
      <div class="thumbnail"> <img src="images/img-9aca1fd9e0312e8692460b38e401f82c.jpg" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>MV3</h3>
          <p>少年们强势回归！</p>
          <p><a href="#" class="btn btn-primary" role="button">播放</a> </p>
        </div>
      </div>
    </div>
    <!--下面是表格-->
  <table class ="table table-bordereed">
 <caption class="text-center"><h2>更多歌曲</h2></caption>
  <thead>
  	<tr>    	
  	    <th>序号</th>
    	<th>歌曲</th>
    	<th>歌手</th>
    	<th>点击播放</th>
    </tr>
    </thead>
    <tbody>
    	<tr>
    	    <td>01</td>
        	<td>Sing for you</td>
            <td>EXO</td>
             <td><a href="#" class="btn btn-primary" role="button">播放</a> </td>
        </tr>
        <tr>
            <td>02</td>
        	<td>弹唱</td>
            <td>林俊杰</td>
             <td><a href="#" class="btn btn-primary" role="button">播放</a> </td>
        </tr>
        <tr>
        	<td>03</td>
            <td>赵雷</td>
            <td>成都</td>
            <td><a href="#" class="btn btn-primary" role="button">播放</a> </td>
         </tr>
          <tr>
        	<td>  </td>
            <td>  </td>
            <td>  </td>
            <td><a href="add.jsp">添加歌曲</a> </td>
         </tr>
         </tbody>
         </table>
  
    </div>
      <hr>
<div class="container well">
  <div class="row">
      <div class="col-xs-6 col-sm-6 col-md-6 col-lg-7">
        <div class="row">
          <div class="col-sm-4 col-md-4 col-lg-4  col-xs-6">
            <div>
              <ul class="list-unstyled">
                <li> <a>音悦台</a> </li>
              </ul>
            </div>
          </div>
          <div class="col-sm-4 col-md-4 col-lg-4 col-xs-6">
            <div>
              <ul class="list-unstyled">
                <li> <a>QQ音乐</a> </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      <div class="col-xs-6 col-sm-6 col-md-6 col-lg-5"> 
        <address>
        <strong>MyMusic</strong><br>
        所有权归最帅的人和最美的人<br>
        <abbr title="Phone">P:</abbr> (010) 123-4567
      </address>
        <address>
        <strong>邮箱地址</strong><br>
        <a href="mailto:#">jipiteran@163.com</a>
        </address>
      </div>
  </div>
</div>

<footer class="text-center">
  <div class="container">
    <div class="row">
      <div class="col-xs-12">
        <p>Copyright © MyMusic. All rights reserved.</p>
      </div>
    </div>
  </div>
</footer>
<script src="js/jquery-1.11.2.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
</body>
</html>
