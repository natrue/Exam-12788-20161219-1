package com.cn.service;

import java.util.ArrayList;
import java.util.List;

import com.cn.dao.FilmDao;
import com.cn.domain.FilmDomain;
import com.cn.domain.Language;

  
    /**        
 * Title: FilmService.java    
 * Description: 显示、更新功能的业务
 * @author 王志南       
 * @created 2016-12-19 下午1:34:50    
 */

public class FilmService {
	private static FilmDao filmDao=new FilmDao();
	//查询数据
	public List<FilmDomain> getList(){
		List<FilmDomain> list=new ArrayList<FilmDomain>();
		List<FilmDomain> list1=filmDao.getFilm();
		if(list1!=null){
			list=list1;
		}
		return list;
	}
	//更新数据
	public boolean updateFilm(FilmDomain filmDomain){
		boolean find=filmDao.update_film(filmDomain);
		
		return  find;
	}
	//判断list是否为空
	public List<Language> getName(){
		List<Language> list=filmDao.getLanguage();
		if(list!=null){
			return list;
		}
		return null;
	}
}
