package com.gao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gao.po.bGzcd;

@Mapper
public interface bGzcdDao {
	
	
	public int AddbGzcd(bGzcd gzcd);
	
	public List<bGzcd> getGzcdInfo();
	
	public int DelectGzcd(Integer id);
	
	public bGzcd getGzcdById(Integer gzcdid);
	
	public int UpdatebGzcd(bGzcd gzcd);
	
	
	
	

}
