<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>系统属性设置</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<link rel="stylesheet" type="text/css" href="dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/Iframe.css">


<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="dist/js/bootstrap.min.js"></script>


</head>

<body>
	<span class="cp_title">系统属性管理</span>
	<c:if test="${adminUser.name == 'admin'}">
		<div class="add_cp">
			<a href="#">+添加属性</a>
		</div>
	</c:if>
	<div class="table_con">
		<table>
			<tr class="tb_title">
				<td width="18%">属性名称</td>
				<td width="18%">属性值</td>
				<td width="18%">属性描述</td>
				<c:if test="${adminUser.name == 'admin'}">
					<td width="26%">操作</td>
				</c:if>
			</tr>
			<c:if test="${adminUser.name == 'admin'}">
				<c:forEach var="sysPros" items="${sysProperties}" varStatus="status">
					<tr>
						<td width="18%">${sysPros.name}</td>
						<td width="18%">${sysPros.value}</td>
						<td width="18%">${sysPros.des}</td>
						<td width="26%"><input class="bj_btn" type="button"
							value="编辑" /> <input class="del_btn" type="button" value="删除" />
						</td>
					</tr>
				</c:forEach>
			</c:if>
			<c:if test="${adminUser.name != 'admin'}">
				<c:forEach var="sysPros" items="${sysProperties}" varStatus="status">
					<tr>
						<td width="18%">${sysPros.name}</td>
						<td width="18%">${sysPros.value}</td>
						<td width="18%">${sysPros.des}</td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
		<table style="position:relative;left:20%">
			<tr>
				<td width="10%"><button class="btn btn-large btn-primary" type="button" onclick="pageChange(0,0)">首页</button></td>
				<td width="10%"><button class="btn btn-large btn-success" type="button" onclick="pageChange(0,${myPage.prePage})">上一页</button></td>
				<td  width="10%"><button class="btn btn-large btn-danger" type="button" onclick="pageChange(0,${myPage.nextPage})">下一页</button></td>
				<td><button class="btn btn-large btn-warning" type="button" onclick="pageChange(0,${myPage.totalPage})">末页</button></td>
			</tr>
		</table>
	</div>
	
	<script type="text/javascript">
		function pageChange(type, pageNum) {
			window.location.href="sysPropertiesPage.action?pno="+pageNum;
		}
	</script>
	
</body>
</html>
