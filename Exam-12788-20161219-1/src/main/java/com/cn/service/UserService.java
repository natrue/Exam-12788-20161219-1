package com.cn.service;

import com.cn.dao.UserDao;
import com.cn.domain.UserDomain;
    /**        
     * Title: UserService.java    
     * Description: 处理登陆的业务
     * @author 王志南       
     * @created 2016-12-19 下午12:47:26    
     */      
    
public class UserService {
	private static UserDao userDao=new UserDao();
	public boolean yanZheng(UserDomain userDomain){
		boolean find=false;
		UserDomain user2=userDao.findByNama(userDomain.getName());
		if(userDomain.getName().equalsIgnoreCase(user2.getName())){
			find =true;
		}
		return find;
	}
}
