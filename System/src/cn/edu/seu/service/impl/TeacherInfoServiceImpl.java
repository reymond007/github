package cn.edu.seu.service.impl;

import java.util.List;

import cn.edu.seu.dao.TeacherInfoDao;
import cn.edu.seu.pojo.Teacher;
import cn.edu.seu.service.TeacherInfoService;

public class TeacherInfoServiceImpl implements TeacherInfoService{
	
	private TeacherInfoDao teacherInfoDao;

	public TeacherInfoDao getTeacherInfoDao() {
		return teacherInfoDao;
	}

	public void setTeacherInfoDao(TeacherInfoDao teacherInfoDao) {
		this.teacherInfoDao = teacherInfoDao;
	}
    /**
     * 添加单个教师信息
     * @param teacher 需要添加的教师
     */
	@Override
	public void addOne(Teacher teacher) {
	
		teacherInfoDao.addOne(teacher);	
	}
	/**
     * 删除单个教师信息
     * @param teacher 需要删除的教师
     */
	@Override
	public void deleteOne(Teacher teacher) {
		Teacher t = new Teacher();
		//用户输入的查询条件
		t.setTeacherNumber(teacher.getTeacherNumber());
		//找出所需教师信息
		List <Teacher> tealist = teacherInfoDao.findByNumber(t);
		//删除操作
		for (Teacher tl : tealist)
		{
			System.out.println(tl.getTeacherNumber());
			Teacher tc = teacherInfoDao.load(tl.getTeacherId());
			teacherInfoDao.deleteOne(tc);
		}
		
	}
	/**
     * 修改单个教师信息
     * @param teacher 需要修改的教师
     */
	@Override
	public void updateOne(Teacher teacher) {
		Teacher t = new Teacher();
		t.setTeacherNumber(teacher.getTeacherNumber());
		List <Teacher> tealist = teacherInfoDao.findByNumber(t);
		Teacher tc = teacherInfoDao.load(tealist.get(0).getTeacherId());
		//tc.setPassword(teacher.getPassword());
		tc.setTeacherName(teacher.getTeacherName());
		tc.setSex(teacher.getSex());
		tc.setAge(teacher.getAge());
		//tc.setDepartment(teacher.getDepartment());
		//tc.setAddress(teacher.getAddress());
		//tc.setStatus(teacher.getStatus());
		//tc.setMailAddress(teacher.getMailAddress());
		//tc.setProfessionLevel(teacher.getProfessionLevel());
		teacherInfoDao.updateOne(tc);
	}

	@Override
	public List<Teacher> findByNumber(Teacher teacher) {
		return teacherInfoDao.findByNumber(teacher);
	}
	
}
