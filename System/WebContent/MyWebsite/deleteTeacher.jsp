﻿<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>Insert title here</title>
</head>
<body>
<table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
  <tr>
    <td colspan="2" background="skin/images/frame/wbg.gif" bgcolor="#EEF4EA" class='title'>
    	<div style='float:left'><span>Delete Teacher Info.</span></div>
   </td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td height="30" colspan="2" align="center" valign="bottom"><table width="100%" border="0" cellspacing="1" cellpadding="1">
        <tr>
          <td width="15%" height="31" align="center"><img src="skin/images/frame/qc.gif" width="90" height="30" /></td>
          <td width="85%" valign="bottom"><div >
<form name="form3" action="teacherInfo_deleteOne" bgcolor="#CBD8AC" align="center" style="margin-top:8px">
<div id='deleteTeacher'>
Teachers'ID：<input type="text" name="teacher.teacherNumber"/><br/>
</div>
<div id='deleteTeache'><input type = "submit"  value = "Submit"/></div>
</form>
</div>
</td>
        </tr>
      </table></td>
  </tr>
</table>

</body>
</html>