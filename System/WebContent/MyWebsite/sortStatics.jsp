<%@ page language="java"   contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>


    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">

#ToolBar1 {
position:absolute;
bottom:0px;
right:8px;
width:100%;
height:80px;
text-align:center;
background:#ccc;
z-index:4;
}
</style>
</head>
<body>
<form name='form3' action="score_scoreSortStatics" >
<input type='hidden' name='dopost' value='' />
<table width='98%'  border='0' cellpadding='1' cellspacing='1' bgcolor='#CBD8AC' align="center" style="margin-top:8px">
  <tr bgcolor='#EEF4EA'>
    <td background='skin/images/wbg.gif' align='center'>
      <table border='0' cellpadding='0' cellspacing='0'>
        <tr>
          <td width='90' align='center'>Major：</td>
           </td>
        <td width='160'>
          <input type="text" name="department"/>
        </td>
        <td width='70'>
          Course：
        </td>
        <td width='160'>
          	<input type="text" name="lesson"/>
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
<form name="form2">

<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
<tr bgcolor="#E7E7E7">
	<td height="24" colspan="10" background="skin/images/tbg.gif">&nbsp;DocumentsList&nbsp;</td>
</tr>
<tr align="center" bgcolor="#FAFAF1" height="22">
	<td width="14%">UIN</td>
	<td width="9%">Name</td>
	<td width="25%">Major</td>
	<td width="26%">Class</td>
	<td width="10%">Course</td>
	<td width="8%">Grades</td>
	<td width="9%">GPA</td>
	
</tr>
<s:iterator value="scores"  status = "s">
<tr  align="center" bgcolor="#FAFAF1" height="22">
<td><s:property value="student.studentNumber"/></td>
<td><s:property value="student.studentName"/></td>
<td><s:property value="student.cclass.departmentName"/></td>
<td><s:property value="student.cclass.className"/></td>
<td><s:property value="courseName"/></td>
<td><s:property value = "score"/></td>
<td><s:property value="basePoint"/></td>
</tr>
</s:iterator>
<div id="ToolBar1">
Totally<s:property value="pageBean.allRow"/> records
　　　　Totally<s:property value="pageBean.totalPage"/> pages
　　　　Current Page:<s:property value="pageBean.currentPage"/><br/>
　　　<br>

　　　　<s:if test="%{pageBean.currentPage == 1}">
　　　　　　FirstPage     PriviousPage
　　　　</s:if>
　　　　<s:else>

　　　　　　<a href="score_scoreSortStatics.action?page=1">FirstPage</a>
　　　　　　<a href="score_scoreSortStatics.action?page=<s:property value="%{pageBean.currentPage-1}"/>&type='desc'">PriviousPage</a><br>

　　　　</s:else>
　　　　<s:if test="%{pageBean.currentPage != pageBean.totalPage}">

　　　　　　<a href="score_scoreSortStatics.action?page=<s:property value="%{pageBean.currentPage+1}"/>&type='asc'" >NextPage</a>
　　　　　　<a href="score_scoreSortStatics.action?page=<s:property value="pageBean.totalPage"/>">LastPage</a>
 
　　　　</s:if>
　　　　<s:else>
　　　　　　NextPage LastPage
　　　　</s:else>
</div>
</div>
</body>
</html>