package cn.edu.seu.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.edu.seu.dao.ScoreMaintainDao;
import cn.edu.seu.pojo.AddScore;
import cn.edu.seu.pojo.Course;
import cn.edu.seu.pojo.Score;
import cn.edu.seu.pojo.Student;

public class ScoreMaintainDaoImpl extends HibernateDaoSupport implements ScoreMaintainDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<AddScore> selectStudentByCourse(String courseName,Long teacherNumber) {
		// TODO Auto-generated method stub
		System.out.println("select student info by course start!");
		String sql="select new Student(s.studentNumber,s.studentName)  from Student s join s.courseSelector c join c.glesson g where g.courseName='"
				+ courseName + "' and g.teacherNumber="+teacherNumber;
		
		List<Student> studentList=new ArrayList<Student>();
		try{
		studentList = getHibernateTemplate().find(sql);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		String sql2="from Score s where s.courseName='"+courseName+"' and s.teacherNumber="
				+teacherNumber;
		List<Score> scoreList=new ArrayList<Score>();
		try{
		scoreList = getHibernateTemplate().find(sql2);
		System.out.println("sql exeuted!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		List<AddScore> list = new ArrayList<AddScore>();

		System.out.println(studentList.isEmpty());
		System.out.println(scoreList.isEmpty());
		for(Student student:studentList)
		{
			for(Score score:scoreList)
			{
				if(student.getStudentNumber()==score.getStudentNumber())
				{
					AddScore addScore = new AddScore();
					addScore.setBasePoint(score.getBasePoint());
					addScore.setCourseName(score.getCourseName());
					addScore.setScore(score.getScore());
					addScore.setScoreId(score.getScoreId());
					addScore.setStudentName(student.getStudentName());
					addScore.setStudentNumber(score.getStudentNumber());
					addScore.setTeacherNumber(score.getTeacherNumber());
					list.add(addScore);//......�Һ�����
				}
			}
		}
		//getHibernateTemplate().load(Student.class, new Long(70));
		System.out.println("sql exeuted!");
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<Score> selectScoreByCourse(String courseName,Long teacherNumber)
	{
		System.out.println("select score info by course start!");
		String sql="from Score s where s.courseName='"+courseName+"' and s.teacherNumber="
				+teacherNumber;
		List<Score> list=new ArrayList<Score>();
		try{
		list = getHibernateTemplate().find(sql);
		System.out.println("sql exeuted!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean addScore(Score score) {
		// TODO Auto-generated method stub
		System.out.println("update score start!");
		try {
			getHibernateTemplate().saveOrUpdate(score);
			throw new SQLException();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("sql exeuted!");
		return true;
	}

	@Override
	public boolean deleteScore(Score score) {
		// TODO Auto-generated method stub
		System.out.println("delete score start!");
		try {
			getHibernateTemplate().delete(score);
			throw new SQLException();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("sql exeuted!");
		return true;
	}

	@Override
	public boolean updateScore(Score score) {
		// TODO Auto-generated method stub
		System.out.println("update score dao start!");
		try {
			getHibernateTemplate().update(score);
			System.out.println("sql exeuted!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Course> selectCourseByName(String courseName) {
		// TODO Auto-generated method stub
		String sql = "from Course c where c.courseName='"+courseName+"'";
		List<Course> list = new ArrayList<Course>();
		try{
		list = getHibernateTemplate().find(sql);
		System.out.println("sql exeuted!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}

}
