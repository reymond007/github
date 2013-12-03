package cn.edu.seu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import cn.edu.seu.dao.TeacherInfoDao;
import cn.edu.seu.pojo.Teacher;

public class TeacherInfoDaoImpl extends HibernateDaoSupport implements TeacherInfoDao {
	/**
	 * 根据标识属性来加载Teacher实例
	 * @param id 需要加载的Teacher实例的标识属性值
	 * @return 指定标识属性对应的Teacher实例
	 */
	@Override
	public Teacher load(Long id) {
		return getHibernateTemplate().load(Teacher.class, id);
	}
	/**
     * 持久化指定的Teacher实例 
     * @param teacher 需要被持久化的Teacher实例
     * @return Teacher 实例被持久化后的标识属性值
     */
	@Override
	public void addOne(Teacher teacher) {
		
		getHibernateTemplate().save(teacher);
	}
	/**
	 * 删除指定的Teacher实例
	 * @param teacher 需要被删除的Teacher实例
	 */
	@Override
	public void deleteOne(Teacher teacher) {
		
		getHibernateTemplate().delete(teacher);
	}
	/**
	 * 修改指定的Teacher实例
	 * @param teacher 需要被修改的Teacher实例
	 */
	@Override
	public void updateOne(Teacher teacher) {
		
		getHibernateTemplate().update(teacher);
	}
	/**
	 * 根据工号查询教师信息
	 * @param teacher 需要查询的教师
	 * @return 该教师对应的教师信息
	 */
	@Override
	public List<Teacher> findByNumber(Teacher teacher) {
		return (List<Teacher>)getHibernateTemplate().findByExample(teacher);
	}
			
}
