<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css"
	rel="stylesheet">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<form action="update" method="post">
	关键字:<input type="text" name="guan" value="${goods.guan }">
	描述:<input type="text" name="miaoshu" value="${goods.miaoshu }"><br>
	编号:<input type="text" name="id" value="${goods.id }">
	公司名称:<input type="text" name="name" value="${goods.name }"><br>
	主营产品:<input type="text" name="chan" value="${goods.chan }">
	注册资本:<input type="text" name="addr" value="${goods.money }">
	成立时间:<input type="text" name="miaoshu" value="${goods.startd }"><br>
	年检时间:<input type="text" name="yeard">
	年检状态:<input type="text" value="${goods.beizhu }">
	备注:<input type="text" name="miaoshu" value="各种资料齐全合格">
	</form>
</body>
</html>