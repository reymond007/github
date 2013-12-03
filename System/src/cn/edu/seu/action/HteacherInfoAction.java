package cn.edu.seu.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.edu.seu.pojo.Hteacher;
import cn.edu.seu.service.HteacherInfoService;

import com.opensymphony.xwork2.ActionSupport;

public class HteacherInfoAction extends ActionSupport {

	private Hteacher hteacher;

	private HteacherInfoService hteacherInfoService;
	
	public Hteacher getHteacher() {
		return hteacher;
	}

	public void setHteacher(Hteacher hteacher) {
		this.hteacher = hteacher;
	}

	public HteacherInfoService getHteacherInfoService() {
		return hteacherInfoService;
	}

	public void setHteacherInfoService(HteacherInfoService hteacherInfoService) {
		this.hteacherInfoService = hteacherInfoService;
	}

	public String addOne() {
		try{
			hteacherInfoService.addOne(hteacher);
			return "success";
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}

	public String deleteOne() {	
		try{
			hteacherInfoService.deleteOne(hteacher);
			return "success";
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}

	public String updateOne() {
		if (hteacher != null) {
			hteacherInfoService.updateOne(hteacher);
			return "success";
		}
		return "hteresult";
	}

	public String queryOne() {
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			List<Hteacher> htelist = hteacherInfoService.findByNumber(hteacher);
			request.setAttribute("htelist", htelist);
			if (htelist != null) {
				return "hteresult";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}

}
