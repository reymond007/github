package cn.edu.seu.service;

import java.util.List;

import cn.edu.seu.pojo.Student;

public interface StudentInfoService {
	
	void addOne(Student student);
	
	void deleteOne(Student student);
	
	void updateOne(Student student);
	
	List<Student> findByNumber(Student student);
	
}
