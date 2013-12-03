
package cn.edu.seu.service;

//public class CourseService {


import java.util.List;

//}
import cn.edu.seu.pojo.Course;

public interface CourseService {
	
	void addOne(Course course);
	
	void deleteOne(Course course);
	
	void updateOne(Course course);
	
	List<Course> searchOne(String courseName);
}
