package cn.edu.seu.dao;



import java.util.List;

import cn.edu.seu.pojo.*;

public interface HteacherDao {
	List findByStu(Long studentNumber);

	List findByCla(String className);

	List findByCou(String courseName);

	
	

}
