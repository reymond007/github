package cn.edu.seu.action;

import java.util.List;

import cn.edu.seu.pojo.Course;
import cn.edu.seu.pojo.Teacher;
import cn.edu.seu.service.TeacherService;

public class TeacherAction {
	private TeacherService Teacherservice;
	private  Teacher teacher;
	private  List list;
	private Course course;
	private List Sb;
	
	
	public List getSb() {
		return Sb;
	}
	public void setSb(List sb) {
		Sb = sb;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public TeacherService getTeacherservice() {
		return Teacherservice;
	}
	public void setTeacherservice(TeacherService teacherservice) {
		this.Teacherservice = teacherservice;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
	public String findScoByCnam()
	{
     list = Teacherservice.findScoByCnam(course.getCourseName());
	  //System.out.println(course.getCourseName());
     Sb = list;
	  return "sb";
		
		
		
	}
	

}
