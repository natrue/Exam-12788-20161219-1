package com.cn.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cn.domain.FilmDomain;

  
    /**        
 * Title: DeleteFilm.java    
 * Description: 执行数据库film表删除操作
 * @author 王志南       
 * @created 2016-12-19 下午2:37:21    
 */

public class DeleteFilm {
	public int deleteFilm(int id){
		DbUtils dbUtils=new DbUtils();
		Connection con=dbUtils.connection();
		int i=0;
		if(con!=null){
			try {
				Statement sta=con.createStatement();
				String sql="delete from language l,film f where l.language_id=f.language_id and film_id="+id;
				sta.executeUpdate(sql);
				i=1;
				System.out.println(id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
	}
}
