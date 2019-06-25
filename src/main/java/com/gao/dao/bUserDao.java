package com.gao.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gao.po.bUser;
@Mapper
public interface bUserDao {
	
	public List<bUser> getUserByCondition(Map map);
	
	public bUser getUserById(Integer  id);

}
