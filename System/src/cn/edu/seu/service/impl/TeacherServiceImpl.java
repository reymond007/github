package cn.edu.seu.service.impl;

import java.util.List;

import cn.edu.seu.dao.TeacherDao;
import cn.edu.seu.pojo.Course;
import cn.edu.seu.service.TeacherService;

public class TeacherServiceImpl implements TeacherService{
	
	private TeacherDao Teacherdao;
	

	public TeacherDao getTeacherdao() {
		return Teacherdao;
	}


	public void setTeacherdao(TeacherDao teacherdao) {
		this.Teacherdao = teacherdao;
	}


	@Override
	public List findScoByCnam(String courseName) {
		// TODO Auto-generated method stub
		List l = Teacherdao.findScoByCnam(courseName);
		return l;
	}





	
}
