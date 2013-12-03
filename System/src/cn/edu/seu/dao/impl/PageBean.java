package cn.edu.seu.dao.impl;
import java.util.*;

import org.hibernate.*;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PageBean {
	private List list;
	   
	private int allRow; 
	private int totalPage;
private int currentPage;
	private int pageSize;
	
private boolean isFirstPage;
private boolean isLastPage;
	private boolean hasPreviousPage;
	private boolean hasNextPage;

	
    public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public int getAllRow() {
		return allRow;
	}

	public void setAllRow(int allRow) {
		this.allRow = allRow;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setFirstPage(boolean isFirstPage) {
		this.isFirstPage = isFirstPage;
	}

	public void setLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}

	public void setHasPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	


	
public void init()
{
	
	this.isFirstPage = isFirstPage();
	 this.isLastPage = isLastPage();
	 this.hasPreviousPage = isHasPreviousPage();
	 this.hasNextPage = isHasNextPage();
	 
}

	public boolean isFirstPage() {
	 return currentPage==1;
	}
	 public boolean isLastPage()
	 {
	 return currentPage == totalPage;
	 }
	 public boolean isHasPreviousPage() {
	return currentPage != 1;
	 }
	 public boolean isHasNextPage() {
	 return currentPage != totalPage;
	 }


  public static int countTotalPage(final int pageSize,final int allRow)
  {
	 int totalPage = allRow % pageSize == 0 ? allRow/pageSize : allRow/pageSize+1;
	 return totalPage;
  }

	 public static int countOffset(final int pageSize,final int currentPage)
	 {
	 final int offset = pageSize*(currentPage-1);
	 return offset;
	 }

	 public static int countCurrentPage(int page){
	 final int curPage = (page==0?1:page);
	 return curPage;
	 }
	 }

