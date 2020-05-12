<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>${title }</title>
<link href="themes/nzblue/css/css.css" rel="stylesheet" type="text/css" />
<link href="themes/nzblue/css/css_2.css" rel="stylesheet" type="text/css" />
<link href="themes/nzblue/css/nzcms_top.css" rel="stylesheet" type="text/css">
</head>

<body>
	<jsp:include page="header.jsp"></jsp:include>
	<table width="1004" border="0" align="center" cellpadding="0" cellspacing="8" bgcolor="#FFFFFF">
		<tr valign="top">
			<td align="center">
				<table width="98%" border="0" cellpadding="0" cellspacing="0" bgcolor="#F5F5F5" class="bg_qc">
					<tr>
						<td width="25" height="20" align="center"><img src="themes/nzblue/images/nzcms.xinxin.gif" alt="标" /></td>
						<td align="left" class="p12">您的位置：<a href="index.jsp">首页</a>&nbsp;&gt;&nbsp;&nbsp;留学院校
						</td>
					</tr>
				</table>
				<table height="10" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td></td>
					</tr>
				</table> <!--文章显示 -->
				<table width="98%" border="0" cellpadding="0" cellspacing="0" background="themes/nzblue/images/nzcms/list_news_bg.gif">
					<tr>
						<td width="190" height="33" align="center" class="title14b">留学院校</td>
						<td align="right">&nbsp;&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
				</table>
				<table height="20" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td></td>
					</tr>
				</table> <!--图片格式显示 -->

				<table height="20" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td></td>
					</tr>
				</table>
				<table border="0" align="center" cellpadding="0" cellspacing="0" bordercolor="#FF9900">
					<tr>
						<c:forEach items="${schoolList}" var="school" varStatus="status">
							<c:if test="${status.count eq 1 || (status.count-1) % 4 eq 0}">
								<tr>
							</c:if>
							<td align="center" valign="top" whith="200"><table width="170" height="150" border="1" cellpadding="0" cellspacing="3"
									bordercolor="#FFFFFF" bgcolor="#F5F5F5" class="bg_qc">
									<tr>
										<td align="center" valign="middle" bgcolor="#FFFFFF"><a href="index/schoolDetail.action?id=${school.schoolid }"
											target="_blank"><img src="${school.image }" alt="${school.schoolname }" width="190" height="140" border="0"></a></td>
									</tr>
								</table>
								<table width="220" border="0" cellpadding="0" cellspacing="0">
									<tr>
										<td height="35" align="center"><a href="index/schoolDetail.action?id=${school.schoolid }" target="_blank">
												${school.schoolname } </a></td>
									</tr>
								</table></td>

							<c:if test="${status.count % 4 eq 0 || status.count eq 4}">
					</tr>
					</c:if>

					</c:forEach>


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
