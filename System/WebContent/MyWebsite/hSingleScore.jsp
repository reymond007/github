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
<c:if test="#session.getAttribute("user")==ooo"> 

<form name='form3' action="hteacher_findByStu" >
<input type='hidden' name='dopost' value='' />
<table width='98%'  border='0' cellpadding='2' cellspacing='1' bgcolor='#CBD8AC' align="center" style="margin-top:8px">
  <tr bgcolor='#EEF4EA'>
    <td background='skin/images/wbg.gif' align='center'>
        <table border='0' cellpadding='0' cellspacing='0'>
        <tr>
       
         Course
        </td>
        <td width='160'>
          	<input type="text" name="student.studentNumber"/>
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
</c:if> 

<form name="form2">
<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
<tr bgcolor="#E7E7E7">
	<td height="24" colspan="10" background="skin/images/tbg.gif">&nbsp;Document List&nbsp;</td>
</tr>
<s:property value="studentNumber"/> <s:property value="student.studentName"/>
<table align="center" bgcolor="#FAFAF1" border = "1" height="22">
<tr>
    <td width="9%">Course ID</td>
	<td width="9%">Course Name</td>
	<td width="26%">Score</td>
	<td width="10%">Credit</td>	
	<td width="10%">Start Time</td>
	<td width="10%">GPA</td>
</tr>
<s:iterator value="tc"  status = "t">
<tr align="center" bgcolor="#FAFAF1" height="22">
<td><s:property value="course.courseNumber"/></td>

<td><s:property value="courseName"/></td>
<td><s:property value = "score"/></td>
<td><s:property value="course.creditPoint"/></td>
<td><s:property value="course.startTime"/></td>
<td><s:property value="basePoint"/></td>
</tr>
</s:iterator>

</body>
</html>