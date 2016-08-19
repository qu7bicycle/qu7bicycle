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
<link href="css/bootstrap-social.css" rel="stylesheet" type="text/css">
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css">
</head>
<body class="templatemo-bg-image-1">
	<div class="container">
		<div class="col-md-12">
			<form class="form-horizontal templatemo-login-form-2" role="form"
				action="#" method="post">
				<div class="row">
					<div class="col-md-12">
						<h1>趣骑Bicycle</h1>
					</div>
				</div>
				<div class="row" align="center">
					<div align="center"
						style="border: 1px solid yellow;width: 230px;height:60px;margin-bottom: 20px">
						广告部分</div>
				</div>
				<div class="row" align="center">
					<div class="form-group" style="width: 250px;">
						<div class="col-md-12">
							<a href="<%=request.getContextPath()%>/userAction_toPersonInfo.action"><input type="button"
								style="font-size: 18px;font-family: '楷体'"
								value="个&nbsp;人&nbsp;信&nbsp;息" class="btn btn-warning"></a>

						</div>
					</div>
					<div class="form-group" style="width: 250px">
						<div class="col-md-12">
							<a href="./qu7_signup.jsp"> <input type="button"
								style="font-size: 18px;font-family: '楷体'"
								value="信&nbsp;息&nbsp;认&nbsp;证" class="btn btn-warning">
							</a>
						</div>
					</div>
					<div class="form-group" style="width: 250px">
						<div class="col-md-12">
							<a href="./qu7_useBicycle.jsp"> <input type="button"
								style="font-size: 18px;font-family: '楷体'"
								value="我&nbsp;要&nbsp;用&nbsp;车" class="btn btn-warning">
							</a>
						</div>
					</div>
					<div class="form-group" style="width: 250px">
						<div class="col-md-12">
							<a href="./qu7_bicycleOder.jsp"> <input type="button"
								style="font-size: 18px;font-family: '楷体'"
								value="用&nbsp;车&nbsp;记&nbsp;录" class="btn btn-warning">
							</a>
						</div>
					</div>
					<div class="form-group" style="width: 250px">
						<div class="col-md-12">
							<a href="./qu7_index.jsp"> <input type="button"
								style="font-size: 18px;font-family: '楷体'"
								value="退&nbsp;出&nbsp;登&nbsp;陆" class="btn btn-warning">
							</a>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>

