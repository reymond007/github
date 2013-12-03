<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="skin/css/main.css" />
<title>Insert title here</title>

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
			//Match
		} else {
			document.getElementById("errorDiv1").innerHTML=  "Must be numeric";
			document.getElementById("courseId").value = "";
		}
		
}
function test2()
{
	
	var user=document.getElementById("courseNumber").value;

	var re;
		re = /^[0-9]{1,16}$/; 
		if (re.test(user)) {
			document.getElementById("errorDiv2").innerHTML=  "";
		} else {
			document.getElementById("errorDiv2").innerHTML=  "Must be numeric";
			document.getElementById("courseNumber").value = "";
		}
		
}
function test3()
{
	
	var user=document.getElementById("name").value;

	var re;
		re = /^[0-9a-zA-z]{1,16}$/; 
		if (re.test(user)) {
			document.getElementById("errorDiv3").innerHTML=  "";
		} else {
			document.getElementById("errorDiv3").innerHTML=  "Must be char and long between 1-16 ";
			document.getElementById("name").value = "";
		}
		
}
function test4()
{
	
	var user=document.getElementById("type").value;

	var re;
		re = /^[0-9a-zA-z]{1,16}$/; 
		if (re.test(user)) {
			document.getElementById("errorDiv4").innerHTML=  "";
		} else {
			document.getElementById("errorDiv4").innerHTML=  "Must be char and long between 1-16 ";
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
		} else {
			document.getElementById("errorDiv5").innerHTML=  "Must be char and long between 1-16 ";
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
		} else {
			
			document.getElementById("errorDiv6").innerHTML=  "Format shouled be xxxx-xx-xx  ";
			document.getElementById("start").value = "";
		}
		
}
function test7()
{
	
	var user=document.getElementById("end").value;
	var re;
re = /^([0-9]{4,4})-([0-9]{1,2})-([0-9]{1,2})$/;  
	
	if (re.test(user)) {
	
			document.getElementById("errorDiv7").innerHTML=  "";
		} else {
			
			document.getElementById("errorDiv7").innerHTML=  "Format shouled be xxxx-xx-xx  ";
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
		} else {
			document.getElementById("errorDiv8").innerHTML=  "Input Proper Number ";
			document.getElementById("credit").value = "";
		}
		
}
</script>

<table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
  <tr>
    <td colspan="2" background="skin/images/frame/wbg.gif" bgcolor="#EEF4EA" class='title'>
    	<div style='float:left'><span>操作</span></div>
   </td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td height="30" colspan="2" align="center" valign="bottom"><table width="100%" border="0" cellspacing="1" cellpadding="1">
        <tr>
          <td width="15%" height="31" align="center"><img src="skin/images/frame/qc.gif" width="90" height="30" /></td>
          <td width="85%" valign="bottom"><div >
<form action="course_updateOne" method="post">

Course Number:<input type = "text" name = "course.courseNumber" id="courseNumber" onBlur="test2()"/>
  <div id="errorDiv2" style="color:red;font-weight:bold" ></div><br>
Course Name:<input type = "text" name = "course.courseName" id="name" onBlur="test3()" />
<div id="errorDiv3" style="color:red;font-weight:bold" ></div><br>
Course Type:<input type = "text" name = "course.courseType" id= "type" onBlur="test4()"/>
<div id="errorDiv4" style="color:red;font-weight:bold" ></div><br>
Course Form:<input type = "text" name = "course.courseForm" id="form" onBlur="test5()"/>
<div id="errorDiv5" style="color:red;font-weight:bold" ></div><br>
Start Time<input type = "text" name = "course.startTime" id="start" onBlur="test6()"/>
<div id="errorDiv6" style="color:red;font-weight:bold" ></div><br>
End Time<input type = "text" name = "course.endTime" id="end" onBlur="test7()"/>
<div id="errorDiv7" style="color:red;font-weight:bold" ></div><br>
Credit:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name = "course.creditPoint" id="credit" onBLur="test8()" />
<div id="errorDiv8" style="color:red;font-weight:bold" ></div><br></div>



<div id='course_submit'><input type = "submit" id="course_submit" value = "Submit"/></div>
</form>
</div>
</td>
        </tr>
      </table></td>
  </tr>
</table>
</body>
</html>