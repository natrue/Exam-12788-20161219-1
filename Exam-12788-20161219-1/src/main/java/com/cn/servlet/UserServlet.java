/**
 * 
 */
package com.cn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.dao.DbUtils;
import com.cn.dao.UserDao;
import com.cn.domain.UserDomain;
import com.cn.service.UserService;

/**
 * @author nature
 *
 */
public class UserServlet extends HttpServlet {
	private static UserService userService=new UserService();

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String path=request.getContextPath();
		String name=request.getParameter("user");
		UserDomain user=new UserDomain();
		user.setName(name);
		boolean find=userService.yanZheng(user);
		if(find){
			response.getWriter().print("成功");
			request.getSession().setAttribute("name", name);
		}else{
			response.getWriter().print("失败");
		}
		
	
	}

}
