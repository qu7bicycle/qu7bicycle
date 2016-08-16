<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css">
</head>
<body class="templatemo-bg-image-2">
	<div class="container">
		<div class="col-md-12">
			<form class="form-horizontal templatemo-contact-form-1" role="form"
				action="#" method="post"style="margin-top: 140px">
				<div class="form-group">
					<div class="col-md-12">
						<!-- 	<h1 class="margin-bottom-15">我要用车</h1> -->
						<!-- <p>
							This contact form is provided by <a href="#">templatemo</a> that
							can be used for your websites. Credit goes to <a rel="nofollow"
								href="#">Unsplash</a> for the background image.
						</p> -->
					</div>
				</div>
				

				<div class="form-group">
					<div class="col-md-12" align="center">
						<label for="subject" class="control-label" style="font-size: 30px;margin-left: 20px">解锁密码是</label>
						<div class="templatemo-input-icon-container">
							<font size="30px" style="margin-left:20px">2834</font>
						</div>
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-md-12" align="center">
						<a href="./qu7_display.jsp"> <input type="button"
							style="font-size: 18px;font-family: '楷体';width: 200px;margin-left: 20px"
							value="结&nbsp;束&nbsp;用&nbsp;车" class="btn btn-warning">
						</a>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
</html>
