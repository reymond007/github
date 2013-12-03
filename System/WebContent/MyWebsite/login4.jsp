<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Login</title>
<link href="images/login.css" rel="stylesheet" type="text/css" />
</head>
<body>


<script type="text/javascript">
function reloadVerifyCode()
{
  var timenow = new Date().getTime();      
  document.getElementById("safecode").src="<%=request.getContextPath()%>/VerificationCode_exec?d="+timenow;   
  
                 
}
function test1()
{
	
	var user=document.getElementById("Number").value;
	
	var re;
		re = /^[0-9]{9}$/; 
		if (re.test(user)) {
			document.getElementById("errorDiv").innerHTML= "";
			//Match
		} else {
			document.getElementById("errorDiv").innerHTML=  "Please input 9-bit Number ";
			document.getElementById("Number").value ="";
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
			
			document.getElementById("errorDiv2").innerHTML=  "Please input 5~9 bits number or letter   ";
			document.getElementById("thepassword").value = "";
		}
		
}
</script>
<form action="user_login" method="post" id="login">

    <div id="login">

	
	     <div id="top">
		      <div id="top_left"><img src="images/login_03.gif" /></div>
			  <div id="top_center"></div>
		 </div>
		 
		 <div id="center">
		      <div id="center_left"></div>
			  <div id="center_middle">
              	   <div id="choose_user">&nbsp;&nbsp;&nbsp;&nbsp;Status:
			        <select>
					<option value="student">Student</option>
					<option value="teacher">Teacher</option>
					<option value="eteacher">Dean</option>	
					<option value="eteacher">Administrator</option>			
					</select>

			       </div>
			       <div id="user">Username:<input type="text" name="user.name" id="Number" onBlur="test1()">
			      <div id="errorDiv" style="color:red;font-weight:bold" ></div> 
			       </div>
			       
				   <div id="password">Password:<input type="password" name="user.pwd" id="thepassword" onBlur="test2()">
				   <div id="errorDiv2" style="color:red;font-weight:bold" ></div> 
				   </div>
                    <div id="identify">Verification Code
                     <INPUT class=regtxt title=“Please input verification code" name="user.verificationCode" id="verify"/>
                      <a href="javascript:reloadVerifyCode()">
                       <img src="<%=request.getContextPath()%>/VerificationCode_exec" id="safecode" />
                      </a>
		           </div>
                   
                   
			    <div id="btn">
                    <input type="submit" value="Login"></input>
		            <input type="reset" value="Reset"></input>
                
                </div>
			  
			  </div>
			  <div id="center_right"></div>		 
		 </div>
		 <div id="down">
		      <div id="down_left">
			      <div id="inf">
                       <span class="inf_text">Version Information</span>
					   <span class="copyright">Score Administrating System 2012 v1.0</span>
			      </div>
			  </div>
			  <div id="down_center"></div>		 
		 </div>

	</div>
</body>
</html>
