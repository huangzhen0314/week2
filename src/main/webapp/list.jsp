<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table>
		<tr>
			<td>
				<form action="list" method="post">
				id:<input type="text" name="id">
				关键字:<input type="text" name="guan">
				描述:<input type="text" name="miaoshu">
				公司名称:<input type="text" name="name">
				主营产品:<input type="text" name="chan"><br>
				
				地址:<input type="text" name="addr"><br>
				注册资本:<input type="text" name="money">
				成立时间:<input type="text" name="startd">
				年检时间:<input type="text" name="yeard">
				年检状态:<input type="text" name="statc"><br>
				<input type="submit" value="搜索">
				</form>
			</td>
		</tr>
		<tr>
			<th>编号</th>
			<th>关键字</th>
			<th>描述</th>
			<th>公司名称</th>
			<th>主营产品</th>
			<th>地址</th>
			<th>注册资本(万元)</th>
			<th>成立时间</th>
			<th>年检日期</th>
			<th>年检状态</th>
			<th>备注</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${plist.list }" var="p">
			<tr>
				<td>${p.id }</td>
				<td>${p.guan }</td>
				<td>${p.miaoshu }</td>
				<td>${p.name }</td>
				<td>${p.chan }</td>
				<td>${p.addr }</td>
				<td>${p.money }</td>
				<td>${p.startd }</td>
				<td>${p.yeard }</td>
				<td>${p.statc }</td>
				<td>${p.beizhu }</td>
				<td>
					<button>
						<a href="selOne?id=${p.id }">年检审核</a>
					</button>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="10">当前${plist.pageNum }/${plist.pages }页，共有${plist.total }条数据
				<c:forEach begin="1" end="${plist.pages }" step="1" var="a">
					<a href="list?pageNum=${a}">${a }</a>
				</c:forEach>
			</td>
		</tr>
	</table>

</body>
</html>