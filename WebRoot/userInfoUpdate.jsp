<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>用户信息修改</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<link rel="stylesheet" type="text/css" href="dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/Iframe.css">


<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="dist/js/bootstrap.min.js"></script>


</head>

<body>
	<table class="table">
   <caption>用户基本信息的修改</caption>
   <tbody>
      <tr class="active">
         <td>用户名</td>
         <td><input type="text" name="name" /></td>
      </tr>
      <tr class="success">
         <td>密码</td>
         <td><input type="password" placeholder="请输入新密码" />(仅在需要修改密码时填写此行)</td>
      </tr>
      <tr  class="warning">
         <td>确认密码</td>
         <td><input type="password" name="password2" placeholder="确认新密码"  />(仅在需要修改密码时填写此行)</td>
      </tr>
      <tr  class="danger">
         <td>邮箱</td>
         <td><input type="text" name="email" /></td>
      </tr>
      <tr class="active">
         <td>电话</td>
         <td><input type="text" name="phone" /></td>
      </tr>
      <tr class="success">
         <td>地址</td>
         <td><input type="text" name="address" /></td>
      </tr>
      <tr  class="warning">
         <td>性别</td>
         <td>
         	
         </td>
      </tr>
      <tr  class="danger">
         <td>所属机构</td>
         <td></td>
      </tr>
   </tbody>
</table>
</body>
</html>
