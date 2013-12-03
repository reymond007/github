package cn.edu.seu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import cn.edu.seu.dao.HteacherInfoDao;
import cn.edu.seu.pojo.Hteacher;

public class HteacherInfoDaoImpl extends HibernateDaoSupport implements HteacherInfoDao {
	/**
	 * 根据标识属性来加载Hteacher实例
	 * @param id 需要加载的Hteacher实例的标识属性值
	 * @return 指定标识属性对应的Hteacher实例
	 */
	@Override
	public Hteacher load(Long id) {
		return getHibernateTemplate().load(Hteacher.class, id);
	}
	/**
     * 持久化指定的Hteacher实例 
     * @param hteacher 需要被持久化的Hteacher实例
     * @return Hteacher 实例被持久化后的标识属性值
     */
	@Override
	public void addOne(Hteacher hteacher) {
		
		getHibernateTemplate().save(hteacher);
	}
	/**
	 * 删除指定的Hteacher实例
	 * @param hteacher 需要被删除的Hteacher实例
	 */
	@Override
	public void deleteOne(Hteacher hteacher) {
		
		getHibernateTemplate().delete(hteacher);
	}
	/**
	 * 修改指定的Hteacher实例
	 * @param hteacher 需要被修改的Hteacher实例
	 */
	@Override
	public void updateOne(Hteacher hteacher) {
		
		getHibernateTemplate().update(hteacher);
	}
	/**
	 * 根据工号查询教务员信息
	 * @param hteacher 需要查询的教务员
	 * @return 该教务员对应的教务员信息
	 */
	@Override
	public List<Hteacher> findByNumber(Hteacher hteacher) {
		return (List<Hteacher>)getHibernateTemplate().findByExample(hteacher);
	}
			
}
