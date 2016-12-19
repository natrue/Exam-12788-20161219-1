   
	 /**     
     * @description 在此输入一句话描述此文件的作用
     * @author 王志南       
     * @created 2016-12-19 下午1:39:40    
     * tags     
     * see_to_target     
     */
    
package com.cn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.domain.FilmDomain;
import com.cn.service.FilmService;

  
    /**        
 * Title: FilmServlet.java    
 * Description: 描述
 * @author 王志南       
 * @created 2016-12-19 下午1:39:40    
 */

public class FilmServlet extends HttpServlet {
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
		List<FilmDomain> list=filmService.getList();
		request.setAttribute("list", list);
		String path=request.getContextPath();
		request.getRequestDispatcher("/showFirm.jsp").forward(request, response);
		
	}

}
