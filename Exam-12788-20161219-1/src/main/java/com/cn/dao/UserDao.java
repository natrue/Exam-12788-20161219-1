   
	 /**     
     * @description 操作数据库
     * @author 王志南       
     * @created 2016-12-19 上午11:24:30    
     * tags     
     * see_to_target     
     */
    
package com.cn.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.cn.domain.UserDomain;

  
    /**        
 * Title: UserDao.java    
 * Description: 数据库操作
 * @author 王志南       
 * @created 2016-12-19 上午11:24:30    
 */

public class UserDao {
	public UserDomain findByNama(String name){
		DbUtils dbUtils=new DbUtils();
		UserDomain user=new UserDomain();
		Connection con=dbUtils.connection();
		if(con!=null){
			try {
				Statement sta=con.createStatement();
				String sql="select * from customer where first_name='"+name+"'";
				ResultSet set=sta.executeQuery(sql);
				while(set.next()){
					user.setName(set.getString("first_name"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 return user;
	}
}
