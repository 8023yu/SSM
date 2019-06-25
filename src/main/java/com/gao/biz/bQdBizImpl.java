package com.gao.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gao.dao.bQdDao;
import com.gao.dao.bXyDao;
import com.gao.po.bQd;
@Service
public class bQdBizImpl implements bQdBiz {
@Resource
private bQdDao dao;

@Resource
private bXyDao xydao;
	
	
	@Override
	public boolean AddbQd(bQd qd) {
		// TODO Auto-generated method stub
		boolean flag=false;
		
		int rows=dao.AddB_Qd(qd);
		
		if(rows>0) {
			
			flag=true;
			
		}
		
		return flag;
	}


	@Override
	public List<bQd> getQdInfo() {
		// TODO Auto-generated method stub
		return dao.getAllQds();
	}


	@Override
//	事物的注释
	@Transactional(propagation=Propagation.REQUIRED)  
	public List<bQd> DeleteQd(Integer id) {
		
		int row1=xydao.DeleteXyByGzcdId(id);
		
		int row2=dao.DeleteQd(id);
				
		// TODO Auto-generated method stub
		return dao.getAllQds();
	}


	@Override
	public bQd getQd(Integer qdid) {
		
		// TODO Auto-generated method stub
		
		return dao.getQd(qdid);
	}


	@Override
	public boolean UpdateQd(bQd qd) {
		// TODO Auto-generated method stub
		
		boolean flag=false;
		
		int rows=dao.UpdateQd(qd);
			
			if(rows>0) {
				
				flag=true;
				
			}
               
			return flag;
	
	}

}
