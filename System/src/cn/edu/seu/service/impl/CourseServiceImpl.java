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
     * ���ӵ����γ���Ϣ
     * @param course ��Ҫ���ӵĿγ�
     */
	@Override
	public void addOne(Course course) {
		System.out.println("course"+course.getCourseName());
		courseDao.addOne(course);	
	}
	/**
     * ɾ������ѧ���γ���Ϣ
     * @param course ��Ҫɾ����ѧ���γ�
     */
	@Override
	public void deleteOne(Course course) {
		//Course s = new Course();
		//�û�����Ĳ�ѯ����
		//s.setCourseNumber(course.getCourseNumber());
		//�ҳ�����γ���Ϣ
		System.out.println("course"+course.getCourseName());
		List <Course> stulist = courseDao.findByNumber(course.getCourseName());
		//ɾ������
		for (Course sl : stulist)
		{
			System.out.println(sl.getCourseNumber());
			Course sd = courseDao.load(sl.getCourseId());
			courseDao.deleteOne(sd);
		}	
	}
	/**
     * �޸ĵ����γ���Ϣ
     * @param course ��Ҫ�޸ĵĿγ�
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