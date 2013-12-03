<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="skin/css/main.css" />
</head>
<body>
<script type="text/javascript">
function test1()
{
	
	var user=document.getElementById("courseId").value;
		
	var re;
		re = /^[0-9]{1,16}$/; 
		if (re.test(user)) {
			document.getElementById("errorDiv1").innerHTML=  "";
			document.getElementById("sub").disabled=false;
			//match
		} else {
			
			document.getElementById("errorDiv1").innerHTML=  "must be numerics";
			document.getElementById("courseId").value = "";
			document.getElementById("sub").disabled=true;
		}
		
}

function test2()
{
   
	var user=document.getElementById("courseNumber").value;

	var re;
		re = /^[0-9]{1,16}$/; 
		if (re.test(user)) {
			document.getElementById("errorDiv2").innerHTML=  "";
			document.getElementById("sub").disabled=false;
		} else {
			document.getElementById("errorDiv2").innerHTML=  "must be numerics";
			document.getElementById("courseNumber").value = "";
			document.getElementById("sub").disabled=true;
		}
		
}

function test3()
{
	
	var user=document.getElementById("name").value;

	var re;
		re = /^[0-9a-zA-z]{1,16}$/; 
		if (re.test(user)) {
			document.getElementById("errorDiv3").innerHTML=  "";
			document.getElementById("sub").disabled=false;
		} else {
			document.getElementById("errorDiv3").innerHTML=  "Must be characters from 1 to 16 bits ";
			document.getElementById("name").value = "";
			document.getElementById("sub").disabled=true;
		}
		
		
}
function test4()
{
	
	var user=document.getElementById("type").value;

	var re;
		re = /^[0-9a-zA-z]{1,16}$/; 
		if (re.test(user)) {
			document.getElementById("errorDiv4").innerHTML=  "";
			document.getElementById("sub").disabled=false;
		} else {
			document.getElementById("errorDiv4").innerHTML=  "Must be characters from 1 to 16 bits ";
			document.getElementById("type").value = "";
			
		}
		
		
}
function test5()
{
	
	var user=document.getElementById("form").value;

	var re;
		re = /^[0-9a-zA-z]{1,16}$/; 
		if (re.test(user)) {
			document.getElementById("errorDiv5").innerHTML=  "";
			document.getElementById("sub").disabled=false;
		} else {
			document.getElementById("errorDiv5").innerHTML=  "Must be characters from 1 to 16 bits ";
			document.getElementById("form").value = "";
			
		}
		
		
}
function test6()
{
	
	var user=document.getElementById("start").value;
	var re;
	re = /^([0-9]{4,4})-([0-9]{1,2})-([0-9]{1,2})$/;  
	//re= /^(?!\d*?(\d)\d*?\1)\d{5,10}$/;
		
	if (re.test(user)) {
	
			document.getElementById("errorDiv6").innerHTML=  "";
			document.getElementById("sub").disabled=false;
		} else {
			
			document.getElementById("errorDiv6").innerHTML=  "In such order:xxxx-xx-xx  ";
			document.getElementById("start").value = "";
			
		}
		
		
}
function test7()
{
	
	
	var user=document.getElementById("end").value;
	var re;
re = /^([0-9]{4,4})-([0-9]{1,2})-([0-9]{1,2})$/;  
	
	if (re.test(user)) {
		
		document.getElementById("sub").disabled=false;
			document.getElementById("errorDiv7").innerHTML=  "";
		} else {
			
			document.getElementById("errorDiv7").innerHTML=  "In such order:xxxx-xx-xx  ";
			document.getElementById("end").value = "";
			
		}
		
		
}
function test8()
{
	
	
	var user=document.getElementById("credit").value;


		
	var re;
	re = /^[0-9]{1,2}$/; 
	if (re.test(user)) {
			document.getElementById("errorDiv8").innerHTML=  "";
			document.getElementById("sub").disabled=false;
		} else {
			document.getElementById("errorDiv8").innerHTML=  "Please input appropriate numerics ";
			document.getElementById("credit").value = "";
			
		}
		
		
}

</script>
<table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
  <tr>
    <td colspan="2" background="skin/images/frame/wbg.gif" bgcolor="#EEF4EA" class='title'>
    	<div style='float:left'><span>operation</span></div>
   </td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td height="30" colspan="2" align="center" valign="bottom"><table width="100%" border="0" cellspacing="1" cellpadding="1">
        <tr>
          <td width="15%" height="31" align="center"><img src="skin/images/frame/qc.gif" width="90" height="30" /></td>
          <td width="85%" valign="bottom"><div >
<form name="form1" action="course_addOne" method="post" class='addCourse'>

<div id='addCourse_list'>
<!--  
Cou&nbsp;rse&nbsp;&nbsp;I&nbsp;D：<input type = "text" name = "course.courseId" id="courseId" onBlur="test1()"/>

  <div id="errorDiv1" style="color:red;font-weight:bold" ></div><br>
  -->
CourseNumber：<input type = "text" name = "course.courseNumber" id="courseNumber" onBlur="test2()"/>
  <div id="errorDiv2" style="color:red;font-weight:bold" ></div><br>
CourseName：<input type = "text" name = "course.courseName" id="name" onBlur="test3()" />
<div id="errorDiv3" style="color:red;font-weight:bold" ></div><br>
CourseType：<input type = "text" name = "course.courseType" id= "type" onBlur="test4()"/>
<div id="errorDiv4" style="color:red;font-weight:bold" ></div><br>
CourseForm：<input type = "text" name = "course.courseForm" id="form" onBlur="test5()"/>
<div id="errorDiv5" style="color:red;font-weight:bold" ></div><br>
StartTime：<input type = "text" name = "course.startTime" id="start" onBlur="test6()"/>
<div id="errorDiv6" style="color:red;font-weight:bold" ></div><br>
EndTime：<input type = "text" name = "course.endTime" id="end" onBlur="test7()"/>
<div id="errorDiv7" style="color:red;font-weight:bold" ></div><br>
Course Hours：<input type = "text" name = "course.creditPoint" id="credit" onBLur="test8()" />
<div id="errorDiv8" style="color:red;font-weight:bold" ></div><br></div>



<div id='course_submit'><input type = "submit"  value = "Submit"  disabled="true" id="sub"/></div>
</form>
</div>
</td>
        </tr>
      </table></td>
  </tr>
</table>

</body>
</html>