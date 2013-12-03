package cn.edu.seu.service;

import java.util.List;

import cn.edu.seu.dao.impl.PageBean;

public interface ScoreService {
	 PageBean inquireScore(String classNamet,String lesson,int page);
	   /** @pdOid 8ecd30e9-7ff5-40f1-8ceb-8b72d3680b2c */
	   PageBean inquireAverageScore(String department,String lesson,int page);
	   /** @pdOid 6433c7a9-1c5a-411f-b89c-ea762e26377b */
	   PageBean inquirePassScore(String department,String lesson,int page);
	   /** @pdOid aaa3c147-074b-424d-93ff-ae97669966bd */
	   PageBean inquireTotalScore(String department,String lesson,int page);
	   /** @pdOid 6fd02d21-ac68-4053-98f7-9023c65271d0 */
	   PageBean inquireSortScore(String department,String lesson,int page);
 

}
