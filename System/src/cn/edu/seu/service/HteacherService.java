package cn.edu.seu.service;

import java.util.List;

import cn.edu.seu.pojo.Cclass;
import cn.edu.seu.pojo.Course;
import cn.edu.seu.pojo.Student;

public interface HteacherService {

	List findByStu(Long studentNumber);

	List findByCla(String className);

	List findByCou(String courseName);

	

}
