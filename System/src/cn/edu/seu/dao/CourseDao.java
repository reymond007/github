package cn.edu.seu.dao;

//public class CourseDao {

//}

import java.util.List;

import cn.edu.seu.pojo.Course;

public interface CourseDao {
	/**
     * 根据标识属性来加载Course实例 
     */
	Course load(Long id);
    /**
     * 持久化指定的Course实例 
     * @param Course 需要被持久化的Course实例
     * @return Course 实例被持久化后的标识属性值
     */
	void addOne(Course course);
	/**
	 * 删除指定的Course实例
	 * @param Course 需要被删除的Course实例
	 */
	void deleteOne(Course course);
	/**
	 * 修改指定的Course实例
	 * @param Course 需要被修改的Course实例
	 */
	void updateOne(Course course);

	
	List<Course> findByNumber(String courseName);
	
}
