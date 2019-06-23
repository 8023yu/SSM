package com.gao.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gao.dao.B_QdDao;
import com.gao.dao.B_XyDao;
import com.gao.po.B_Qd;
@Service
public class B_QdBizImpl implements B_QdBiz {
@Resource
private B_QdDao dao;

@Resource
private B_XyDao xydao;
	
	
	@Override
	public boolean AddB_Qd(B_Qd qd) {
		// TODO Auto-generated method stub
		boolean flag=false;
		
		int rows=dao.AddB_Qd(qd);
		
		if(rows>0) {
			
			flag=true;
			
		}
		
		return flag;
	}


	@Override
	public List<B_Qd> getAllQd() {
		// TODO Auto-generated method stub
		return dao.getAllQds();
	}


	@Override
//	事物的注释
	@Transactional(propagation=Propagation.REQUIRED)  
	public List<B_Qd> DeleteQd(Integer id) {
		
		int row1=xydao.DeleteXyByGzcdId(id);
		
		int row2=dao.DeleteQd(id);
		
		
		// TODO Auto-generated method stub
		return dao.getAllQds();
	}


	@Override
	public B_Qd getQd(Integer qdid) {
		// TODO Auto-generated method stub
		return dao.getQd(qdid);
	}


	@Override
	public boolean UpdateQd(B_Qd qd) {
		// TODO Auto-generated method stub
		
		boolean flag=false;
		
		int rows=dao.UpdateQd(qd);
			
			if(rows>0) {
				
				flag=true;
				
			}
               return flag;
	}

}
