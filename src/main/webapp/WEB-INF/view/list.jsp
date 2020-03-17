<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="/resource/bootstrap.min.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<form action="list">
	<input type="button" value="增加" onclick="zj()">
	联络单号：<input type="text" name="lid" value="${jia.lid}">
	制造部单号：<input type="text" name="zid" value="${jia.zid}">
	内容：<input type="text" name="content" value="${jia.content}">
	备注：<input type="text" name="bz" value="${jia.bz}">
	推送日期：<input type="date" name="created" value="${jia.created}">
	至：<input type="date" name="deadate" value="${jia.deadate}">
	加工单位：<input type="text" name="fjname" value="${jia.fjname}">
	联系人：<input type="text" name="fname" value="${jia.fname}">
	收获确认人：<input type="text" name="content" value="${jia.content}">
	采购后报销人：<input type="text" name="fbname" value="${jia.fbname}">
	设备部：<input type="text" name="sname" value="${jia.sname}">
	<input type="submit" value="查询">
</form>
	<table class="table">
		<tr>
			<td>推送日期</td>
			<td>联络单</td>
			<td>制造部编号</td>
			<td>制造部</td>
			<td>配件编号</td>
			<td>参考单价</td>
			<td>数量</td>
			<td>金额</td>
			<td>设备部编号</td>
			<td>设备部名称</td>
			<td>具体技术要求</td>
			<td>审核单价</td>
			<td>审核金额</td>
			<td>配件外送时间</td>
			<td>加工检验</td>
			<td>配件送回时间</td>
		</tr>
		<c:forEach items="${info.list }" var="j">
			<tr>
				<td><fmt:formatDate value="${j.created }" pattern="yyyy-MM-dd HH:ss:mm"/></td>
				<td>${j.lid }</td>
				<td>${j.zid }</td>
				<td>${j.pname }</td>
				<td>${j.pid }</td>
				<td>${j.price }</td>
				<td>${j.num }</td>
				<td>${j.numprice }</td>
				<td>${j.sid }</td>
				<td>${j.sname }</td>
				<td>${j.content }</td>
				<td>${j.sprice }</td>
				<td>${j.snumprice }</td>
				<td><fmt:formatDate value="${j.screated }" pattern="yyyy-MM-dd HH:ss:mm"/></td>
				<td>${j.fjname }</td>
				<td><fmt:formatDate value="${j.deadate }" pattern="yyyy-MM-dd HH:ss:mm"/></td>
				<td><a href="update?id=${j.id} ">修改</a></td>
			</tr>
		</c:forEach>
	</table>
	<jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include>
	<script type="text/javascript">
		function goPage(page) {
			location.href="list?page="+page;
		}
		function zj() {
			location="jiagong";
		}
	</script>
</body>
</html>