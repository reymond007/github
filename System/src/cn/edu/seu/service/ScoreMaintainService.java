package cn.edu.seu.service;

import java.util.List;

import cn.edu.seu.pojo.AddScore;
import cn.edu.seu.pojo.Score;
import cn.edu.seu.pojo.User;

public interface ScoreMaintainService {
	boolean addScore(List<Score> scoreList);
    List<AddScore> selectStudentByCourse(String courseName,User user);
    boolean deleteScore(List<Score> scoreList);
    boolean updateScore(List<Score> scoreList);
    List<Score> selectScoreByCourse(String courseName,User user);
    boolean selectCourseByName(String courseName);
}
