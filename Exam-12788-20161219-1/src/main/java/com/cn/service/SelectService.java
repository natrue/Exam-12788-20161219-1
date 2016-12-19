package com.cn.service;

import com.cn.dao.FindById;
    import com.cn.domain.FilmDomain;
/**        
     * Title: SelectService.java    
     * Description: 根据id获取firm信息
     * @author 王志南       
     * @created 2016-12-19 下午4:09:13    
     */      
    
public class SelectService {
	private static FindById find=new FindById();
	public FilmDomain find(int id){
		FilmDomain filmDomain=find.findById(id);
		if(filmDomain!=null){
			return filmDomain;
		}
		return null;
	}
}
