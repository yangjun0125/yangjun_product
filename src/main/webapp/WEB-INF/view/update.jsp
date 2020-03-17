<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<form action="updateid" method="post">
		<table class=".table">
			<tr>
				<td>制造部信息</td>
			</tr>
			<tr>
				<td>联络单号：<input type="text" name="lid" value="${jiagong.lid }"></td>
				<td>报送日期:<input type="date" name="created" value="${jiagong.created }"></td>
			</tr>
			<tr>
				<td>制造部：<input type="text" name="zname" value="${jiagong.zname }"></td>
				<td>报送日期:<input type="text" name="zid" value="${jiagong.zid }"></td>
			</tr>
			<tr>
				<td>配件名称：<input type="text" name="pname" value="${jiagong.pname }"></td>
				<td>配件编号:<input type="text" name="pid" value="${jiagong.pid }"></td>
			</tr>
			<tr>
				<td>参考单价：<input type="text" name="price" value="${jiagong.price }"></td>
				<td>数量:<input type="text" name="num" value="${jiagong.num }"></td>
				<td>金额:<input type="text" name="numprice" value="${jiagong.numprice }"></td>
			</tr>
			
			<tr>
				<td>设备部信息</td>
			</tr>
			<tr>
				<td>具体技术要求：<input type="text" name="content" value="${jiagong.content }"></td>
			</tr>
			<tr>
				<td>设备部编号：<input type="text" name="sid" value="${jiagong.sid }"></td>
				<td>设备部：<input type="text" name="sname" value="${jiagong.sname }"></td>
				<td>配件外送时间：<input type="date" name="" value="${jiagong.screated }"></td>
				<td>审核单价：<input type="text" name="sprice" value="${jiagong.sprice}"></td>
				<td>审核金额：<input type="text" name="snumprice" value="${jiagong.snumprice }"></td>
			</tr>
			
			
			<tr>
				<td>物流加工交易信息</td>
			</tr>
			<tr>
				<td>发货确认人：<input type="text" name="fname" value="${jiagong.fname }"></td>
				<td>加工检验图片上传:<input type="file" name="pic" value="${jiagong.pic }"></td>
			</tr>
			<tr>
				<td>加工单位：<input type="text" name="fjname" value="${jiagong.fjname }"></td>
				<td>联系人：<input type="text" name="tname" value="${jiagong.tname }"></td>
			</tr>
			<tr>
				<td>加工单位单价：<input type="text" name="fprice" value="${jiagong.fprice }"></td>
				<td>加工单位金额:<input type="text" name="fnumprice" value="${jiagong.fnumprice }"></td>
			</tr>
			<tr>
				<td>配件送回时间：<input type="date" name="deadate" value="${jiagong.deadate }"></td>
				<td>收获确认人:<input type="text" name="fqname" value="${jiagong.fqname }"></td>
			</tr>
			<tr>
				<td>采购部报销人：<input type="date" name="fbname" value="${jiagong.fbname }"></td>
				<td>采购部报销人:<input type="text" name="fbname2" value="${jiagong.fbname2 }"></td>
			</tr>
			<tr>
				<td>备注:<input type="text" name="bz" value="${jiagong.bz }"></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>