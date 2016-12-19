   
	 /**     
     * @description 在此输入一句话描述此文件的作用
     * @author 王志南       
     * @created 2016-12-19 下午2:29:26    
     * tags     
     * see_to_target     
     */
    
package com.cn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.service.DeleteService;

  
    /**        
 * Title: DeleteServlet.java    
 * Description: 描述
 * @author 王志南       
 * @created 2016-12-19 下午2:29:26    
 */

public class DeleteServlet extends HttpServlet {
	private static DeleteService deleteService=new DeleteService();
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
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		int id=Integer.parseInt(request.getParameter("id"));
		boolean find= deleteService.deleteFilm(id);
		if(find){
			response.getWriter().print("删除成功！");
		}else {
			response.getWriter().print("‘有约束，删除失败");
		}
	}

}
