package cn.edu.seu.pojo;

public class User {
private Long name;
private String pwd;
private int jurisdiction;
private String verificationCode;
public String getVerificationCode() {
	return verificationCode;
}
public void setVerificationCode(String verificationCode) {
	this.verificationCode = verificationCode;
}
public int getJurisdiction() {
	return jurisdiction;
}
public void setJurisdiction(int jurisdiction) {
	this.jurisdiction = jurisdiction;
}

public Long getName() {
	return name;
}
public void setName(Long name) {
	this.name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
}
