package com.gao.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gao.dao.B_GzcdDao;
import com.gao.dao.B_XyDao;
import com.gao.po.B_Gzcd;
@Service
public class B_GzcdBizIpml implements B_GzcdBiz {
	@Resource
	private B_GzcdDao dao;
	
	@Resource
	private B_XyDao xydao;
	
	

	@Override
	public boolean AddB_Gzcd(B_Gzcd gzcd) {
		// TODO Auto-generated method stub
		
		boolean flag=false;
		
		int  rows=dao.AddB_Gzcd(gzcd);
		
		if(rows>0) {
			
			flag=true;
			
		}
				
		return flag;
	}



	@Override
	public List<B_Gzcd> getAllGzcd() {
		// TODO Auto-generated method stub
		return dao.getAllGzcds();
	}



	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public List<B_Gzcd> DeleteGzcd(Integer id) {
		// TODO Auto-generated method stub
		
		
		int row1=xydao.DeleteXyByGzcdId(id);
		int row2=dao.DelectGzcd(id);
		
        return dao.getAllGzcds();
	}



	@Override
	public B_Gzcd getGzcd(Integer gzcdid) {
		// TODO Auto-generated method stub
		return dao.getGzcd(gzcdid);
	}



	@Override
	public boolean UpdateB_Gzcd(B_Gzcd gzcd) {
		// TODO Auto-generated method stub
		
		
		boolean flag=false;
		
		int rows=dao.UpdateGzcd(gzcd);
		
		if(rows>0) {
			
			flag=true;
			
			
		}
		
		
		return flag;
	}

}
