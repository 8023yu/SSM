package com.gao.biz;

import java.util.List;

import com.gao.po.B_Qd;

public interface B_QdBiz {

	public boolean AddB_Qd(B_Qd qd);
	
	public List<B_Qd> getAllQd();
	
	public List<B_Qd> DeleteQd(Integer id);
	
	public B_Qd getQd(Integer qdid);
	
	public boolean UpdateQd(B_Qd qd);
	
	
}
