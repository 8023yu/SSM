package com.gao.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface B_XyDao {
	
	public int DeleteXyByQdId(Integer qdid);
	
	public int DeleteXyByGzcdId(Integer gzcdid);


}
