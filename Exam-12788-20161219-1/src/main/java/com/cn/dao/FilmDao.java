package com.cn.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cn.domain.FilmDomain;
import com.cn.domain.Language;
import com.sun.org.apache.bcel.internal.generic.RETURN;

  
    /**        
 * Title: FilmDao.java    
 * Description: 数据库中film表的操作
 * @author 王志南       
 * @created 2016-12-19 下午1:19:06    
 */

public class FilmDao {
	/**
	 * @author 王志南
	 * @return list
	 * 查询数据
	 */
	public List<FilmDomain> getFilm(){
		DbUtils dbUtils=new DbUtils();
		List<FilmDomain> list =new ArrayList<FilmDomain>();
		Connection con=dbUtils.connection();
		FilmDomain film=null;
		if(con!=null){
			try {
				Statement sta=con.createStatement();
				String sql="select  film_id,title,description,name from film f, language l where l.language_id=f.language_id";
				ResultSet set=sta.executeQuery(sql);
				while(set.next()){
					film=new FilmDomain();
					film.setId(set.getInt("film_id"));
					film.setTitle(set.getString("title"));
					film.setDescription(set.getString("description"));
					film.setLanguage(set.getString("name"));
					list.add(film);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	public boolean update_film(FilmDomain filmDomain){
		DbUtils dbUtils=new DbUtils();
		Connection con=dbUtils.connection();
		boolean find=false;
		if(con!=null){
			try {
				Statement sta=con.createStatement();
				String sql="update film set title='"+filmDomain.getTitle()+"',description='"+filmDomain.getDescription()+"'where film_id="+filmDomain.getId();
				sta.executeUpdate(sql);
				find=true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return find;
	}
	//查询language表
	public List<Language> getLanguage(){
		DbUtils dbUtils=new DbUtils();
		Connection con=dbUtils.connection();
		List<Language> list=new ArrayList<Language>();
		Language language;
		if(con!=null){
			try {
				Statement statement=con.createStatement();
				String sql="select language_id,name from language";
				ResultSet set=statement.executeQuery(sql);
				while(set.next()){
					language=new Language();
					language.setLanguage_id(set.getInt("language_id"));
					language.setName(set.getString("name"));
					list.add(language);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
