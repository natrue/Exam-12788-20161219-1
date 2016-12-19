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
import com.cn.service.SelectService;

/**
 * @author nature
 *
 */
public class SelectServlet extends HttpServlet {
	private static SelectService service=new SelectService();
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
		int id=Integer.parseInt(request.getParameter("id"));
		FilmDomain filmDomain=service.find(id);
		request.setAttribute("filmDomain", filmDomain);
		request.getRequestDispatcher("/updateFilm.jsp").forward(request, response);
		
		
	}

}
