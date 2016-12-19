package com.cn.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cn.domain.FilmDomain;

  
    /**        
 * Title: FindById.java    
 * Description: 数据库查找操作
 * @author 王志南       
 * @created 2016-12-19 下午4:10:22    
 */

public class FindById {
	public FilmDomain findById(int id){
		FilmDomain filmDomain=new FilmDomain();
		DbUtils dbUtils=new DbUtils();
		Connection con=dbUtils.connection();
		if(con!=null){
			try {
				Statement sta=con.createStatement();
				String sql="select  film_id,title,description,name from film f, language l where l.language_id=f.language_id and film_id="+id;
				ResultSet set=sta.executeQuery(sql);
				while (set.next()) {
					filmDomain.setId(set.getInt("film_id"));
					filmDomain.setTitle(set.getString("title"));
					filmDomain.setDescription(set.getString("description"));
					filmDomain.setLanguage(set.getString("name"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return filmDomain;
	}
 }
