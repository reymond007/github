package cn.edu.seu.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.seu.pojo.ScoreList;
import cn.edu.seu.pojo.Student;
import cn.edu.seu.service.ScoreService;
import cn.edu.seu.dao.impl.*;
public class ScoreAction {
	 private static String lesson;
	   /** @pdOid 1a91bfd0-552c-4421-9998-b5a363a5b469 */
	   private static String department;
	   /** @pdOid b22dd4c2-fd77-46a1-8f70-a1bff51a3ec5 */
	   private static String className;
	  // ActionContext actionContext = ActionContext.getContext(); 
      private Map session = ActionContext.getContext().getSession(); 

	   public int getPage() {
		return page;
	}
	   private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPage(int page) {
		this.page = page;
	}

	private int page;
	   public PageBean getPageBean() {
		return pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	private PageBean pageBean;
	

	
	public List getScores() {
		return scores;
	}

	public void setScores(List scores) {
		this.scores = scores;
	}

	private List scores;
	   public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setScoreService(ScoreService scoreService) {
		this.scoreService = scoreService;
	}

	/** @pdOid 06b8a63d-8dfc-4040-bb6e-85675c2af81e */
	   private ScoreService scoreService;
	  
	   
	   /** @pdOid 279e47ca-8166-46f1-afd1-cf2ba9ca3aff */
	   public String averageStatics() { 
		   
		   if(page==0)
			   {
			   page=1;
			   session.put("department", department);
			   session.put("lesson", lesson);
			   }
			department=(String)session.get("department");
			lesson=(String)session.get("lesson");
			
			System.out.println(department+lesson+"page"+page);
	if(type=="asc")
		pageBean.setCurrentPage(pageBean.getCurrentPage()+1);
	if(type=="desc")
		pageBean.setCurrentPage(pageBean.getCurrentPage()-1);
		   pageBean = scoreService.inquireAverageScore( department,lesson,page);
		   scores=pageBean.getList();
	      return "average";
	   }
	   
	   /** @pdOid cde5b45f-4513-44ee-b4b6-76a680901238 */
	   public String lessonStatics() {

		   if(page==0)page=1;
			
	if(type=="asc")
		pageBean.setCurrentPage(pageBean.getCurrentPage()+1);
	if(type=="desc")
		pageBean.setCurrentPage(pageBean.getCurrentPage()-1);
		   pageBean = scoreService.inquireScore( className,lesson,page);
		   scores=pageBean.getList();
	      return "lesson";
	   }
	   
	   /** @pdOid 56335170-1d73-463c-85c0-29a992a2db72 */
	   public String scoreSortStatics() {

		   if(page==0)page=1;
			
	if(type=="asc")
		pageBean.setCurrentPage(pageBean.getCurrentPage()+1);
	if(type=="desc")
		pageBean.setCurrentPage(pageBean.getCurrentPage()-1);
		   pageBean = scoreService.inquireSortScore( department,lesson,page);
		   scores=pageBean.getList();
	      return "sort";
	   }
	   
	   /** @pdOid 0b955a3b-2362-4a48-a5e9-f3da5cf0d0f2 */
	   public String scorePassStatics() {
//		   HttpServletRequest request = ServletActionContext.getRequest();

		   if(page==0)page=1;
			
	if(type=="asc")
		pageBean.setCurrentPage(pageBean.getCurrentPage()+1);
	if(type=="desc")
		pageBean.setCurrentPage(pageBean.getCurrentPage()-1);
		   pageBean = scoreService.inquirePassScore( department,lesson,page);
		   scores=pageBean.getList();
	      return "pass";
	   }
	   
	   /** @pdOid eac8e84c-4b27-4de7-b856-ee0936eb4c12 */
	   public String totalScoreStatics() {
	      // TODO: implement
		   if(page==0)
		   {
		   page=1;
		   session.put("department", department);
		   session.put("lesson", lesson);
		   }
		department=(String)session.get("department");
		lesson=(String)session.get("lesson");
		
		System.out.println(department+lesson+"page"+page);
	
	if(type=="asc")
		pageBean.setCurrentPage(pageBean.getCurrentPage()+1);
	if(type=="desc")
		pageBean.setCurrentPage(pageBean.getCurrentPage()-1);
		   pageBean = scoreService.inquireTotalScore( department,lesson,page);
		   scores=pageBean.getList();
		   
	      return "total";
	   }
	   
	   /** @pdOid 825b6e64-351a-4f4c-880e-501a0fbc6974 */
	   public void setScoreService() {
	      // TODO: implement
	   }
	   
	   /** @pdOid e5beb2e8-5eef-41ba-8171-28d1ac348150 */
	   public ScoreService getScoreService() {
	      // TODO: implement
	      return null;
	   }

	   

}
