package com.gao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gao.po.B_Qd;

@Mapper
public interface B_QdDao {
	 
	public int AddB_Qd(B_Qd qd);
	
	public List<B_Qd> getAllQds();
	
	public int DeleteQd(Integer id);
	
	public B_Qd getQd (Integer qdid);
	
	public int UpdateQd(B_Qd qd);

}
