package cn.edu.seu.pojo;

public class Score {
	 private long scoreId;
	 /** @pdOid 7cd11914-101c-4eb2-b2a5-a471486d7b57 */
	   private long studentNumber;
	   /** @pdOid c90b9cad-5834-4fb1-af15-a1c591cbb17f */
	   private long teacherNumber;
	   /** @pdOid bdee8151-186b-45fb-81cf-15a986392a64 */
	   private String courseName;
	   /** @pdOid 0c20c4cd-226c-479b-af80-403ec7a9ffb6 */
	   private float score;
	   /** @pdOid 96fe1c94-04b0-44ef-b006-bb5ec4686909 */
	   private float basePoint;
	   private Student student;
	   private Course course;
	   public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	 public long getScoreId() {
		return scoreId;
	}
	public void setScoreId(long scoreId) {
		this.scoreId = scoreId;
	}
	public long getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(long studentNumber) {
		this.studentNumber = studentNumber;
	}
	public long getTeacherNumber() {
		return teacherNumber;
	}
	public void setTeacherNumber(long teacherNumber) {
		this.teacherNumber = teacherNumber;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public float getBasePoint() {
		return basePoint;
	}
	public void setBasePoint(float basePoint) {
		this.basePoint = basePoint;
	}
	

}
