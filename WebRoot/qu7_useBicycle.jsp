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
				action="#" method="post" style="margin-top: 140px">
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
						<label for="subject" class="control-label"
							style="font-size: 20px;margin-left: 20px">请输入车牌号</label>
						<div class="templatemo-input-icon-container">
							<input type="text"
								style="height: 70px;font-size:40px;width:180px;margin-left: 20px"
								class="form-control" id="subject" >
						</div>
					</div>
				</div>
			
				<div class="form-group">
					<div class="col-md-12">
						<a href="./qu7_getCode.jsp"> <input type="button" value="用车"
							class="btn btn-success pull-right">
						</a>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
