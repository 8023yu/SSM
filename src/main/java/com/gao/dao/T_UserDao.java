package com.gao.dao;

import org.apache.ibatis.annotations.Mapper;

import com.gao.po.T_User;
@Mapper
public interface T_UserDao {
	
	public int InsertT_User(T_User user);

	public T_User  getT_User(Integer id);
}
