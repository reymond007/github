package cn.edu.seu.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.HibernateQueryException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.edu.seu.dao.UserDao;
import cn.edu.seu.pojo.Hteacher;
import cn.edu.seu.pojo.Student;
import cn.edu.seu.pojo.Teacher;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@SuppressWarnings("unchecked")
	@Override
	public boolean selectStudent(Long studentNumber, String password) {
		// TODO Auto-generated method stub
		System.out.println("selectStudent start!");
		String sql="from Student s where s.studentNumber="
		+studentNumber+" and s.password='"+password+"'";
		List<Student> list=new ArrayList<Student>();
		list = getHibernateTemplate().find(sql);
		//getHibernateTemplate().load(Student.class, new Long(70));
		System.out.println("sql exeuted!");
		if(!list.isEmpty())
		{		
			System.out.println("student list is not empty!");
			return true;
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean selectTeacher(Long teacherNumber, String password) {
		// TODO Auto-generated method stub
		System.out.println("selectTeacher start!");
		String sql="from Teacher t where t.teacherNumber="
		+teacherNumber+" and t.password='"+password+"'";
		List<Teacher> list=new ArrayList<Teacher>();
		list = getHibernateTemplate().find(sql);
		//getHibernateTemplate().load(Student.class, new Long(70));
		System.out.println("sql exeuted!");
		if(!list.isEmpty())
		{		
			System.out.println("teacher list is not empty!");
			return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean selectHTeacher(Long hteacherNumber, String password) {
		// TODO Auto-generated method stub
		System.out.println("selectTeacher start!");
		String sql="from Hteacher t where t.hteacherNumber="
		+hteacherNumber+" and t.password='"+password+"'";
		List<Hteacher> list=new ArrayList<Hteacher>();
		try{
		list = getHibernateTemplate().find(sql);
		throw new SQLException();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//getHibernateTemplate().load(Student.class, new Long(70));
		System.out.println("sql exeuted!");
		if(!list.isEmpty())
		{		
			System.out.println("Hteacher list is not empty!");
			return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> selectStudentInfoByNumber(Long studentNumber) {
		// TODO Auto-generated method stub
		System.out.println("select student info by number start!");
		String sql="from Student s where s.studentNumber='"+studentNumber+"'";
		List<Student> list=new ArrayList<Student>();
		try{
		list = getHibernateTemplate().find(sql);
		throw new SQLException();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//getHibernateTemplate().load(Student.class, new Long(70));
		System.out.println("sql exeuted!");
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Teacher> selectTeacherInfoByNumber(Long teacherNumber) {
		// TODO Auto-generated method stub
		System.out.println("select teacher info by number start!");
		String sql="from Teacher t where t.teacherNumber='"+teacherNumber+"'";
		List<Teacher> list=new ArrayList<Teacher>();
		try{
		list = getHibernateTemplate().find(sql);
		throw new SQLException();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//getHibernateTemplate().load(Student.class, new Long(70));
		System.out.println("sql exeuted!");
		return list;
	}

	@Override
	public List<Hteacher> selectHteacherInfoByNumber(Long hteacherNumber) {
		// TODO Auto-generated method stub
		System.out.println("select teacher info by number start!");
		String sql="from Hteacher t where t.hteacherNumber='"+hteacherNumber+"'";
		List<Hteacher> list=new ArrayList<Hteacher>();
		try{
		list = getHibernateTemplate().find(sql);
		throw new SQLException();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//getHibernateTemplate().load(Student.class, new Long(70));
		System.out.println("sql exeuted!");
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> selectStudentInfoByClass(String cClass) {
		// TODO Auto-generated method stub
		System.out.println("select student info by class start!");
		String sql="from Student s where s.className='"+cClass+"'";
		List<Student> list=new ArrayList<Student>();
		try{
		list = getHibernateTemplate().find(sql);
		throw new SQLException();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//getHibernateTemplate().load(Student.class, new Long(70));
		System.out.println("sql exeuted!");
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> selectStudentInfoByCollege(String college) {
		// TODO Auto-generated method stub
		System.out.println("select student info by college start!");
		String sql="from Student s join s.cclass c join c.department d where d.departmentname='"+college+"'";
		List<Student> list=new ArrayList<Student>();
		try{
		list = getHibernateTemplate().find(sql);
		throw new SQLException();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//getHibernateTemplate().load(Student.class, new Long(70));
		System.out.println("sql exeuted!");
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Teacher> selectTeacherInfoByCollege(String college) {
		// TODO Auto-generated method stub
		System.out.println("select teacher info by class start!");
		String sql="from Teacher t where t.department='"+college+"'";
		List<Teacher> list=new ArrayList<Teacher>();
		try{
		list = getHibernateTemplate().find(sql);
		throw new SQLException();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//getHibernateTemplate().load(Student.class, new Long(70));
		System.out.println("sql exeuted!");
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Hteacher> selectHteacherInfoByCollege(String college) {
		// TODO Auto-generated method stub
		System.out.println("select Hteacher info by class start!");
		String sql="from Hteacher t where t.department='"+college+"'";
		List<Hteacher> list=new ArrayList<Hteacher>();
		try{
		list = getHibernateTemplate().find(sql);
		throw new SQLException();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//getHibernateTemplate().load(Student.class, new Long(70));
		System.out.println("sql exeuted!");
		return list;
	}

}
