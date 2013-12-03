package cn.edu.seu.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.edu.seu.pojo.Student;
import cn.edu.seu.service.StudentService;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {

	private Student student;

	private StudentService studentService;
	
	private List dx;
	

	public List getDx() {
		return dx;
	}

	public void setDx(List dx) {
		this.dx = dx;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public String addOne() {
		studentService.addOne(student);
		return "success";
	}

	public String deleteOne() {	
		// System.out.println(student);
		studentService.deleteOne(student);
		return "success";
	}

	public String updateOne() {
		studentService.updateOne(student);
		return "success";
	}

	public String queryOne() {
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			List<Student> stulist = studentService.findByNumber(student);
			request.setAttribute("stulist", stulist);
			if (stulist != null) {
				return "result";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
	public String findScoreByNum()
	{
		List list = studentService.findScoreByNum(student.getStudentNumber());
		dx = list;
		return "studentScore";
		
	}
}
	


