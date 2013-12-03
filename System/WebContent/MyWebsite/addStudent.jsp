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
	
	var user=document.getElementById("Number").value;
	
	var re;
		re = /^[0-9]{9}$/; 
		if (re.test(user)) {
			document.getElementById("errorDiv1").innerHTML= "";
			document.getElementById("sub").disabled=false;
			//Match
		} else {
			document.getElementById("errorDiv1").innerHTML=  "Please input 9 digits numerics ";
			document.getElementById("Number").value = "";
			document.getElementById("sub").disabled=true;
		}
		
}
function test2()
{
	
	var user=document.getElementById("thepassword").value;
	
	var re;
	re = /^[0-9a-zA-Z]{5,9}$/; 
		if (re.test(user)) {
			document.getElementById("errorDiv2").innerHTML= "";
			document.getElementById("sub").disabled=false;
			//Match
		} else {
			
			document.getElementById("errorDiv2").innerHTML=  "Please input numerics or characters(5 to 9 digits)   ";
			document.getElementById("thepassword").value = "";
			document.getElementById("sub").disabled=true;
		}
		
}
function test3()
{
	
	var user=document.getElementById("name").value;
	
	var re;
		re = /^[a-zA-Z]{1,9}$/; 
		if (re.test(user)) {
			document.getElementById("errorDiv3").innerHTML= "";
			document.getElementById("sub").disabled=false
			//Match
		} else {
			
			document.getElementById("errorDiv3").innerHTML=  "Please input characters from 1 to 9 digits   ";
			document.getElementById("name").value = "";
			document.getElementById("sub").disabled=true;
		}
		
}
function test4()
{
	
	var user=document.getElementById("thesex").value;
	
	var re;
		re = /^[f,m]{1}$/; 
		if (re.test(user)) {
			document.getElementById("errorDiv4").innerHTML= "";
			//Match
		} else {
			document.getElementById("errorDiv4").innerHTML=  "Please input F or M  ";
			document.getElementById("thesex").value = "";
		}
		
}

function test5()
{
	
	var user=document.getElementById("theAge").value;
	var re;
		re = /^[0-9]{1,3}$/; 
		if (re.test(user)) {
			//Match
			document.getElementById("errorDiv5").innerHTML=  " ";
		} else {
			//alert("Must be numerics");
			document.getElementById("errorDiv5").innerHTML=  "Please input appropriate age ";
			document.getElementById("theAge").value = "";
		}
		
}
function test6()
{
	
	var user=document.getElementById("theaddress").value;
	var re;
	re = /^[0-9a-zA-Z]{5,9}$/;
		if (re.test(user)) {
			//Match
			document.getElementById("errorDiv6").innerHTML=  " ";
		} else {
			//alert("Must be numerics");
			document.getElementById("errorDiv6").innerHTML=  "Please input appropriate address ";
			document.getElementById("theaddress").value = "";
		}
		
}
function test8()
{
	
	var user=document.getElementById("theclassName").value;
	var re;
	re = /^[0-9a-zA-Z]{1,10}$/;
		if (re.test(user)) {
			//Match
			document.getElementById("errorDiv8").innerHTML=  " ";
		} else {
			//alert("Must be numerics");
			document.getElementById("errorDiv8").innerHTML=  "Please input appropriate class  ";
			document.getElementById("theclassName").value = "";
		}
		
}
function test7()
{
	
	var user=document.getElementById("thestatus").value;
	var re;
	re = /^[0-9a-zA-Z]{3,5}$/;
		if (re.test(user)) {
			//Match
			document.getElementById("errorDiv7").innerHTML=  " ";
		} else {
			//alert("Must be numerics");
			document.getElementById("errorDiv7").innerHTML=  "Please input numerics or characters (3 to 5 digits) ";
			document.getElementById("thestatus").value = "";
		}
		
}
function test9()
{
	
	var user=document.getElementById("year").value;
	var re;
	re = /^[0-9]{4}$/;
		if (re.test(user)) {
			//Match
			document.getElementById("errorDiv9").innerHTML=  " ";
		} else {
			//alert("Must be numerics");
			document.getElementById("errorDiv9").innerHTML=  "Please input correct year" ;
			document.getElementById("year").value = "";
		}
		
}

</script>
<table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
  <tr>
    <td colspan="2" background="skin/images/frame/wbg.gif" bgcolor="#EEF4EA" class='title'>
    	<div style='float:left'><span>Add Student Information</span></div>
   </td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td height="30" colspan="2" align="center" valign="bottom"><table width="100%" border="0" cellspacing="1" cellpadding="1">
        <tr>
          <td width="15%" height="31" align="center"><img src="skin/images/frame/qc.gif" width="90" height="30" /></td>
          <td width="85%" valign="bottom"><div >
<form name='form3' action="studentInfo_addOne" style="margin-top:8px" >
<div id='addStudent_list'>
StudentID：<input type = "text" name = "student.studentNumber" id="Number" onBlur="test1()"/>
*
<div id="errorDiv1" style="color:red;font-weight:bold" ></div>
<br>
Password ：<input type = "text" name = "student.password" id="thepassword" onBlur="test2()" />
*
<div id="errorDiv2" style="color:red;font-weight:bold" ></div>
<br>
FullName：<input type = "text" name = "student.studentName" id="name" onBlur="test3()" />
*
<div id="errorDiv3" style="color:red;font-weight:bold" ></div>
<br>
Gender：<input type = "text" name = "student.sex" id="thesex" onBlur="test4()" />
<div id="errorDiv4" style="color:red;font-weight:bold" ></div>
<br>
Age：<input type = "text" name = "student.age" id="theAge" onBlur="test5()"/>
<div id="errorDiv5" style="color:red;font-weight:bold" ></div>
<br>
 
Entering&nbsp;&nbsp;Year：<input type = "text" name = "student.joinYear"  id="year" onBlur="test9()"/>
<div id="errorDiv9" style="color:red;font-weight:bold" ></div>
<br>
Address：<input type = "text" name = "student.address" id="theaddress" onBlur="test6()" />
<div id="errorDiv6" style="color:red;font-weight:bold" ></div>
<br>
Status：<input type = "text" name = "student.status" id="thestatus" onBlur="test7()" />
<div id="errorDiv7" style="color:red;font-weight:bold" ></div>
<br>
Class Number：<input type = "text" name = "student.className" id="theclassName" onBlur="test8()" />
<div id="errorDiv8" style="color:red;font-weight:bold" ></div>
<br>
</div>
<div id='addStudent_submit'><input type = "submit" value = "Submit" disabled="true" id="sub"/></div>
</form>
</div>
</td>
        </tr>
      </table></td>
  </tr>
</table>

</body>
</html>