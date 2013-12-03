package cn.edu.seu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import cn.edu.seu.dao.StudentInfoDao;
import cn.edu.seu.pojo.Student;

public class StudentInfoDaoImpl extends HibernateDaoSupport implements StudentInfoDao {
	/**
	 * 根据标识属性来加载Student实例
	 * @param id 需要加载的Student实例的标识属性值
	 * @return 指定标识属性对应的Student实例
	 */
	@Override
	public Student load(Long id) {
		return getHibernateTemplate().load(Student.class, id);
	}
	/**
     * 持久化指定的Student实例 
     * @param student 需要被持久化的Student实例
     * @return Student 实例被持久化后的标识属性值
     */
	@Override
	public void addOne(Student student) {
		
		getHibernateTemplate().save(student);
	}
	/**
	 * 删除指定的Student实例
	 * @param student 需要被删除的Student实例
	 */
	@Override
	public void deleteOne(Student student) {
		/*Student s = new Student();
		s.setStudentnumber(student.getStudentnumber());
		List <Student> stulist = getHibernateTemplate().findByExample(s);
		for (Student sl : stulist)
		{
			System.out.println(sl.getSex());
			Student sd = this.getHibernateTemplate().load(Student.class, sl.getStudentid());
			getHibernateTemplate().delete(sd);
		}*/
		getHibernateTemplate().delete(student);
	}
	/**
	 * 修改指定的Student实例
	 * @param student 需要被修改的Student实例
	 */
	@Override
	public void updateOne(Student student) {
		//Student sd = this.getHibernateTemplate().load(Student.class, new Long(32));
		/*System.out.println(sd.getStudentid());
		Student s=new Student();
		s.setSex("1");
		System.out.println(s.getSex());
		sd.setSex("2");
		System.out.println(sd.getSex());*/
		//sd.setSex(student.getSex());
		getHibernateTemplate().update(student);
	}
	/**
	 * 根据学号查询学生信息
	 * @param student 需要查询的学生
	 * @return 该学生对应的学生信息
	 */
	@Override
	public List<Student> findByNumber(Student student) {
		return (List<Student>)getHibernateTemplate().findByExample(student);
	}
			
}
