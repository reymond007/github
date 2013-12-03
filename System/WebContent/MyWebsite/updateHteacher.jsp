<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
	
	var user=document.getElementById("Number").value;
	
	var re;
		re = /^[0-9]{9}$/; 
		if (re.test(user)) {
			//document.getElementById("errorDiv1").innerHTML= "";
			//Match
		} else {
			alert("Please Input 9digits number");
			///document.getElementById("errorDiv1").innerHTML=  "Please Input 9digits number ";
			document.getElementById("Number").value = "";
		}
		
}
function test2()
{
	
	var user=document.getElementById("thepassword").value;
	
	var re;
	re = /^[0-9a-zA-Z]{5,9}$/; 
		if (re.test(user)) {
			document.getElementById("errorDiv2").innerHTML= "";
			//Match
		} else {
			
			document.getElementById("errorDiv2").innerHTML=  "Please Input 5-9 digits number or character   ";
			document.getElementById("thepassword").value = "";
		}
		
}
function test3()
{
	
	var user=document.getElementById("name").value;
	
	var re;
		re = /^[a-zA-Z]{1,9}$/; 
		if (re.test(user)) {
			//document.getElementById("errorDiv3").innerHTML= "";
			//Match
		} else {
			alert("Please Input 1-9 digits character   ");
			
			//document.getElementById("errorDiv3").innerHTML=  "Please Input 1-9 digits character   ";
			document.getElementById("name").value = "";
		}
		
}
function test4()
{
	
	var user=document.getElementById("thesex").value;
	
	var re;
		re = /^[f,m]{1}$/; 
		if (re.test(user)) {
			//document.getElementById("errorDiv4").innerHTML= "";
			//Match
		} else {
			alert("Input f or m ");
			// document.getElementById("errorDiv4").innerHTML=  "Input f or m  ";
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
			//document.getElementById("errorDiv5").innerHTML=  " ";
		} else {
			alert("Input proper age ");
			//document.getElementById("errorDiv5").innerHTML=  "Input proper age ";
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
			//alert("Must be numeric");
			document.getElementById("errorDiv6").innerHTML=  "Input proper address ";
			document.getElementById("theaddress").value = "";
		}
		
}

function test7()
{
	
	var user=document.getElementById("thedepartment").value;
	var re;
	re = /^[0-9a-zA-Z]{1,10}$/;
		if (re.test(user)) {
			//Match
			document.getElementById("errorDiv7").innerHTML=  " ";
		} else {
			//alert("Must be numeric");
			document.getElementById("errorDiv7").innerHTML=  "Input proper major ";
			document.getElementById("thedepartment").value = "";
		}
		
}
function test8()
{
	
	var user=document.getElementById("thestatus").value;
	var re;
	re = /^[0-9a-zA-Z]{3,5}$/;
		if (re.test(user)) {
			//Match
			document.getElementById("errorDiv8").innerHTML=  " ";
		} else {
			//alert("Must be numeric");
			document.getElementById("errorDiv8").innerHTML=  "Please Input 3-5 digits number or character  ";
			document.getElementById("thestatus").value = "";
		}
		
}

function test9()
{
	
	var user=document.getElementById("mail").value;
	var re;
	re = /^([0-9a-zA-Z]{1,10})@([0-9a-zA-Z]{1,10}).([0-9a-zA-Z]{1,5})$/;
	
		if (re.test(user)) {
			//MAtch
			document.getElementById("errorDiv9").innerHTML=  " ";
		} else {
			//alert("Must be numeric");
			document.getElementById("errorDiv9").innerHTML= "Wrong Email address " ;
			document.getElementById("mail").value = "";
		}
		
		
}

function test10()
{
	
	var user=document.getElementById("level").value;
	var re;
	re = /^[0-9a-zA-Z]{3,5}$/;
		if (re.test(user)) {
			//Match
			document.getElementById("errorDiv10").innerHTML=  " ";
		} else {
			//alert("Must be numeric");
			document.getElementById("errorDiv10").innerHTML=  "Please Input 3-5 digits number or character ";
			document.getElementById("level").value = "";
		}
		
}

