package com.gao.biz;

import java.util.List;

import com.gao.po.bQd;

public interface bQdBiz {

	public boolean AddbQd(bQd qd);
	
	public List<bQd> getQdInfo();
	
	public List<bQd> DeleteQd(Integer id);
	
	public bQd getQd(Integer qdid);
	
	public boolean UpdateQd(bQd qd);
	
	
}
