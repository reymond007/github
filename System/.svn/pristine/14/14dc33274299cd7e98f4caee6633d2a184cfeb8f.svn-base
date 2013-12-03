
package cn.edu.seu.dao;

import java.util.List;

import cn.edu.seu.pojo.Student;

public interface StudentInfoDao {
	/**
     * 根据标识属性来加载Student实例 
     * @param id 需要加载的Student实例标识属性值
     * @return 指定标识属性对应的Student 实例
     */
	Student load(Long id);
    /**
     * 持久化指定的Student实例 
     * @param student 需要被持久化的Student实例
     * @return Student 实例被持久化后的标识属性值
     */
	void addOne(Student student);
	/**
	 * 删除指定的Student实例
	 * @param student 需要被删除的Student实例
	 */
	void deleteOne(Student student);
	/**
	 * 修改指定的Student实例
	 * @param student 需要被修改的Student实例
	 */
	void updateOne(Student student);
	/**
	 * 根据学号查询学生信息
	 * @param student 需要查询的学生
	 * @return 该学生对应的学生信息
	 */
	List<Student> findByNumber(Student student);
	
}

