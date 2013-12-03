<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form>
<table border = "1">
<tr><td>工号</td><td>姓名</td></tr>
<s:iterator value = "#request.htelist" id = "id" status = "s">
<tr><td><s:property value = "#id.hteacherNumber"/></td><td><s:property value = "#id.hteacherName"/></td></tr>
</s:iterator>
</table>
</form>
</body>
</html>