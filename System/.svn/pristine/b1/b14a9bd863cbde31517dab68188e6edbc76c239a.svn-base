package cn.edu.seu.service.impl;
import cn.edu.seu.dao.impl.*;
import java.util.ArrayList;
import java.util.List;

import cn.edu.seu.dao.ScoreDao;
import cn.edu.seu.dao.StudentDao;
import cn.edu.seu.pojo.*;
import cn.edu.seu.service.ScoreService;

public class ScoreServiceImpl implements ScoreService {
	 private ScoreDao scoreDao;
	// private TeacherDao teacherDao;
	   public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	private StudentDao studentDao;
	   public void setScoreDao(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}

	/** @pdOid 6800a371-ede1-4752-9917-265fcf933904 */
	   public PageBean inquireScore(String className,String lesson,int page) {
		 
		   
	      // TODO: implement
			
		   int pageSize=5;
		   final int offset = PageBean.countOffset(pageSize, page);
		   final int length = pageSize;
		   final int currentPage = PageBean.countCurrentPage(page);
		   List list = scoreDao.inquireScore(className,lesson, offset,length);
		   int allRow = scoreDao.getAllCount();
		   int totalPage=PageBean.countTotalPage(pageSize, allRow);



		   PageBean pageBean = new PageBean();
		   		pageBean.setPageSize(pageSize);
		   pageBean.setCurrentPage(currentPage);
		   		pageBean.setAllRow(allRow);
		   		pageBean.setTotalPage(totalPage);
		   		pageBean.setList(list);
		   		pageBean.init();
		   		return pageBean;
		   	  
	   }
	   
	   /** @pdOid 8ac1f5a1-33f0-44f3-888c-e20fdfff6418 */
	   public PageBean inquireAverageScore(String department,String lesson,int page) {
			
		   int pageSize=5;
		   final int offset = PageBean.countOffset(pageSize, page);
		   final int length = pageSize;
		   final int currentPage = PageBean.countCurrentPage(page);
		   List list = scoreDao.inquireAverageScore(department,lesson, offset,length);
		   int allRow = scoreDao.getAllCount();
		   int totalPage=PageBean.countTotalPage(pageSize, allRow);



		   PageBean pageBean = new PageBean();
		   		pageBean.setPageSize(pageSize);
		   pageBean.setCurrentPage(currentPage);
		   		pageBean.setAllRow(allRow);
		   		pageBean.setTotalPage(totalPage);
		   		pageBean.setList(list);
		   		pageBean.init();
		   		return pageBean;
		   	  
	   }
	   
	   /** @pdOid e421e9ee-9eeb-4beb-a172-b1e65c49433c */
	   public PageBean inquirePassScore(String department,String lesson,int page) {
		
		   
		   
			
		   int pageSize=5;
		   final int offset = PageBean.countOffset(pageSize, page);
		   final int length = pageSize;
		   final int currentPage = PageBean.countCurrentPage(page);
		   List list = scoreDao.inquirePassScore(department,lesson, offset,length);
		   int allRow = scoreDao.getAllCount();
		   int totalPage=PageBean.countTotalPage(pageSize, allRow);



		   PageBean pageBean = new PageBean();
		   		pageBean.setPageSize(pageSize);
		   pageBean.setCurrentPage(currentPage);
		   		pageBean.setAllRow(allRow);
		   		pageBean.setTotalPage(totalPage);
		   		pageBean.setList(list);
		   		pageBean.init();
		   		return pageBean;
		   	  
	     
	   }
	   
	   /** @pdOid 203372a5-fe08-4d17-97ba-7f9050c66e2a */
	   public PageBean inquireTotalScore(String department,String lesson,int page) {
	
int pageSize=5;
final int offset = PageBean.countOffset(pageSize, page);
final int length = pageSize;
final int currentPage = PageBean.countCurrentPage(page);
List list = scoreDao.inquireTotalScore(department,lesson, offset,length);
int allRow = scoreDao.getAllCount();
int totalPage=PageBean.countTotalPage(pageSize, allRow);



PageBean pageBean = new PageBean();
		pageBean.setPageSize(pageSize);
pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage);
		pageBean.setList(list);
		pageBean.init();
		return pageBean;
	  
		 
	   }
	   
	   /** @pdOid c7c0e329-c488-480f-aae8-788897d9cd8b */
	   public PageBean inquireSortScore(String department,String lesson,int page) {
		
		   
	      // TODO: implement
			
		   int pageSize=5;
		   final int offset = PageBean.countOffset(pageSize, page);
		   final int length = pageSize;
		   final int currentPage = PageBean.countCurrentPage(page);
		   List list = scoreDao.inquireSortScore(department,lesson, offset,length);
		   int allRow = scoreDao.getAllCount();
		   int totalPage=PageBean.countTotalPage(pageSize, allRow);



		   PageBean pageBean = new PageBean();
		   		pageBean.setPageSize(pageSize);
		   pageBean.setCurrentPage(currentPage);
		   		pageBean.setAllRow(allRow);
		   		pageBean.setTotalPage(totalPage);
		   		pageBean.setList(list);
		   		pageBean.init();
		   		return pageBean;
		   	  
	   }
	   
	   /** @pdOid 2d707cf1-98ca-47af-bc36-fcaf6f11b08f */
	   public void setScoreDao() {
	      // TODO: implement
	   }
	   
	   /** @pdOid 2e1a675a-e6fd-4a94-b92c-05fa4b52fff5 */
	   public ScoreDao getScoreDao() {
	      // TODO: implement
	      return null;
	   }

}
