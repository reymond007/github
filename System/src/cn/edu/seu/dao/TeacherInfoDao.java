
package cn.edu.seu.dao;

import java.util.List;

import cn.edu.seu.pojo.Teacher;

public interface TeacherInfoDao {
	/**
     * 根据标识属性来加载Teacher实例 
     * @param id 需要加载的Teacher实例标识属性值
     * @return 指定标识属性对应的Teacher 实例
     */
	Teacher load(Long id);
    /**
     * 持久化指定的Teacher实例 
     * @param teacher 需要被持久化的Teacher实例
     * @return Teacher 实例被持久化后的标识属性值
     */
	void addOne(Teacher teacher);
	/**
	 * 删除指定的Teacher实例
	 * @param teacher 需要被删除的Teacher实例
	 */
	void deleteOne(Teacher teacher);
	/**
	 * 修改指定的Teacher实例
	 * @param teacher 需要被修改的Teacher实例
	 */
	void updateOne(Teacher teacher);
	/**
	 * 根据工号查询教师信息
	 * @param teacher 需要查询的教师
	 * @return 该教师对应的教师信息
	 */
	List<Teacher> findByNumber(Teacher teacher);
	
}

