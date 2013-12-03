package cn.edu.seu.pojo;

import java.util.Set;

public class Teacher {
	private long teacherId;

	private String teacherName;

	private Integer age;

	private long teacherNumber;

	private String status;
	private Course courses;
	private Set glesson;
	private String department;
	private String address;
	private String mailAddress;
	private String professionLevel;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getProfessionLevel() {
		return professionLevel;
	}

	public void setProfessionLevel(String professionLevel) {
		this.professionLevel = professionLevel;
	}

	private String password;

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	private Character sex;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public long getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(long teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	public Course getCourses() {
		return courses;
	}

	public void setCourses(Course courses) {
		this.courses = courses;
	}

	public Set getGlesson() {
		return glesson;
	}

	public void setGlesson(Set glesson) {
		this.glesson = glesson;
	}
}
