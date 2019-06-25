package com.gao.dao;

import org.apache.ibatis.annotations.Mapper;

import com.gao.po.tUser;
@Mapper
public interface tUserDao {
	
	public int InsertUser(tUser user);

	public tUser GetUserInfo(Integer id);
}
