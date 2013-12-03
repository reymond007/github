package cn.edu.seu.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class UserFilter
 */
@WebFilter("/UserFilter")
public class UserFilter implements Filter {

    /**
     * Default constructor. 
     */
    public UserFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        // ����������ַ�����      
        request.setCharacterEncoding("UTF-8");      
        // ���÷���������ַ�����      
        response.setCharacterEncoding("UTF-8");   
        
        HttpServletRequest req = (HttpServletRequest) request;      
        // ת��ServletResponseΪHttpServletRequest      
        HttpServletResponse res = (HttpServletResponse) response;      
        // ��ȡSession      
        HttpSession session = req.getSession();      
        // ��ȡSession�д洢�Ķ���      
        Object user= session.getAttribute("user");  
        String url=req.getRequestURI();
        if(user==null&&!url.endsWith("login4.jsp"))
        {
        	res.sendRedirect(req.getContextPath() + "/MyWebsite/login4.jsp");
        }
        else
        {
		    chain.doFilter(request, response);
            res.setHeader("Cache-Control","no-store");            
            res.setDateHeader("Expires",0);         
            res.setHeader("Pragma","no-cache");       
            res.flushBuffer();  
        }
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
