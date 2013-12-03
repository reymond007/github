package cn.edu.seu.service.impl;

import java.util.List;

import cn.edu.seu.dao.StudentInfoDao;
import cn.edu.seu.pojo.Student;
import cn.edu.seu.service.StudentInfoService;

public class StudentInfoServiceImpl implements StudentInfoService{
	
	private StudentInfoDao studentInfoDao;

	public StudentInfoDao getStudentInfoDao() {
		return studentInfoDao;
	}

	public void setStudentInfoDao(StudentInfoDao studentInfoDao) {
		this.studentInfoDao = studentInfoDao;
	}
    /**
     * 添加单个学生信息
     * @param student 需要添加的学生
     */
	@Override
	public void addOne(Student student) {
	
		studentInfoDao.addOne(student);	
	}
	/**
     * 删除单个学生信息
     * @param student 需要删除的学生
     */
	@Override
	public void deleteOne(Student student) {
		Student s = new Student();
		//用户输入的查询条件
		s.setStudentNumber(student.getStudentNumber());
		//找出所需学生信息
		List <Student> stulist = studentInfoDao.findByNumber(s);
		//删除操作
		for (Student sl : stulist)
		{
			System.out.println(sl.getStudentNumber());
			Student sd = studentInfoDao.load(sl.getStudentId());
			studentInfoDao.deleteOne(sd);
		}
		
	}
	/**
     * 修改单个学生信息
     * @param student 需要修改的学生
     */
	@Override
	public void updateOne(Student student) {
		Student s = new Student();
		s.setStudentNumber(student.getStudentNumber());
		List <Student> stulist = studentInfoDao.findByNumber(s);
		Student sd = studentInfoDao.load(stulist.get(0).getStudentId());
		//System.out.println(sd);
		//sd.setPassword(student.getPassword());
		sd.setStudentName(student.getStudentName());
		sd.setSex(student.getSex());
		sd.setAge(student.getAge());
		//sd.setJoinYear(student.getJoinYear());
		//sd.setAddress(student.getAddress());
		//sd.setStatus(student.getStatus());
		//sd.setClassName(student.getClassName());
		studentInfoDao.updateOne(sd);
		//System.out.println(sd);
	}

	@Override
	public List<Student> findByNumber(Student student) {
		return studentInfoDao.findByNumber(student);
	}
	
}