</script>
	<form name='form3' action="hteacherInfo_queryOne" method="post">
		<input type='hidden' name='dopost' value='' />
		<table width='98%' border='0' cellpadding='1' cellspacing='1'
			bgcolor='#CBD8AC' align="center" style="margin-top: 8px">
			<tr bgcolor='#EEF4EA'>
				<td background='skin/images/wbg.gif' align='center'>
					<table border='0' cellpadding='0' cellspacing='0'>
						<tr>
							<td width='180' align='center'>teacherNumber</td>
							<td width='320'><input type="text"
								name="hteacher.hteacherNumber" /></td>
							<td><input name="imageField" type="image"
								src="skin/images/frame/search.gif" width="45" height="20"
								border="0" class="np" /></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
	<form name="form2" action="hteacherInfo_updateOne" method="post">
		<table width="98%" border="0" cellpadding="2" cellspacing="1"
			bgcolor="#D1DDAA" align="center" style="margin-top: 8px">
			<tr bgcolor="#E7E7E7">
				<td height="24" colspan="10" background="skin/images/tbg.gif">&nbsp;Teacher's information&nbsp;</td>
			</tr>
			<tr align="center" bgcolor="#FAFAF1" height="22">
				<td width="25%">teacherNumber </td>
				<td width="25%">Name</td>
				<td width="25%">Gender</td>
				<td width="25%">Age</td>
			</tr>
			<s:iterator value="#request.htelist" id = "id" status="s">
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td><input type = "text" name="hteacher.hteacherNumber" readonly="readonly" value = <s:property value="#id.hteacherNumber"  />></td>
					<td><input type = "text" name="hteacher.hteacherName" id= "name" onBlur="test3()"  value = <s:property value="#id.hteacherName" />></td>
					<td><input type = "text" name="hteacher.sex"  id="thesex" onBlur="test4()" value = <s:property value="#id.sex" />></td>
					<td><input type = "text" name="hteacher.age"  id="theAge" onBlur="test5()" value = <s:property value="#id.age"  />></td>
				</tr>
			</s:iterator>
			<tr><td><input type = "submit" value = "Modify"/></td></tr>
		</table>
	</form>

<%-- <table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
  <tr>
    <td colspan="2" background="skin/images/frame/wbg.gif" bgcolor="#EEF4EA" class='title'>
    	<div style='float:left'><span>Operation</span></div>
   </td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td height="30" colspan="2" align="center" valign="bottom"><table width="100%" border="0" cellspacing="1" cellpadding="1">
        <tr>
          <td width="15%" height="31" align="center"><img src="skin/images/frame/qc.gif" width="90" height="30" /></td>
          <td width="85%" valign="bottom"><div >
<form name='form3' action="hTeacher_addOne" bgcolor='#CBD8AC' >
<div id='updateHteacher_list'>
TeacherNumber:<input type = "text" name = "hTeacher。hTeacherNumber"/><br>
password:<input type = "text" name = "hTeacher.password"/><br>
TeacherName:<input type = "text" name = "hTeacher.hTeacherName"/><br>
Gender:<input type = "text" name = "hTeacher.sex"/><br>
Age:<input type = "text" name = "hTeacher.age"/><br>
Address:<input type = "text" name = "hTeacher.address"/><br>
Major:<input type = "text" name = "hTeacher.department"/><br>
Status:<input type = "text" name = "hTeacher.status"/><br>
Mailaddress:<input type = "text" name = "hTeacher.mailAddress"/><br>
professionLevel:<input type = "text" name = "hTeacher.professionLevel"/><br>
</div>
<div id='updateHteacher_submit'><input type = "submit" id="course_submit" value = "Submit"/></div>
</form>
</div>
</td>
        </tr>
      </table></td>
  </tr>
</table> --%>


</body>
</html>