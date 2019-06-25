package com.gao.biz;

import java.util.Map;

import com.gao.po.bUser;

public interface bUserBiz {
	
	
	public bUser  CheckLogin(Map map) ;
	
	public bUser  getUserById(Integer id);

	
}
