package cn.edu.seu.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.seu.pojo.SelectCondition;
import cn.edu.seu.pojo.Student;
import cn.edu.seu.pojo.Teacher;
import cn.edu.seu.pojo.User;
import cn.edu.seu.service.UserService;

public class UserAction extends ActionSupport{
/**
	 * 
	 */
	private static final long serialVersionUID = 8558633875900804907L;
private User user;
private UserService userService;
private SelectCondition selectCondition;
private List list;
public List getList() {
	return list;
}
public void setList(List list) {
	this.list = list;
}
public SelectCondition getSelectCondition() {
	return selectCondition;
}
public void setSelectCondition(SelectCondition selectCondition) {
	this.selectCondition = selectCondition;
}
public UserService getUserService() {
	return userService;
}
public void setUserService(UserService userService) {
	this.userService = userService;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}


public String login()
{
	System.out.println("User Action Start!");
	if(checkVerificationCode())
	{
		System.out.println("VerificationCode check success!");
		int i = userService.login(user);
		System.out.println("The level is "+i);
		user.setJurisdiction(i);
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("user",user);
		switch (i)
		{
		case 0: 
			return "error";
		case 1:
			return "student";
		case 2:
			return "teacher";
		case 3:
			return "Hteacher";
		case 4:
			return "Sys";
			default :
				return "failed";
		}
		
	}
	return "failed";
}
private Boolean checkVerificationCode()
{
	String str1=user.getVerificationCode();
	System.out.println(str1);
	String str2=(String)ServletActionContext.getRequest().getSession().getAttribute("rand");
	System.out.println(str2);
	if(str1.equals(str2))
	{
		System.out.println("OK");
		return true;
	}
	return false;
}
public String selectInfo()
{
	list = userService.selectInfo(selectCondition);
    List<Teacher> alist=list;
    for(Teacher t: alist)
    {
    	System.out.println(t.getTeacherName());
    }
	return "success";
}

}
