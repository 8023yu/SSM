package com.gao.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gao.po.B_User;
@Mapper
public interface B_UserDao {
	
	public List<B_User> getUserByCondition(Map map);
	
	public B_User getUserById(Integer  id);

}
