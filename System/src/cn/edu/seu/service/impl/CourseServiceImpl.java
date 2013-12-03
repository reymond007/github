package cn.edu.seu.service.impl;

//public class CourseServiceImpl {

//}

import java.util.List;

import cn.edu.seu.dao.CourseDao;
import cn.edu.seu.pojo.Course;
import cn.edu.seu.service.CourseService;

public class CourseServiceImpl implements CourseService{
	
	private CourseDao courseDao;

	public CourseDao getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
    /**
     * 添加单个课程信息
     * @param course 需要添加的课程
     */
	@Override
	public void addOne(Course course) {
		System.out.println("course"+course.getCourseName());
		courseDao.addOne(course);	
	}
	/**
     * 删除单个学生课程信息
     * @param course 需要删除的学生课程
     */
	@Override
	public void deleteOne(Course course) {
		//Course s = new Course();
		//用户输入的查询条件
		//s.setCourseNumber(course.getCourseNumber());
		//找出所需课程信息
		System.out.println("course"+course.getCourseName());
		List <Course> stulist = courseDao.findByNumber(course.getCourseName());
		//删除操作
		for (Course sl : stulist)
		{
			System.out.println(sl.getCourseNumber());
			Course sd = courseDao.load(sl.getCourseId());
			courseDao.deleteOne(sd);
		}	
	}
	/**
     * 修改单个课程信息
     * @param course 需要修改的课程
     */
	@Override
	public void updateOne(Course course) {
		System.out.println(course.getCourseName());
	    long id=courseDao.findByNumber(course.getCourseName()).get(0).getCourseId();
		Course sd = courseDao.load(id);
		sd.setCourseNumber(course.getCourseNumber());
		sd.setCourseForm(course.getCourseForm());
		sd.setCourseType(course.getCourseType());
		sd.setCreditPoint(course.getCreditPoint());
		sd.setEndTime(course.getEndTime());
		sd.setStartTime(course.getStartTime());
		sd.setScore(course.getScore());
		courseDao.updateOne(sd);	
	
	}

	@Override
	public List<Course> searchOne(String courseName) {
		// TODO Auto-generated method stub
		return courseDao.findByNumber(courseName);
	}
	
}
