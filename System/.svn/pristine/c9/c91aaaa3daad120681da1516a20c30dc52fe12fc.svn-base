package cn.edu.seu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.edu.seu.dao.TeacherDao;
import cn.edu.seu.pojo.Course;
import cn.edu.seu.pojo.Score;

public class TeacherDaoImpl extends HibernateDaoSupport implements TeacherDao {

	@Override
	public List findScoByCnam(String courseName) {
		String query = "from Score s where s.courseName="+courseName;
		List l = getHibernateTemplate()
				.find(query);
		 System.out.println(( (Score)l.get(0)).getStudentNumber());
		// TODO Auto-generated method stub
		return l;
	}

	

}
