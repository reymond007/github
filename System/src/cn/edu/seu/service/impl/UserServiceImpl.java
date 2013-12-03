package cn.edu.seu.service.impl;

import java.util.ArrayList;
import java.util.List;

import cn.edu.seu.dao.UserDao;
import cn.edu.seu.pojo.Hteacher;
import cn.edu.seu.pojo.SelectCondition;
import cn.edu.seu.pojo.Student;
import cn.edu.seu.pojo.Teacher;
import cn.edu.seu.pojo.User;
import cn.edu.seu.service.UserService;

public class UserServiceImpl implements UserService{
private UserDao userDao;
	public UserDao getUserDao() {
	return userDao;
}
public void setUserDao(UserDao userDao) {
	this.userDao = userDao;
}
	@Override
	public int login(User user) {
		// TODO Auto-generated method stub
		System.out.println("User Service start!");
		if(user.getName()==111111111 && user.getPwd().equals("system"))
		{
			System.out.println("sys level");
			return 4;
		}
		if(userDao.selectStudent(user.getName(), user.getPwd()))
		{
			System.out.println("student level");
			return 1;
		}
		if(userDao.selectTeacher(user.getName(), user.getPwd()))
		{
			System.out.println("teacher level");
			return 2;
		}
		if(userDao.selectHTeacher(user.getName(), user.getPwd()))
		{
			System.out.println("Hteacher level");
			return 3;
		}
		return 0;
	}
	@Override
	public List selectInfo(SelectCondition selectCondition) {
		// TODO Auto-generated method stub
		if(selectCondition.getStudent()==null)
		{
			selectCondition.setStudent("");
		}
		if(selectCondition.getTeacher()==null)
		{
			selectCondition.setTeacher("");
		}
		if(selectCondition.getCollege()==null)
		{
			selectCondition.setCollege("");
		}
		if(selectCondition.getCclass()==null)
		{
			selectCondition.setCclass("");
		}
		if(selectCondition.getHteacher()==null)
		{
			selectCondition.setHteacher("");
		}
		if(!selectCondition.getStudent().isEmpty())
		{
			List<Student> list = new ArrayList<Student>();
			if(!selectCondition.getId().isEmpty())
			{
				System.out.println("get student info by studentnumber");
				list=userDao.selectStudentInfoByNumber(new Long(selectCondition.getId()));
				return list;
			}
			else if(!selectCondition.getCclass().isEmpty())
			{
				System.out.println("get student info by class");
				list=userDao.selectStudentInfoByClass(selectCondition.getCclass());
				return list;
			}
			else if(!selectCondition.getCollege().isEmpty())
			{
				System.out.println("get student info by college");
				list=userDao.selectStudentInfoByCollege(selectCondition.getCollege());
				return list;
			}
			else
			{
				System.out.println("选择条件不能为空！");
			}
		}
		else if(!selectCondition.getTeacher().isEmpty())
		{
			List<Teacher> list = new ArrayList<Teacher>();
			if(!selectCondition.getId().isEmpty())
			{
				System.out.println("get teacher info by teachertnumber");
				list=userDao.selectTeacherInfoByNumber(new Long(selectCondition.getId()));
				return list;
			}
			else if(!selectCondition.getCollege().isEmpty())
			{
				System.out.println("get teacher info by college");
				list=userDao.selectTeacherInfoByCollege(selectCondition.getCollege());
				return list;
			}
			else
			{
				System.out.println("选择条件不能为空！");
			}
		}
		else if(!selectCondition.getHteacher().isEmpty())
		{
			List<Hteacher> list = new ArrayList<Hteacher>();
			if(!selectCondition.getId().isEmpty())
			{
				System.out.println("get Hteacher info by Hteachertnumber");
				list=userDao.selectHteacherInfoByNumber(new Long(selectCondition.getId()));
				return list;
			}
			else if(!selectCondition.getCollege().isEmpty())
			{
				System.out.println("get Hteacher info by college");
				list=userDao.selectHteacherInfoByCollege(selectCondition.getCollege());
				return list;
			}
			else
			{
				System.out.println("选择条件不能为空！");
			}
		}
		else
		{
			System.out.println("选择的角色不能为空！");
		}
		return null;
	}


}
