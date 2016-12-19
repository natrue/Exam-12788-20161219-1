/**
 * 
 */
package com.cn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.domain.FilmDomain;
import com.cn.service.FilmService;

/**
 * @author nature
 *
 */
public class UpdateServlet extends HttpServlet {
	private static FilmService filmService=new FilmService();
	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		int id=Integer.parseInt(request.getParameter("id"));
		String title=request.getParameter("title");
		String des=request.getParameter("textarea");
		String language=request.getParameter("la");
		FilmDomain filmDomain=new FilmDomain();
		filmDomain.setId(id);
		filmDomain.setTitle(title);
		filmDomain.setDescription(des);
		filmDomain.setLanguage(language);
		boolean find=filmService.updateFilm(filmDomain);
		if(find){
			response.getWriter().print("更新成功！");
		}else{
			response.getWriter().print("更新失败！");
		}
		
	}

}
