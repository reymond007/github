
package cn.edu.seu.dao;

import java.util.List;

import cn.edu.seu.pojo.Teacher;

public interface TeacherInfoDao {
	/**
     * ���ݱ�ʶ����������Teacherʵ�� 
     * @param id ��Ҫ���ص�Teacherʵ����ʶ����ֵ
     * @return ָ����ʶ���Զ�Ӧ��Teacher ʵ��
     */
	Teacher load(Long id);
    /**
     * �־û�ָ����Teacherʵ�� 
     * @param teacher ��Ҫ���־û���Teacherʵ��
     * @return Teacher ʵ�����־û���ı�ʶ����ֵ
     */
	void addOne(Teacher teacher);
	/**
	 * ɾ��ָ����Teacherʵ��
	 * @param teacher ��Ҫ��ɾ����Teacherʵ��
	 */
	void deleteOne(Teacher teacher);
	/**
	 * �޸�ָ����Teacherʵ��
	 * @param teacher ��Ҫ���޸ĵ�Teacherʵ��
	 */
	void updateOne(Teacher teacher);
	/**
	 * ���ݹ��Ų�ѯ��ʦ��Ϣ
	 * @param teacher ��Ҫ��ѯ�Ľ�ʦ
	 * @return �ý�ʦ��Ӧ�Ľ�ʦ��Ϣ
	 */
	List<Teacher> findByNumber(Teacher teacher);
	
}

