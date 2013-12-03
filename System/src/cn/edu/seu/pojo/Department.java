package cn.edu.seu.pojo;

import java.util.Set;

public class Department {
	private long departmentId;
	   public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	/** @pdOid d7e7d978-d4b3-4daa-9206-aac5c6d840d4 */
	   private String departmentName;
	   private Set classes;
	 public Set getClasses() {
		return classes;
	}
	public void setClasses(Set classes) {
		this.classes = classes;
	}

	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	

}
