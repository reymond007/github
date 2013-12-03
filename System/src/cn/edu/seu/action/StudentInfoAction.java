package cn.edu.seu.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.edu.seu.pojo.Student;
import cn.edu.seu.service.StudentInfoService;

import com.opensymphony.xwork2.ActionSupport;

public class StudentInfoAction extends ActionSupport {

	private Student student;

	private StudentInfoService studentInfoService;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public StudentInfoService getStudentInfoService() {
		return studentInfoService;
	}

	public void setStudentInfoService(StudentInfoService studentInfoService) {
		this.studentInfoService = studentInfoService;
	}

	public String addOne() {
		try{
			studentInfoService.addOne(student);
			return "success";
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return "error";
	}

	public String deleteOne() {	
		try{
			studentInfoService.deleteOne(student);
			return "success";
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return "error";
	}

	public String updateOne() {
		if (student != null) {
			studentInfoService.updateOne(student);
			return "success";
		}
		return "sturesult";
	}

	public String queryOne() {
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			List<Student> stulist = studentInfoService.findByNumber(student);
			request.setAttribute("stulist", stulist);
			if (stulist != null) {
				return "sturesult";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}

}
