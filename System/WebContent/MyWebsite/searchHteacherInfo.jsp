<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form name='form3' action="hteacherInfo_queryOne" method="post">
		<input type='hidden' name='dopost' value='' />
		<table width='98%' border='0' cellpadding='1' cellspacing='1'
			bgcolor='#CBD8AC' align="center" style="margin-top: 8px">
			<tr bgcolor='#EEF4EA'>
				<td background='skin/images/wbg.gif' align='center'>
					<table border='0' cellpadding='0' cellspacing='0'>
						<tr>
							<td width='180' align='center'>Instructor ID:</td>
							<td width='320'><input type="text"
								name="hteacher.hteacherNumber" /></td>
							<td><input name="imageField" type="image"
								src="skin/images/frame/search.gif" width="45" height="20"
								border="0" class="np" /></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
	<form name="form2">
		<table width="98%" border="0" cellpadding="2" cellspacing="1"
			bgcolor="#D1DDAA" align="center" style="margin-top: 8px">
			<tr bgcolor="#E7E7E7">
				<td height="24" colspan="10" background="skin/images/tbg.gif">&nbsp;Instructor Information&nbsp;</td>
			</tr>
			<tr align="center" bgcolor="#FAFAF1" height="22">
				<td width="25%">ID</td>
				<td width="25%">Full name</td>
				<td width="25%">Gender</td>
				<td width="25%">Age</td>
			</tr>
			<s:iterator value="#request.htelist" id = "id" status="s">
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td><s:property value="#id.hteacherNumber" /></td>
					<td><s:property value="#id.hteacherName" /></td>
					<td><s:property value="#id.sex" /></td>
					<td><s:property value="#id.age" /></td>
				</tr>
			</s:iterator>
		</table>
	</form>
</body>
</html>
