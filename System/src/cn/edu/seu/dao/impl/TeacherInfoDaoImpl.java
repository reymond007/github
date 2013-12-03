package cn.edu.seu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import cn.edu.seu.dao.TeacherInfoDao;
import cn.edu.seu.pojo.Teacher;

public class TeacherInfoDaoImpl extends HibernateDaoSupport implements TeacherInfoDao {
	/**
	 * ���ݱ�ʶ����������Teacherʵ��
	 * @param id ��Ҫ���ص�Teacherʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Teacherʵ��
	 */
	@Override
	public Teacher load(Long id) {
		return getHibernateTemplate().load(Teacher.class, id);
	}
	/**
     * �־û�ָ����Teacherʵ�� 
     * @param teacher ��Ҫ���־û���Teacherʵ��
     * @return Teacher ʵ�����־û���ı�ʶ����ֵ
     */
	@Override
	public void addOne(Teacher teacher) {
		
		getHibernateTemplate().save(teacher);
	}
	/**
	 * ɾ��ָ����Teacherʵ��
	 * @param teacher ��Ҫ��ɾ����Teacherʵ��
	 */
	@Override
	public void deleteOne(Teacher teacher) {
		
		getHibernateTemplate().delete(teacher);
	}
	/**
	 * �޸�ָ����Teacherʵ��
	 * @param teacher ��Ҫ���޸ĵ�Teacherʵ��
	 */
	@Override
	public void updateOne(Teacher teacher) {
		
		getHibernateTemplate().update(teacher);
	}
	/**
	 * ���ݹ��Ų�ѯ��ʦ��Ϣ
	 * @param teacher ��Ҫ��ѯ�Ľ�ʦ
	 * @return �ý�ʦ��Ӧ�Ľ�ʦ��Ϣ
	 */
	@Override
	public List<Teacher> findByNumber(Teacher teacher) {
		return (List<Teacher>)getHibernateTemplate().findByExample(teacher);
	}
			
}
