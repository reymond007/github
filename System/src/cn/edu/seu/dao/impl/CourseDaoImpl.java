package cn.edu.seu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import cn.edu.seu.dao.CourseDao;
import cn.edu.seu.pojo.Course;

public class CourseDaoImpl extends HibernateDaoSupport implements CourseDao {
	/**
	 * ���ݱ�ʶ����������Courseʵ��
	 */
	@Override
	public Course load(Long id) {
		
		return getHibernateTemplate().load(Course.class, id);
		
		
	}
	/**
     * �־û�ָ����Courseʵ�� 
     * @param Course ��Ҫ���־û���Courseʵ��
     * @return Course ʵ�����־û���ı�ʶ����ֵ
     */
	@Override
	public void addOne(Course course) {
		
		System.out.println("course"+course.getCourseName());
		getHibernateTemplate().save(course);
		
		
	}
	/**
	 * ɾ��ָ����Courseʵ��
	 * @param Course ��Ҫ��ɾ����Courseʵ��
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
	 * �޸�ָ����Courseʵ��
	 * @param Course ��Ҫ���޸ĵ�Courseʵ��
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
	 * �������Ʋ�ѯ�γ���Ϣ
	 * @param Course ��Ҫ��ѯ�Ŀγ�
	 * @return �ÿγ̶�Ӧ�Ŀγ���Ϣ
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