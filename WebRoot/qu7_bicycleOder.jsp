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
	color: white;
}
</style>
</head>
<body class="templatemo-bg-image-2">
	<div class="container">
		<div class="col-md-12">
			<form class="form-horizontal templatemo-contact-form-1" role="form"
				action="#" method="post" style="margin-top: 140px">
				<div class="form-group">
					<%-- <a href="./first_display.jsp"> <input type="button"
						style="background-color:transparent;border:0;font-size: 20px;width: 50px;margin-left: 30px;margin-top: 30px;"
						value="<-">
					</a> --%>
					<div class="col-md-12" align="center">
						<h1 class="margin-bottom-15">用车记录</h1>
						<!-- <p>
							This contact form is provided by <a href="#">templatemo</a> that
							can be used for your websites. Credit goes to <a rel="nofollow"
								href="#">Unsplash</a> for the background image.
						</p> -->
					</div>
				</div>
				<div class="form-group" align="center">
					<table
						style="border: 1px solid black;margin-left: 40px;height: 200px;width: 300px"
						border=1>
						<tr>
							<td>时间</td>
						<!-- 	<td>车牌号</td> -->
							<td>费用（元）</td>
							<!-- <td>行程（公里）</td> -->
							<td>是否支付</td>
						</tr>
						<tr>
							<td>2016-7-11</td>
							<!-- <td>1100</td> -->
							<td>1.6</td>
							<!-- <td>12</td> -->
							<td align="center">是</td>
						</tr>
						<tr>
							<td>2016-7-12</td>
							<!-- <td>3200</td> -->
							<td>1.6</td>
							<!-- <td>12</td> -->
							<td align="center">是</td>
						</tr>
						<tr>
							<td>2016-7-13</td>
							<!-- <td>3423</td> -->
							<td>2.5</td>
							<!-- <td>12</td> -->
							<td align="center">是</td>
						</tr>
						<tr>
							<td>2016-7-14</td>
							<!-- <td>2343</td> -->
							<td>3.5</td>
							<!-- <td>12</td> -->
							<td align="center"><input type="submit" value="充值"
								class="btn btn-success pull-right"></td>
						</tr>
					</table>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
</html>
