﻿<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form name='form3' action="hteacher_findByCla" >
<input type='hidden' name='dopost' value='' />
<table width='98%'  border='1' cellpadding='1' cellspacing='1' bgcolor='#CBD8AC' align="center" style="margin-top:8px">
  <tr bgcolor='#EEF4EA'>
    <td background='skin/images/wbg.gif' align='center'>
     
        Class：
        </td>
        <td width='160'>
          	<input type="text" name="classes.className"/>
        </td>
      
        </td>
        <td>
          <input name="imageField" type="image" src="skin/images/frame/search.gif" width="45" height="20" border="0" class="np" />
        </td>
       </tr>
      </table>
    </td>
  </tr>
</table>
</form>
<table width="98%" border="1" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
<tr bgcolor="#E7E7E7">
	<td height="24" colspan="10" background="skin/images/tbg.gif">&nbsp;Document List&nbsp;</td>
</tr>
<tr align="center" bgcolor="#FAFAF1" border="1" height="22">
	<td width="5%" >Student ID</td>
	<td width="29%">Teacher ID</td>
	<td width="29%">Course name</td>
	<td width="18%">Score</td>
	<td width="20%">Credit</td>	

	
</tr>

<s:iterator value="Score"  status = "s">
<tr align="center" bgcolor="#FAFAF1" height="22" >
<td><s:property value="studentNumber"/></td>
<td><s:property value="student.studentName"/></td>
<td><s:property value="courseName"/></td>
<td><s:property value = "score"/></td>
<td><s:property value="basePoint"/></td>
</tr>
</s:iterator>
</body>
</html>