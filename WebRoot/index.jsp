<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
<title>MyMusic</title>

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
<div class="container">
    <div class="row">
      <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
        <div id="carousel1" class="carousel slide">
          <ol class="carousel-indicators">
            <li data-target="#carousel1" data-slide-to="0" class="active"> </li>
            <li data-target="#carousel1" data-slide-to="1" class=""> </li>
            <li data-target="#carousel1" data-slide-to="2" class=""> </li>
          </ol>
          <div class="carousel-inner">
            <div class="item"> <img src="images/img-1e9c6ecc292290486289a13153f07e10.jpg"alt="thumb" width="1920" height="350" class="img-responsive">
              <div class="carousel-caption"> Carousel caption 1. Here goes slide description. Lorem ipsum dolor set amet. </div>
            </div>
            <div class="item active"> <img src="images/img-4e4dd7e660c437de94e4e2b01b9a480d.jpg" alt="thumb" width="1920" height="350" class="img-responsive">
              <div class="carousel-caption"> Carousel caption 2. Here goes slide description. Lorem ipsum dolor set amet. </div>
            </div>
            <div class="item"> <img src="images/img-7e35e9cc6dad29957ca44cbd9852212a.jpg" alt="thumb" width="1920" height="400" class="img-responsive">
              <div class="carousel-caption"> Carousel caption 3. Here goes slide description. Lorem ipsum dolor set amet. </div>
            </div>
          </div>
          <a class="left carousel-control" href="#carousel1" data-slide="prev"><span class="icon-prev"></span></a> <a class="right carousel-control" href="#carousel1" data-slide="next"><span class="icon-next"></span></a></div>
      </div>
</div>
    <hr>
  </div>
  
  <!-- 小图标 -->
<div class="container">
  <div class="row">
    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
      <div class="row">
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-2"><img src="images/1.jpg" alt="Free Shipping" width="40" height="40" class="img-circle"></div>
        <div class="col-lg-6 col-md-9 col-sm-9 col-xs-9">
          <h4><a href="showSingers.jsp">全部歌手</a></h4>
        </div>
      </div>
    </div>
    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
      <div class="row">
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-2"><img src="images/1.jpg" alt="Free Shipping" width="40" height="40" class="img-circle"></div>
        <div class="col-lg-6 col-md-9 col-sm-9 col-xs-9">
          <h4><a href="main.jsp">全部歌曲</a></h4>
        </div>
      </div>
    </div>
  </div>
</div>
<hr>
<h2 class="text-center">MV</h2>
<hr>
<div class="container">
  <div class="row text-center">
    <div class="col-sm-4 col-md-4 col-lg-4 col-xs-6">
      <div class="thumbnail"> <img src="images/2.jpg" alt="Thumbnail Image 1" width="400" height="200" class="img-responsive">
        <div class="caption">
          <h3>冬日特辑</h3>
          <p>Sing for you</p>
          <p><a href="#" class="btn btn-primary" role="button">播放</a></p>
        </div>
      </div>
    </div>
    <div class="col-sm-4 col-md-4 col-lg-4 col-xs-6">
      <div class="thumbnail"> <img src="images/img-ffbba46906ea9100e1bdd46ac90bc223.jpg" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>summer</h3>
          <p>少女时代的夏天！</p>
          <p><a href="#" class="btn btn-primary" role="button"> 播放</a> </p>
        </div>
      </div>
    </div>
    <div class="col-sm-4 col-md-4 col-lg-4 col-xs-6">
      <div class="thumbnail"> <img src="images/img-de5cf6340e3271784c480bcbe74e85ef.jpg" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>lotto</h3>
          <p>少年们强势回归！</p>
          <p><a href="#" class="btn btn-primary" role="button">播放</a> </p>
        </div>
      </div>
    </div>
    <div class="col-sm-4 col-md-4 col-lg-4 col-xs-6 hidden-lg hidden-md hidden-sm">
      <div class="thumbnail"> <img src="img/400X200.gif" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>MV4</h3>
          <p>少年们强势回归！</p>
          <p><a href="#" class="btn btn-primary" role="button"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Add to Cart</a></p>
        </div>
      </div>
    </div>
  </div>
  <div class="row text-center hidden-xs">
    <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
      <div class="thumbnail"> <img src="images/img-6f4da7aee256ebbef6ffef499de68e05.jpg" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>上海演唱会</h3>
          <p>0727上海演唱会</p>
          <p><a href="#" class="btn btn-primary" role="button"> 播放</a> </p>
        </div>
      </div>
    </div>
    <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
      <div class="thumbnail"> <img src="images/img-7d66f0563629631173993df14a06090a.jpg" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>学校2015</h3>
          <p>OST</p>
          <p><a href="#" class="btn btn-primary" role="button"> 播放</a> </p>
        </div>
      </div>
    </div>
    <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
      <div class="thumbnail"> <img src="images/20160404155503.png" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>弹唱</h3>
          <p>林俊杰唱给你听</p>
          <p><a href="#" class="btn btn-primary" role="button">播放</a> </p>
        </div>
      </div>
    </div>
  </div>
    
  <!--下面是表格-->
  <table class ="table table-bordereed">
 <caption class="text-center"><h2>更多歌曲</h2></caption>
  <thead>
  	<tr>
    	<th>歌曲</th>
    	<th>歌手</th>
    	<th>流派</th>
    	<th>点击播放</th>
    </tr>
    </thead>
    <tbody>
    	<tr>
        	<td>Sing for you</td>
            <td>EXO</td>
            <td>POP Music</td>
             <td><a href="#" class="btn btn-primary" role="button">播放</a> </td>
        </tr>
        <tr>
        	<td>弹唱</td>
            <td>林俊杰</td>
            <td>POP Music</td>
             <td><a href="#" class="btn btn-primary" role="button">播放</a> </td>
        </tr>
        <tr>
        	<td>成都</td>
            <td>赵雷</td>
            <td>Folk Music</td>
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
</div>
</body>
</html>