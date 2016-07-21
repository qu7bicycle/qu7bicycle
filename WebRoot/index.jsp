<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>权限管理系统登陆</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<link rel="stylesheet" type="text/css" href="dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="dist/css/bootstrap-theme.min.css">

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="dist/js/bootstrap.min.js"></script>

<style type="text/css">
html,body {
	height: 100%;
}

.box {
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#6699FF',
		endColorstr='#6699FF' ); /*  IE */
	background-image: linear-gradient(bottom, #6699FF 0%, #6699FF 100%);
	background-image: -o-linear-gradient(bottom, #6699FF 0%, #6699FF 100%);
	background-image: -moz-linear-gradient(bottom, #6699FF 0%, #6699FF 100%);
	background-image: -webkit-linear-gradient(bottom, #6699FF 0%, #6699FF 100%);
	background-image: -ms-linear-gradient(bottom, #6699FF 0%, #6699FF 100%);
	margin: 0 auto;
	position: relative;
	width: 100%;
	height: 100%;
}

.login-box {
	width: 100%;
	max-width: 340px;
	height: 400px;
	position: absolute;
	top: 50%;
	margin-top: -200px;
	/*设置负值，为要定位子盒子的一半高度*/
}

@media screen and (min-width:500px) {
	.login-box {
		left: 50%;
		/*设置负值，为要定位子盒子的一半宽度*/
		margin-left: -170px;
	}
}

.form {
	width: 100%;
	max-width: 500px;
	height: 275px;
	margin: 25px auto 0px auto;
	padding-top: 25px;
}

.login-content {
	height: 340px;
	width: 100%;
	max-width: 500px;
	background-color: rgba(255, 250, 2550, .6);
	float: left;
}

.input-group {
	margin: 0px 0px 30px 0px !important;
}

.form-control,.input-group {
	height: 40px;
}

.form-group {
	margin-bottom: 0px !important;
}

.login-title {
	padding: 20px 10px;
	background-color: rgba(0, 0, 0, .6);
}

.login-title h1 {
	margin-top: 10px !important;
}

.login-title small {
	color: #fff;
}

.link p {
	line-height: 20px;
	margin-top: 30px;
}

.btn-sm {
	padding: 8px 24px !important;
	font-size: 16px !important;
}
</style>

</head>

<body>
	<div class="box">
		<div class="login-box">
			<div class="login-title text-center">
				<h1>
					<small>权限管理系统登录</small>
				</h1>
			</div>
			<div class="login-content ">
				<div class="form">
					<form action="login.action" method="post" action="login.action" onsubmit="return validate()">
						<span class="help-block" style="margin-left:15%"> <font
							color="red" id="errorInfo"> <s:fielderror/></font> </span>
						<div class="form-group">
							<div class="col-xs-12  ">
								<div class="input-group">
									<span class="input-group-addon"><span
										class="glyphicon glyphicon-user"></span> </span> <input type="text"
										id="username" name="username" class="form-control"
										placeholder="用户名">
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-12  ">
								<div class="input-group">
									<span class="input-group-addon"><span
										class="glyphicon glyphicon-lock"></span> </span> <input
										type="password" id="password" name="password"
										class="form-control" placeholder="密码">
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-4">
								<label for="checkCode" class="col-sm-2 control-label"> <img
									title="看不清楚请点击" alt="图片加载失败"
									src="SecurityCodeImageAction.action" id="codeImg"> </label>
							</div>
							<div class="col-xs-8">
								<input type="text" class="form-control" id="checkCode"
									placeholder="请输入验证码" name="checkCode">
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-4 col-xs-offset-4 ">
								<button type="submit" class="btn btn-sm btn-info"
									style="position: relative;margin-top:20px">
									<span class="glyphicon glyphicon-off"></span> 登录
								</button>
							</div>
						</div>

					</form>
				</div>
			</div>
		</div>
	</div>



	<script type="text/javascript">
		//进行客户端验证
		function validate() {
			var username = $("#username").val();
			var password = $("#password").val();
			var checkCode = $("#checkCode").val();

			if (username == null || username == "") {
				$("#errorInfo").html("用户名不能为空!");
				return false;
			}

			if (password == null || password == "") {
				$("#errorInfo").html("密码不能为空!");
				return false;
			} 

			if (checkCode == null || checkCode == "") {
				$("#errorInfo").html("验证码不能为空!");
				return false;
			} 
			return true;
		}

		$(document)
				.ready(
						function() {
							$("#codeImg")
									.click(
											function() {
												this.src = "SecurityCodeImageAction.action?timestamp="
														+ new Date().getTime();
											});

						});
	</script>

</body>
</html>
