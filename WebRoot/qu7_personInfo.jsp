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
<style type="text/css">
* {
	font-size: 20px;
}
</style>
</head>
<body class="templatemo-bg-image-2">
	<div class="container">
		<div class="col-md-12">
			<form class="form-horizontal templatemo-contact-form-1" role="form"
				action="#" method="post">

				<div class="form-group">
					<%-- <a href="./first_display.jsp"> <input type="button"
						style="background-color:transparent;border:0;font-size: 20px;width: 50px;margin-left: 30px;margin-top: 30px;"
						value="<-">
					</a> --%>
					<div class="col-md-12">
						<h1 class="margin-bottom-15">个人信息</h1>
						<!-- <p>
							This contact form is provided by <a href="#">templatemo</a> that
							can be used for your websites. Credit goes to <a rel="nofollow"
								href="#">Unsplash</a> for the background image.
						</p> -->
					</div>
				</div>

				<div class="form-group">
					<div class="col-md-12">
						<label for="name" class="control-label">手机号 ：</label> 150150150
						<div class="templatemo-input-icon-container">
							<!-- 	<i class="fa fa-user"></i> -->
							<!--  <input type="text"
								class="form-control" id="name" placeholder=""> -->
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-md-12">
						<label for="name" class="control-label">账户余额：</label> 1000.50 <input
							type="submit" value="充值" class="btn btn-success pull-right">
						<div class="templatemo-input-icon-container">
							<!-- 	<i class="fa fa-user"></i> -->
							<!--  <input type="text"
								class="form-control" id="name" placeholder=""> -->
						</div>
					</div>
				</div>
				<!--   <div class="form-group">
		          <div class="col-md-12">
		            <label for="email" class="control-label">Email *</label>
		            <div class="templatemo-input-icon-container">
		            	<i class="fa fa-envelope-o"></i>
		            	<input type="email" class="form-control" id="email" placeholder="">
		            </div>
		          </div>
		        </div> -->
				<div class="form-group">
					<div class="col-md-12">
						<label for="website" class="control-label">学校 ：</label>待认证
						<div class="templatemo-input-icon-container">
							<!-- <i class="fa fa-globe"></i> <input type="text"
								class="form-control" id="website" placeholder=""> -->

						</div>
					</div>
				</div>

				<div class="form-group">
					<div class="col-md-12">
						<label for="subject" class="control-label">专业 ：</label>待认证
						<div class="templatemo-input-icon-container">
							<!-- <i class="fa fa-info-circle"></i> <input type="text"
								class="form-control" id="subject" placeholder=""> -->

						</div>
					</div>
				</div>
				<!-- 	<div class="form-group">
					<div class="col-md-12">
						<label for="website" class="control-label">上传证件照片*</label>
						<div class="templatemo-input-icon-container">
							<i class="fa fa-globe"></i> <input type="file"
								class="form-control" id="website" placeholder="">
									待认证
						</div>
					</div>
				</div> -->
				<!--         <div class="form-group">
		          <div class="col-md-12">
		            <label for="message" class="control-label">Message *</label>
		            <div class="templatemo-input-icon-container">
		            	<i class="fa fa-pencil-square-o"></i>
		            	<textarea rows="8" cols="50" class="form-control" id="message" placeholder=""></textarea>
		            </div>
		          </div>
		        </div> -->
				<!--   <div class="form-group">
		          <div class="col-md-12">
		            <div class="checkbox">
		                <label>
		                  <input type="checkbox"> Send a copy to my email.
		                </label>
		            </div>		            
		          </div>
		        </div> -->
				<!-- <div class="form-group">
					<div class="col-md-12">
						<input type="submit" value="认证" class="btn btn-success pull-right">
					</div>
				</div> -->

			</form>
		</div>
	</div>
</body>
</html>
</html>
