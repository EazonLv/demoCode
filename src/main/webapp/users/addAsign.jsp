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
<script type="text/javascript" src="js/selimage.js" charset="utf-8"></script>
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
						<td align="left" class="p12">您的位置： <a href="index.jsp">首页</a>&nbsp;&gt;&nbsp;&nbsp;留学生报名
						</td>
					</tr>
				</table>
				<table height="30" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td></td>
					</tr>
				</table>
				<form action="index/addAsign.action" name="myform">
					<table width="46%" border="0" cellpadding="5" cellspacing="1" bgcolor="#E0EDB7">
						<tr>
							<td height="30" colspan="2" align="center" background="themes/nzblue/images/nzcms/list_bg.gif" class="white14B">留学生报名</td>
						</tr>
						<tr>
							<td width="80" height="50" align="right" bgcolor="#FFFFFF">报名单号：</td>
							<td bgcolor="#FFFFFF">${ano }<input type="hidden" name="ano" id="ano" value="${ano }" /></td>
						</tr>
						<tr>
							<td height="50" align="right" bgcolor="#FFFFFF">学校：</td>
							<td bgcolor="#FFFFFF"><select name="schoolid" style="width: 260px; height: 30px" id="schoolid">
									<c:forEach items="${schoolList}" var="school">
										<option value="${school.schoolid }">${school.schoolname }</option>
									</c:forEach>
							</select></td>
						</tr>
						<tr>
							<td width="80" height="50" align="right" bgcolor="#FFFFFF">学位：</td>
							<td bgcolor="#FFFFFF"><select name="degreeid" style="width: 260px; height: 30px" id="degreeid">
									<c:forEach items="${degreeList}" var="degree">
										<option value="${degree.degreeid }">${degree.degreename }</option>
									</c:forEach>
							</select></td>
						</tr>
						<tr>
							<td height="50" align="right" bgcolor="#FFFFFF">申请文件：</td>
							<td bgcolor="#FFFFFF"><input type="text" style="width: 260px; height: 30px" name="fileurl" id="fileurl"
								onclick="savefile();" placeholder="请选择申请文件" readonly="readonly" /></td>
						</tr>
						<tr>
							<td height="50" align="right" bgcolor="#FFFFFF">备注：</td>
							<td bgcolor="#FFFFFF"><input type="text" name="memo" style="width: 260px; height: 30px" required="required"
								id="memo" placeholder="请输入备注" /></td>
						</tr>
						<tr>
							<td bgcolor="#FFFFFF" colspan="2" align="center"><label> <input type="submit" name="Submit"
									value="提交" /> &nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" name="Submit2" value="重置" />
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
