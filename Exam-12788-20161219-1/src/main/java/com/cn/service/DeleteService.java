package com.cn.service;

import com.cn.dao.DeleteFilm;

  
    /**        
 * Title: DeleteService.java    
 * Description: 根据id删除film信息
 * @author 王志南       
 * @created 2016-12-19 下午2:32:37    
 */

public class DeleteService {
	private static DeleteFilm deleteFilm=new DeleteFilm();
	public boolean deleteFilm(int id){
		boolean find=false;
		int i=deleteFilm.deleteFilm(id);
		if(i==1){
			 find = true;
		}
		return find;
	}
}
