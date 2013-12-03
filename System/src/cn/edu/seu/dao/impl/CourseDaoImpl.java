package cn.edu.seu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import cn.edu.seu.dao.CourseDao;
import cn.edu.seu.pojo.Course;

public class CourseDaoImpl extends HibernateDaoSupport implements CourseDao {
	/**
	 * 根据标识属性来加载Course实例
	 */
	@Override
	public Course load(Long id) {
		
		return getHibernateTemplate().load(Course.class, id);
		
		
	}
	/**
     * 持久化指定的Course实例 
     * @param Course 需要被持久化的Course实例
     * @return Course 实例被持久化后的标识属性值
     */
	@Override
	public void addOne(Course course) {
		
		System.out.println("course"+course.getCourseName());
		getHibernateTemplate().save(course);
		
		
	}
	/**
	 * 删除指定的Course实例
	 * @param Course 需要被删除的Course实例
	 */
	@Override
	public void deleteOne(Course course) {
		try{
		getHibernateTemplate().delete(course);
		}
		catch(Exception e)
		{
			
		}
	}
	/**
	 * 修改指定的Course实例
	 * @param Course 需要被修改的Course实例
	 */
	@Override
	public void updateOne(Course course) {
		try{
		getHibernateTemplate().update(course);
		}
		catch(Exception e)
		{
			
		}
	}
	/**
	 * 根据名称查询课程信息
	 * @param Course 需要查询的课程
	 * @return 该课程对应的课程信息
	 */
	public List<Course> findByNumber(String courseName) {
		try{
		
			String sql="from Course c where c.courseName like '%"+courseName+"%'";
			 List<Course> list=getHibernateTemplate().find(sql);
			 return list;
		}
		catch(Exception e)
		{
			return null;
		}
		}
	
	
	
	
			
}
