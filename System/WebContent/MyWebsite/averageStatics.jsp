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
<form name='form3' action="score_averageStatics" >
<input type='hidden' name='dopost' value='' />
<table width='98%'  border='0' cellpadding='1' cellspacing='1' bgcolor='#CBD8AC' align="center" style="margin-top:8px">
  <tr bgcolor='#EEF4EA'>
    <td background='skin/images/wbg.gif' align='center'>
      <table border='0' cellpadding='0' cellspacing='0'>
        <tr>
          <td width='90' align='center'>Department：</td>
           </td>
        <td width='160'>
          <input type="text" name="department"/>
        </td>
        <td width='70'>
       CourseName：
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
	<td height="24" colspan="10" background="skin/images/tbg.gif">&nbsp;DocumentList&nbsp;</td>
</tr>
<tr align="center" bgcolor="#FAFAF1" height="22">
	<td width="25%">Department</td>
	<td width="25%">Class</td>
	<td width="25%">CourseName</td>
	<td width="25%">Grade</td>

	
</tr>
<s:iterator value="scores"  status = "s">
<tr  align="center" bgcolor="#FAFAF1" height="22">
<td><s:property value="departmentName"/></td>
<td><s:property value="className"/></td>
<td><s:property value="courseName"/></td>
<td><s:property value="score"/></td>

</tr>
</s:iterator>
<div id="ToolBar1">
<s:property value="pageBean.allRow"/> Records
　　　　Page<s:property value="pageBean.totalPage"/> 
　　　　PageNumber<s:property value="pageBean.currentPage"/>" "<br/>
　　　<br>

　　　　<s:if test="%{pageBean.currentPage == 1}">
　　　　　　FirstPage PreviousPage
　　　　</s:if>
　　　　<s:else>

　　　　　　<a href="score_averageStatics.action?page=1">FirstPage</a>
　　　　　　<a href="score_averageStatics.action?page=<s:property value="%{pageBean.currentPage-1}"/>&type='desc'">PreviousPage</a>

　　　　</s:else>
　　　　<s:if test="%{pageBean.currentPage != pageBean.totalPage}">

　　　　　　<a href="score_averageStatics.action?page=<s:property value="%{pageBean.currentPage+1}"/>&type='asc'" >NextPage</a>
　　　　　　<a href="score_averageStatics.action?page=<s:property value="pageBean.totalPage"/>">LastPage</a>
 
　　　　</s:if>
　　　　<s:else>
　　　　　　NextPage LastPage
　　　　</s:else>
</div>
</div>
</body>
</html>