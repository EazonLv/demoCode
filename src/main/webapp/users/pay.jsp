<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>${title}</title>
<link href="themes/nzblue/css/css.css" rel="stylesheet" type="text/css" />
<link href="themes/nzblue/css/css_2.css" rel="stylesheet" type="text/css" />
<link href="themes/nzblue/css/nzcms_top.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="js/ajaxsupplies.js"></script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<table width="1004" border="0" align="center" cellpadding="0" cellspacing="10" bgcolor="#FFFFFF">
		<tr>
			<td align="center" valign="top">
				<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#F5F5F5" class="bg_qc">
					<tr>
						<td width="25" height="20" align="center"><img src="themes/nzblue/images/nzcms.xinxin.gif" alt="标" width="9"
							height="9" /></td>
						<td align="left" class="p12">您的位置： <a href="index.jsp">首页</a>&nbsp;&gt;&nbsp;&nbsp;付款
						</td>
					</tr>
				</table>
				<table height="30" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td></td>
					</tr>
				</table>
				<form action="index/pay.action" name="myform">
					<table width="46%" border="0" cellpadding="5" cellspacing="1" bgcolor="#E0EDB7">
						<tr>
							<td height="30" colspan="2" align="center" background="themes/nzblue/images/nzcms/list_bg.gif" class="white14B">付款</td>
						</tr>
						<tr>
							<td width="80" height="50" align="right" bgcolor="#FFFFFF">报名单号：</td>
							<td bgcolor="#FFFFFF">${asign.ano }<input type="hidden" name="id" id="id" value="${asign.asignid }"
								readonly="readonly" /></td>
						</tr>
						<tr>
							<td width="80" height="50" align="right" bgcolor="#FFFFFF">金额：</td>
							<td bgcolor="#FFFFFF">${asign.price }</td>
						</tr>
						<tr>
							<td width="80" height="50" align="right" bgcolor="#FFFFFF">付款银行：</td>
							<td bgcolor="#FFFFFF"><select name="cateid" style="width: 260px; height: 30px" id="cateid">
									<option value="中国工商银行">中国工商银行</option>
									<option value="中国农业银行">中国农业银行</option>
									<option value="中国建设银行">中国建设银行</option>
									<option value="中国交通银行">中国交通银行</option>
									<option value="招商银行">招商银行</option>
									<option value="支付宝">支付宝</option>
							</select></td>
						</tr>
						<tr>
							<td width="80" height="50" align="right" bgcolor="#FFFFFF">卡号：</td>
							<td bgcolor="#FFFFFF"><input type="text" id="num" style="width: 260px; height: 30px" placeholder="请输入卡号" /></td>
						</tr>
						<tr>
							<td width="80" height="50" align="right" bgcolor="#FFFFFF">支付密码：</td>
							<td bgcolor="#FFFFFF"><input type="password" id="memo" style="width: 260px; height: 30px"
								placeholder="请输入支付密码" /></td>
						</tr>
						<tr>
							<td bgcolor="#FFFFFF" colspan="2" align="center"><label> <input type="submit" name="Submit"
									value="提交" /> &nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" name="Submit2" value="重置" /><input type="hidden"
									id="basepath" value="<%=basePath%>" />
							</label></td>
						</tr>
					</table>
				</form>
				<table height="50" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
