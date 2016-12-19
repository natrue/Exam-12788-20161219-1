   
	 /**     
     * @description 在此输入一句话描述此文件的作用
     * @author 王志南       
     * @created 2016-12-19 下午4:57:14    
     * tags     
     * see_to_target     
     */
    
package com.cn.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

  
    /**        
 * Title: UserFilter.java    
 * Description: 设置过滤器
 * @author 王志南       
 * @created 2016-12-19 下午4:57:14    
 */

public class UserFilter implements Filter {

	/** 
	 * @description 初始化过滤器
	 * @author 王志南       
	 * @created 2016-12-19 下午4:57:14      
	 * @param filterConfig
	 * @throws ServletException     
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)     
	 */

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	/** 
	 * @description 创建过滤器
	 * @author 王志南       
	 * @created 2016-12-19 下午4:57:14      
	 * @param request
	 * @param response
	 * @param chain
	 * @throws IOException
	 * @throws ServletException     
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)     
	 */

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request2=(HttpServletRequest)request;
		String name=(String)request2.getSession().getAttribute("name");
		System.out.println(name);
		if(name!=null){
			chain.doFilter(request, response);
		}else {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
		

	}

	/** 
	 * @description 销毁过滤器
	 * @author 王志南       
	 * @created 2016-12-19 下午4:57:14           
	 * @see javax.servlet.Filter#destroy()     
	 */

	@Override
	public void destroy() {

	}

}
