
package cn.edu.seu.dao;

import java.util.List;

import cn.edu.seu.pojo.Hteacher;

public interface HteacherInfoDao {
	/**
     * 根据标识属性来加载Hteacher实例 
     * @param id 需要加载的Hteacher实例标识属性值
     * @return 指定标识属性对应的Hteacher 实例
     */
	Hteacher load(Long id);
    /**
     * 持久化指定的Hteacher实例 
     * @param hteacher 需要被持久化的Hteacher实例
     * @return Hteacher 实例被持久化后的标识属性值
     */
	void addOne(Hteacher hteacher);
	/**
	 * 删除指定的Hteacher实例
	 * @param hteacher 需要被删除的Hteacher实例
	 */
	void deleteOne(Hteacher hteacher);
	/**
	 * 修改指定的Hteacher实例
	 * @param hteacher 需要被修改的Hteacher实例
	 */
	void updateOne(Hteacher hteacher);
	/**
	 * 根据工号号查询教务员信息
	 * @param hteacher 需要查询的教务员
	 * @return 该教务员对应的教务员信息
	 */
	List<Hteacher> findByNumber(Hteacher hteacher);
	
}

