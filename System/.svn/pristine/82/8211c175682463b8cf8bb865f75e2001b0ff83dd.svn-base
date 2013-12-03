package cn.edu.seu.action;



import java.util.List;

import cn.edu.seu.pojo.Cclass;
import cn.edu.seu.pojo.Course;
import cn.edu.seu.pojo.Student;
import cn.edu.seu.service.HteacherService;

public class HteacherAction {
	private HteacherService Hteacherservice;
	private Long studentNumber;
	private Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Long getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(Long studentNumber) {
		this.studentNumber = studentNumber;
	}

	private Course  course;
	private Cclass classes;
	private List list;
	private List Score;
	private List tc;
	private List hs;
	
	
	public List getTc() {
		return tc;
	}
	public void setTc(List tc) {
		this.tc = tc;
	}
	public List getHs() {
		return hs;
	}
	public void setHs(List hs) {
		this.hs = hs;
	}
	public List getScore() {
		return Score;
	}
	public void setScore(List score) {
		Score = score;
	}
	public HteacherService getHteacherservice() {
		return Hteacherservice;
	}
	public void setHteacherservice(HteacherService hteacherservice) {
		this.Hteacherservice = hteacherservice;
	}
	//public Student getStudent() {
	//	return student;
	//}
	//public void setStudent(Student student) {
	//	this.student = student;
	//}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Cclass getClasses() {
		return classes;
	}
	public void setClasses(Cclass classes) {
		this.classes = classes;
	}
	
	public String findByStu()
	{
		System.out.println(student.getStudentNumber()+"dd");
		
		list = Hteacherservice.findByStu(student.getStudentNumber());
		
		tc =list;
		return "single";
	}
	
	public String findByCla()
	{
		System.out.println(classes.getClassName()+"dd");
		list = Hteacherservice.findByCla(classes.getClassName());
		Score = list;
		return "all";
	}
	
	public String findByCou()
	{
		list = Hteacherservice.findByCou(course.getCourseName());
		hs = list;
		return"lesson";
	}

}
