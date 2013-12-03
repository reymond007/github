package cn.edu.seu.action;

import java.util.List;
import java.util.Map;

import cn.edu.seu.pojo.AddScore;
import cn.edu.seu.pojo.Score;
import cn.edu.seu.pojo.Student;
import cn.edu.seu.pojo.User;
import cn.edu.seu.service.ScoreMaintainService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ScoreMaintainAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8411577625249957486L;
	private ScoreMaintainService scoreMaintainService;
	private String courseName;
	private List<AddScore> addScoreList;

	private List<Student> studentList;
	private List<Score> scoreList;
	public List<AddScore> getAddScoreList() {
		return addScoreList;
	}
	public void setAddScoreList(List<AddScore> addScoreList) {
		this.addScoreList = addScoreList;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public List<Score> getScoreList() {
		return scoreList;
	}
	public void setScoreList(List<Score> scoreList) {
		this.scoreList = scoreList;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public ScoreMaintainService getScoreMaintainService() {
		return scoreMaintainService;
	}
	public void setScoreMaintainService(ScoreMaintainService scoreMaintainService) {
		this.scoreMaintainService = scoreMaintainService;
	}
	public String addScore()
	{
		System.out.println("addScore action start");
		if(scoreMaintainService.addScore(scoreList))
		{
			System.out.println("add score success!");
			return "success";
		}
		return "failed";
	}
	public String updateScore()
	{
		System.out.println("updateScore action start");		
		if(scoreMaintainService.updateScore(scoreList))
		{
			System.out.println("update score success!");
			return "updateScore";
		}
		return "failed";		
	}
	public String selectScoreByCourse()
	{
		System.out.println("selectScoreByCoures action start");
		Map<String, Object> session = ActionContext.getContext().getSession();
		User user=(User)session.get("user");
		session.put("courseName", courseName);
		this.scoreList = scoreMaintainService.selectScoreByCourse(courseName,user);
		return "selectScoreByCourse";
	}
	public String selectStudentByCourse()
	{
		System.out.println("selectStudentByCoures action start");
		Map<String, Object> session = ActionContext.getContext().getSession();
		User user=(User)session.get("user");
		session.put("courseName", courseName);
		//this.studentList = scoreMaintainService.selectStudentByCourse(courseName,user);
		this.addScoreList = scoreMaintainService.selectStudentByCourse(courseName,user);
        System.out.println(addScoreList.isEmpty());
		return "success";
	}
	public String deleteScore()
	{
		System.out.println("deleteScore action start");
		if(scoreMaintainService.deleteScore(scoreList))
			return "success";
		return "failed";
	}
	
	public String showScore()
	{
        for(Score s : scoreList) {
            System.out.println(s.getStudentNumber() + " | "+ s.getScore());
        }
        return SUCCESS;
	}
	
}
