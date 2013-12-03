package cn.edu.seu.action;

import java.util.List;

import cn.edu.seu.pojo.Course;
import cn.edu.seu.service.CourseService;
import com.opensymphony.xwork2.ActionSupport;

public class CourseAction extends ActionSupport{
	private List courses;
	public List getCourses() {
		return courses;
	}

	public void setCourses(List courses) {
		this.courses = courses;
	}
	private Course course;
	public void setCourse(Course course) {
		this.course = course;
	}
	private  String courseName;
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	private CourseService courseService;

	public Course getCourse() {
		return course;
	}

	public void setStudent(Course course) {
		this.course = course;
	}
		
	public CourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	public String addOne()
	{	
		try{
			courseService.addOne(course);
			return "add";
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	public String deleteOne()
	{
		try
		{
		System.out.println("course"+course.getCourseName());
		courseService.deleteOne(course);
		return "delete";
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
		
	}
	
	public String updateOne()
	{
		try{
		System.out.println("course"+course.getCourseName());
		courseService.updateOne(course);
		return "update";
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	public String searchOne()
	{
		try{
		 courses=courseService.searchOne(courseName);
		return "search";
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	

}