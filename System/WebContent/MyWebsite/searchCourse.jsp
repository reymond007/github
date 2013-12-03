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
<form name='form3' action="course_searchOne" >
<input type='hidden' name='dopost' value='' />
<table width='98%'  border='0' cellpadding='1' cellspacing='1' bgcolor='#CBD8AC' align="center" style="margin-top:8px">
  <tr bgcolor='#EEF4EA'>
    <td background='skin/images/wbg.gif' align='center'>
      <table border='0' cellpadding='0' cellspacing='0'>
        <tr>
       
         Course
        </td>
        <td width='160'>
          	<input type="text" name="courseName"/>
        </td>
      
        </td>
        <td>
          <input name="imageField" type="image" src="skin/images/frame/search.gif" width="45" height="20" border="0" class="np"  />
        </td>
       </tr>
      </table>
    </td>
  </tr>
</table>
</form>
<form name="form2">

<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
<tr bgcolor="#E7E7E7">
	<td height="24" colspan="10" background="skin/images/tbg.gif">&nbsp;Document List&nbsp;</td>
</tr>
<tr align="center" bgcolor="#FAFAF1" height="22">
	<td width="14%">Course ID</td>
	<td width="9%">Course Name</td>
	<td width="25%">Course Type</td>
	<td width="16%">Course Instructional Method</td>
	<td width="15%">Begin Time</td>
	<td width="13%">End Time</td>
	<td width="9%">Credit</td>
	
</tr>
<s:iterator value="courses"  status = "s">
<tr>

<td><s:property value="courseNumber"/></td>
<td><s:property value="courseName"/></td>
<td><s:property value="courseType"/></td>
<td><s:property value="courseForm"/></td>
<td><s:property value="startTime"/></td>
<td><s:property value="endTime"/></td>
<td><s:property value="creditPoint"/></td>
</s:iterator>
</body>
</html>
