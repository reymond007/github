<%@ page  contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
    <s:form action="ScoreConfirm" theme="simple">            
        <table>
            <tr style="background-color:powderblue; font-weight:bold;">
                <td>Student Number</td>
                <td>Student Name</td>
                <td>Score</td>
            </tr>
            <s:iterator value="new int[4]" status="stat">
                <tr>
                    <td><s:textfield value="1" name="%{'scoreList['+#stat.index+'].studentNumber'}" readonly="true"></s:textfield></td>
                    <td><s:textfield value="2"></s:textfield></td>
                    <td><s:textfield name="%{'scoreList['+#stat.index+'].score'}"/></td>
                </tr>
            </s:iterator>
            <tr>
                <td colspan="2"><s:submit /></td>
            </tr>
        </table>
    </s:form>    
</body>
</html>