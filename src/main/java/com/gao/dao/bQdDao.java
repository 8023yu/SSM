package com.gao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gao.po.bQd;

@Mapper
public interface bQdDao {
	 
	public int AddB_Qd(bQd qd);
	
	public List<bQd> getAllQds();
	
	public int DeleteQd(Integer id);
	
	public bQd getQd (Integer qdid);
	
	public int UpdateQd(bQd qd);

}
