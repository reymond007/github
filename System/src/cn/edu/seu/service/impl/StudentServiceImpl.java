package cn.edu.seu.service.impl;

import java.util.List;

import cn.edu.seu.dao.StudentDao;
import cn.edu.seu.pojo.Student;
import cn.edu.seu.service.StudentService;

public class StudentServiceImpl implements StudentService{
	
	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
    /**
     * 添加单个学生信息
     * @param student 需要添加的学生
     */
	@Override
	public void addOne(Student student) {
	
		studentDao.addOne(student);	
	}
	/**
     * 删除单个学生信息
     * @param student 需要删除的学生
     */
	@Override
	
	public void deleteOne(Student student) {
		/*
		Student s = new Student();
		//用户输入的查询条件
		s.setStudentNumber(student.getStudentNumber());
		//找出所需学生信息
		List <Student> stulist = studentDao.findByNumber(s);
		//删除操作
		for (Student sl : stulist)
		{
			System.out.println(sl.getStudentNumber());
			Student sd = studentDao.load(sl.getStudentId());
			studentDao.deleteOne(sd);
		}
		*/
	
	}
	/**
     * 修改单个学生信息
     * @param student 需要修改的学生
     */
	@Override
	public void updateOne(Student student) {
		Student sd = studentDao.load(new Long(73));
		sd.setSex(student.getSex());
		studentDao.updateOne(sd);	
	}

	@Override
	public List<Student> findByNumber(Student student) {
		//return studentDao.findByNumber(student);
		return null;
	}

	@Override
	public List findScoreByNum(Long studentNumber) {
		List l = studentDao.findScoreByNum(studentNumber);
	    return l; 
		
	}

	
	
}
