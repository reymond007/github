package cn.edu.seu.service.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import cn.edu.seu.dao.ScoreMaintainDao;
import cn.edu.seu.pojo.AddScore;
import cn.edu.seu.pojo.Course;
import cn.edu.seu.pojo.Score;
import cn.edu.seu.pojo.User;
import cn.edu.seu.service.ScoreMaintainService;

public class ScoreMaintainServiceImpl implements ScoreMaintainService {

	private ScoreMaintainDao scoreMaintainDao;

	public ScoreMaintainDao getScoreMaintainDao() {
		return scoreMaintainDao;
	}

	public void setScoreMaintainDao(ScoreMaintainDao scoreMaintainDao) {
		this.scoreMaintainDao = scoreMaintainDao;
	}

	@Override
	public boolean addScore(List<Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.println("addscore service start!");
		for (Score score : scoreList) {
			scoreMaintainDao.addScore(score);
		}
		return true;
	}

	public List<AddScore> selectStudentByCourse(String courseName, User user) {
		// TODO Auto-generated method stub
		System.out.println("selectStudentByCourse service start!");
		if (selectCourseByName(courseName)) {
			Long teacherNumber = user.getName();
			return scoreMaintainDao.selectStudentByCourse(courseName,
					teacherNumber);
		} else {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType("text/html;charset=UTF-8");
			try {
				PrintWriter out = response.getWriter();
				out.flush();
				out.println("<script>");
				out.println("alert('此课程名不存在！')");
				out.println("history.back();");
				out.println("</script>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}

	}

	@Override
	public boolean deleteScore(List<Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.println("deletescore service start!");
		for (Score score : scoreList) {
			scoreMaintainDao.deleteScore(score);
		}
		return true;
	}

	@Override
	public boolean updateScore(List<Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.println("updatescore service start!");
		for (Score score : scoreList) {
			scoreMaintainDao.updateScore(score);
		}
		return true;
	}

	@Override
	public List<Score> selectScoreByCourse(String courseName, User user) {
		// TODO Auto-generated method stub
		System.out.println("selectStudentByCourse service start!");
		if (selectCourseByName(courseName)) {
			Long teacherNumber = user.getName();
			return scoreMaintainDao.selectScoreByCourse(courseName,
					teacherNumber);
		} else {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType("text/html;charset=UTF-8");
			try {
				PrintWriter out = response.getWriter();
				out.flush();
				out.println("<script>");
				out.println("alert('此课程名不存在！')");
				out.println("history.back();");
				out.println("</script>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	}

	@Override
	public boolean selectCourseByName(String courseName) {
		// TODO Auto-generated method stub
		List<Course> list = new ArrayList<Course>();
		list = scoreMaintainDao.selectCourseByName(courseName);
		if (!list.isEmpty())
			return true;
		return false;
	}

}
