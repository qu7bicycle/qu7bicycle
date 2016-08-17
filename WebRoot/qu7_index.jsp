<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>趣骑</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" type="image/x-icon" href="<%=request.getContextPath()%>/images/favicon.ico" />  
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap-theme.min.css" rel="stylesheet"
	type="text/css">
<link href="css/bootstrap-social.css" rel="stylesheet" type="text/css">
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	/* 	function login() {
	 alert("login");
	 window.location.href = "./first_display.jsp";

	 } */
</script>
</head>
<body class="templatemo-bg-image-1">
	<div class="container" >
		<div class="col-md-12" >
			<form class="form-horizontal templatemo-login-form-2" role="form" style="margin-top: 40px;height: 500px"
				action="<%=request.getContextPath()%>/loginAction_login.action" method="post">
				<div class="row">
					<div class="col-md-12">
						<img src="images/logo1.png" width="220px">
					</div>
				</div>
				<div class="row">
					<div class="templatemo-one-signin col-md-6"
						style="margin-left: 30px;border: 0;">
						<div class="form-group">
							<div class="col-md-12">
								<label for="username" class="control-label">手机号</label>
								<div class="templatemo-input-icon-container">
									<i class="fa fa-user"></i> 
									<input type="text" class="form-control" name="form_User.phone" id="username" placeholder="">
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-12">
								<label for="username" class="control-label">验证码</label>
								<div class="templatemo-input-icon-container">
									<i class="fa fa-lock"></i>
									<input type="text" style="width: 200px" class="form-control" id="password"
										placeholder="" name="verifyCode">
									<img alt="点击切换" src="<%=request.getContextPath()%>/SecurityCodeImageAction.action">
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-12">
								<label for="password" class="control-label">短信验证码</label>
								<div class="templatemo-input-icon-container">
									<i class="fa fa-lock"></i> <input type="password"
										class="form-control" id="password" name="form_User.pwd" placeholder="">
								</div>
							</div>
						</div>
						<!-- <div class="form-group">
							<div class="col-md-12">
								<div class="checkbox">
									<label> <input type="checkbox"> Remember me
									</label>
								</div>
							</div>
						</div> -->
						<div class="form-group">
							<div class="col-md-12">
								<a href="./qu7_display.jsp"> <input type="button"
									style="font-size: 18px;font-family: '楷体'"
									value="登&nbsp;&nbsp;&nbsp;陆" class="btn btn-warning"></a>

							</div>
						</div>
						<!-- <div class="form-group">
							<div class="col-md-12">
								<a href="forgot-password.html" class="text-center">Cannot
									login?</a>
							</div>
						</div> -->
					</div>
					<!-- 	<div class="templatemo-other-signin col-md-6">
						<label class="margin-bottom-15"> One-click sign in using
							other services. Credit goes to <a rel="nofollow"
							href="http://lipis.github.io/bootstrap-social/">Bootstrap
								Social</a> for social sign in buttons.
						</label> <a class="btn btn-block btn-social btn-facebook margin-bottom-15">
							<i class="fa fa-facebook"></i> Sign in with Facebook
						</a> <a class="btn btn-block btn-social btn-twitter margin-bottom-15">
							<i class="fa fa-twitter"></i> Sign in with Twitter
						</a> <a class="btn btn-block btn-social btn-google-plus"> <i
							class="fa fa-google-plus"></i> Sign in with Google
						</a>
					</div> -->
				</div>
			</form>
		</div>
	</div>
</body>
</html>
