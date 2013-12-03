<%@ page  contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Hello World</title>
</head>
<body>    
    <table>
        <tr style="background-color:powderblue; font-weight:bold;">
            <td>Student number</td>
            <td>Score</td>
        </tr>
        <s:iterator value="scoreList" status="stat">
            <tr>
                <td><s:property value="studentNumber"/></td>
                <td><s:property value="score"/></td>
            </tr>
        </s:iterator>
    </table>
</body>
</html>