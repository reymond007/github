package cn.edu.seu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import cn.edu.seu.dao.HteacherInfoDao;
import cn.edu.seu.pojo.Hteacher;

public class HteacherInfoDaoImpl extends HibernateDaoSupport implements HteacherInfoDao {
	/**
	 * ���ݱ�ʶ����������Hteacherʵ��
	 * @param id ��Ҫ���ص�Hteacherʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Hteacherʵ��
	 */
	@Override
	public Hteacher load(Long id) {
		return getHibernateTemplate().load(Hteacher.class, id);
	}
	/**
     * �־û�ָ����Hteacherʵ�� 
     * @param hteacher ��Ҫ���־û���Hteacherʵ��
     * @return Hteacher ʵ�����־û���ı�ʶ����ֵ
     */
	@Override
	public void addOne(Hteacher hteacher) {
		
		getHibernateTemplate().save(hteacher);
	}
	/**
	 * ɾ��ָ����Hteacherʵ��
	 * @param hteacher ��Ҫ��ɾ����Hteacherʵ��
	 */
	@Override
	public void deleteOne(Hteacher hteacher) {
		
		getHibernateTemplate().delete(hteacher);
	}
	/**
	 * �޸�ָ����Hteacherʵ��
	 * @param hteacher ��Ҫ���޸ĵ�Hteacherʵ��
	 */
	@Override
	public void updateOne(Hteacher hteacher) {
		
		getHibernateTemplate().update(hteacher);
	}
	/**
	 * ���ݹ��Ų�ѯ����Ա��Ϣ
	 * @param hteacher ��Ҫ��ѯ�Ľ���Ա
	 * @return �ý���Ա��Ӧ�Ľ���Ա��Ϣ
	 */
	@Override
	public List<Hteacher> findByNumber(Hteacher hteacher) {
		return (List<Hteacher>)getHibernateTemplate().findByExample(hteacher);
	}
			
}
