<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib prefix="s" uri="/struts-tags"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script language="javascript">
function checkScore(s)
{
		var score = document.getElementById("score"+s).value;
		var regu = "^[0-9]+[\.]?[0-9]{0,1}$";
		var re = new RegExp(regu);
		if(score.search(re)==-1)
		{ 
		document.getElementById("score"+s).value=document.getElementById("score"+s).attributes['oriValue'].nodeValue;
		}
		else if(score > 100)
		{
		document.getElementById("score"+s).value=document.getElementById("score"+s).attributes['oriValue'].nodeValue;
		}
}
function checkBasePoint(s)
{

        var basePoint = document.getElementById("basePoint"+s).value;
        //var regu = "^[0-9]+[\.][0-9]{0,1}+$";
        var regu = "^[0-9]+[\.]?[0-9]{0,1}$";
        var re = new RegExp(regu);
        if(!re.test(basePoint))
        {
        document.getElementById("basePoint"+s).value=document.getElementById("basePoint"+s).attributes['oriValue'].nodeValue;
        }
        else if(basePoint > 5 )
        {
        document.getElementById("basePoint"+s).value=document.getElementById("basePoint"+s).attributes['oriValue'].nodeValue;
        }
}
function onCheck()
{ 
   var result = confirm("Are you ready to submit?");
   if(result)
   {
       form = document.forms("form2");
       form.submit();
   }
   else
   {
   }
}
function checkCourse()
{
   var course = document.getElementById("course").value;
   var regu = "^[0-9a-zA-Z]+$";
   var re = new RegExp(regu);
   if(!re.test(course))
   {
      document.getElementById("checkCourse").innerHTML=  "Can't contain special Sysbol";
      document.getElementById("course").value="";
   }
}
</script>
</head>
<body>
<s:form name="form2" action="scoreMaintain_updateScore" theme="simple">

<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
<tr bgcolor="#E7E7E7">
	<td height="24" colspan="10" background="skin/images/tbg.gif">&nbsp;GradesInput &nbsp;</td>
</tr>
<tr align="center" bgcolor="#FAFAF1" height="22">
	<td width="10%">Number</td>
	<td width="13%">UIN</td>
	<td width="9%">Course</td>
	<td width="17%">Grades</td>
	<td width="9%">GPA</td>
</tr>

<s:iterator value="scoreList" status="stat">
<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
	<td><s:property value="#stat.index"/></td>
    <td><input name=<s:property value="%{'scoreList['+#stat.index+'].studentNumber'}"/>  type="text"  value=<s:property value="studentNumber"/> class="np"></td>
	<td><input type="text" name=<s:property value="%{'scoreList['+#stat.index+'].courseName'}"/> type="text" value=<s:property value="#session.courseName"/> readonly="readonly"></td>
	<td><input name=<s:property value="%{'scoreList['+#stat.index+'].score'}"/> type="text" id=<s:property value="'score'+#stat.index"/> value=<s:property value="score"/> class="np" oriValue=<s:property value="score"/> onBlur="checkScore(${stat.index})"></td>
	<td><input name=<s:property value="%{'scoreList['+#stat.index+'].basePoint'}"/>  type="text" id=<s:property value="'basePoint'+#stat.index"/> value=<s:property value="basePoint"/> class="np" onBlur="checkBasePoint(${stat.index})" oriValue=<s:property value="basePoint"/>></td>
    <td><input name=<s:property value="%{'scoreList['+#stat.index+'].teacherNumber'}"/> type="hidden" value=<s:property value="teacherNumber"/>></td>
	<td><input name=<s:property value="%{'scoreList['+#stat.index+'].scoreId'}"/> type="hidden" value=<s:property value="scoreId"/>></td>
</tr>
</s:iterator>
</table>
<input type="button" value="Submit" onclick="onCheck()"><br>
</s:form>
<form action="scoreMaintain_selectScoreByCourse">
Course:<input type="text" name="courseName" onblur="checkCourse(this)" id="course">
<input type="submit" value="Search"><br>
<div id="checkCourse" style="color:red;font-weight:bold" ></div> 
</form>
</body>
</html>