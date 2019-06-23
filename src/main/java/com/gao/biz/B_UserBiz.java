package com.gao.biz;

import java.util.Map;

import com.gao.po.B_User;

public interface B_UserBiz {
	
	
	public B_User  CheckLogin(Map map) ;
	
	public B_User  getUserById(Integer id);

}
