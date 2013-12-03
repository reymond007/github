package cn.edu.seu.dao;

import java.util.List;

import cn.edu.seu.pojo.Hteacher;
import cn.edu.seu.pojo.Student;
import cn.edu.seu.pojo.Teacher;

public interface UserDao {
boolean selectStudent(Long studentNumber,String password);
boolean selectTeacher(Long teacherNumber,String password);
boolean selectHTeacher(Long HTeacherNumber,String password);
List<Student> selectStudentInfoByNumber(Long studentNumber);
List<Teacher> selectTeacherInfoByNumber(Long teacherNumber);
List<Hteacher> selectHteacherInfoByNumber(Long hteacherNumber);
List<Student> selectStudentInfoByClass(String cClass);
List<Student> selectStudentInfoByCollege(String college);
List<Teacher> selectTeacherInfoByCollege(String college);
List<Hteacher> selectHteacherInfoByCollege(String college);
}
