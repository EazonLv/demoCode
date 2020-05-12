<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<table width="1004" border="0" align="center" cellpadding="15" cellspacing="0"
	background="themes/nzblue/images/nzcms/end_bg.gif" bgcolor="#FFFFFF">
	<tr>
		<td align="center" valign="top" class="end"><br /> 本站最佳浏览效果：1024*768分辨率/建议使用微软公司浏览器IE10.0以上&nbsp;&nbsp; <br />
			<table border="0" cellpadding="3" cellspacing="0">
				<tr>
					<td align="center">&nbsp;</td>
					<td width="100" align="center"><a href="<%=basePath%>admin/index.action" target="_blank"><font
							color="#FF6600">后台入口</font> </a><br /></td>
				</tr>
			</table></td>
	</tr>
</table>

<%
	String message = (String) session.getAttribute("message");
	if (message == null) {
		message = "";
	}
	if (!message.trim().equals("")) {
		out.println("<script language='javascript'>");
		out.println("alert('" + message + "');");
		out.println("</script>");
	}
	session.removeAttribute("message");
%>