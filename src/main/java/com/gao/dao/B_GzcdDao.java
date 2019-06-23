package com.gao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gao.po.B_Gzcd;

@Mapper
public interface B_GzcdDao {
	
	
	public int AddB_Gzcd(B_Gzcd gzcd);
	
	public List<B_Gzcd> getAllGzcds();
	
	public int DelectGzcd(Integer id);
	
	public B_Gzcd getGzcd(Integer gzcdid);
	
	public int UpdateGzcd(B_Gzcd gzcd);
	
	
	
	

}
