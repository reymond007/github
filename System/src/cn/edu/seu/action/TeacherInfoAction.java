package cn.edu.seu.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.edu.seu.pojo.Teacher;
import cn.edu.seu.service.TeacherInfoService;

import com.opensymphony.xwork2.ActionSupport;

public class TeacherInfoAction extends ActionSupport {

	private Teacher teacher;

	private TeacherInfoService teacherInfoService;
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public TeacherInfoService getTeacherInfoService() {
		return teacherInfoService;
	}

	public void setTeacherInfoService(TeacherInfoService teacherInfoService) {
		this.teacherInfoService = teacherInfoService;
	}

	public String addOne() {
		try{
			teacherInfoService.addOne(teacher);
			return "success";
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}

	public String deleteOne() {	
		try{
			teacherInfoService.deleteOne(teacher);
			return "success";
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}

	public String updateOne() {
		if (teacher != null) {
			teacherInfoService.updateOne(teacher);
			return "success";
		}
		return "tearesult";
	}

	public String queryOne() {
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			List<Teacher> tealist = teacherInfoService.findByNumber(teacher);
			request.setAttribute("tealist", tealist);
			if (tealist != null) {
				return "tearesult";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}

}
