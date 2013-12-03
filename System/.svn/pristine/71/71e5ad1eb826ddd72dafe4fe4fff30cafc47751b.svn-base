package cn.edu.seu.dao.impl;



import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.edu.seu.dao.HteacherDao;
import cn.edu.seu.pojo.Cclass;
import cn.edu.seu.pojo.Course;
import cn.edu.seu.pojo.CourseSelector;
import cn.edu.seu.pojo.Score;
import cn.edu.seu.pojo.Student;

public class HteacherDaoImpl extends HibernateDaoSupport implements HteacherDao{

	@Override
	public List findByStu(Long studentNumber) {
		try{
			
		
		String query = "from Score s where s.studentNumber like '%"+studentNumber+"%'";
        List l=getHibernateTemplate()
         		.find(query);
         
        
		
		
      
        return l;
		}
		catch(Exception e){
			return null;
		
		}
	}

	@Override
	public List findByCla(String className) {
		try{
			
		
		String query = "from Score s where s.student.className like '%"+className+"%'";
		List l = getHibernateTemplate()
				.find(query);
		
		return l;
		}
		catch(Exception e)
		{
			return null;
		}
	}

	@Override
	public List findByCou(String courseName) {
		try{
			
		
		String query = "from Score s where s.courseName like'%"+courseName+"%'";
		List l = getHibernateTemplate()
				.find(query);
		
		// TODO Auto-generated method stub
		return l;
		}
		catch(Exception e)
		{
			return null;
		}
	
	}


}
