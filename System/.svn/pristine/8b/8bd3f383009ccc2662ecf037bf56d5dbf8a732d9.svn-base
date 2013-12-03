package cn.edu.seu.service.impl;

import java.util.List;

import cn.edu.seu.dao.HteacherDao;
import cn.edu.seu.pojo.Cclass;
import cn.edu.seu.pojo.Course;
import cn.edu.seu.pojo.Student;
import cn.edu.seu.service.HteacherService;

public class HteacherServiceImpl implements HteacherService{
	
	private HteacherDao Hteacherdao;
	

	public HteacherDao getHteacherdao() {
		return Hteacherdao;
	}

	public void setHteacherdao(HteacherDao Hteacherdao) {
		this.Hteacherdao = Hteacherdao;
	}

	@Override
	public List findByStu(Long studentNumber) {
		List s = Hteacherdao.findByStu(studentNumber);
		return s;
	}

	@Override
	public List findByCla(String className) {
		List c = Hteacherdao.findByCla(className);
		return c;
	}

	@Override
	public List findByCou(String courseName) {
		// TODO Auto-generated method stub
		List l = Hteacherdao.findByCou(courseName);
		return l;
	}

	
}
