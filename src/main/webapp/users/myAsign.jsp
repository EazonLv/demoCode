<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!doctype html>
<html lang="zh_CN">
<head>
<base href="<%=basePath%>">
<title>${title}</title>
<link href="themes/nzblue/css/css.css" rel="stylesheet" type="text/css" />
<link href="themes/nzblue/css/css_2.css" rel="stylesheet" type="text/css" />
<link href="themes/nzblue/css/nzcms_top.css" rel="stylesheet" type="text/css">
</head>

<body>
	<jsp:include page="header.jsp"></jsp:include>
	<table width="1004" border="0" align="center" cellpadding="1" cellspacing="10" bordercolor="#FFFFFF" bgcolor="#FFFFFF">
		<tr>
			<td align="center" valign="top" bgcolor="#FFFFFF" class="bg_qc">
				<table width="100%" height="27" border="0" cellpadding="8" cellspacing="0" bgcolor="#F6F6F6">
					<tr>
						<td align="left" class="p12">您的位置： <a href="index/index.action">首页</a>&nbsp;&gt;&gt;&nbsp;我的报名申请
						</td>
					</tr>
				</table>
				<table width="95%" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td align="left">
							<div class="z" id="z">
								<table width="99%" border="0" cellpadding="5" cellspacing="1" bgcolor="#E0EDB7">
									<tr>
										<td height="30" colspan="9" align="left" background="themes/nzblue/images/nzcms/list_bg.gif" class="white14B">我的报名申请</td>
									</tr>
									<tr>
										<td align="center" bgcolor="#FFFFFF">报名单号</td>
										<td align="center" bgcolor="#FFFFFF">学生</td>
										<td align="center" bgcolor="#FFFFFF">学校</td>
										<td align="center" bgcolor="#FFFFFF">学位</td>
										<td align="center" bgcolor="#FFFFFF">费用</td>
										<td align="center" bgcolor="#FFFFFF">报名日期</td>
										<td align="center" bgcolor="#FFFFFF">状态</td>
										<td align="center" bgcolor="#FFFFFF">备注</td>
										<td align="center" bgcolor="#FFFFFF">操作</td>
									</tr>
									<c:forEach items="${complainsList}" var="complains">
										<tr align="center" bgcolor="#FFFFFF">
											<td align="center">${complains.title}</td>
											<td align="center">${complains.contents}</td>
											<td align="center">${complains.addtime}</td>
											<td align="center">${complains.status}</td>
											<td align="center">${complains.reps}</td>
										</tr>
									</c:forEach>
									<c:forEach items="${asignList}" var="asign">
										<tr align="center" bgcolor="#FFFFFF">
											<td>${asign.ano}</td>
											<td>${asign.realname}</td>
											<td>${asign.schoolname}</td>
											<td>${asign.degreename}</td>
											<td>${asign.price}</td>
											<td>${asign.addtime}</td>
											<td>${asign.status}</td>
											<td>${asign.memo}</td>
											<td><c:if test="${asign.status eq '未缴费' }">
													<a href="index/prePay.action?id=${asign.asignid}">缴费</a>
												</c:if></td>
										</tr>
									</c:forEach>
								</table>
							</div>
						</td>
					</tr>
				</table>
				<table height="20" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td>${html }</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
