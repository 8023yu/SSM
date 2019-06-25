package com.gao.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gao.dao.bGzcdDao;
import com.gao.dao.bXyDao;
import com.gao.po.bGzcd;
@Service
public class bGzcdBizImpl implements bGzcdBiz {

	@Resource
	private bGzcdDao dao;
	
	@Resource
	private bXyDao xydao;
	
	

	@Override
	public boolean AddbGzcd(bGzcd gzcd) {
		// TODO Auto-generated method stub
		
		boolean flag=false;
		
		int  rows=dao.AddbGzcd(gzcd);
		
		if(rows>0) {
			
			flag=true;
			
		}
				
		return flag;
	}



	@Override
	public List<bGzcd> getGzcdInfo() {
		// TODO Auto-generated method stub
		return dao.getGzcdInfo();
	}



	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public List<bGzcd> DeleteGzcd(Integer id) {
		// TODO Auto-generated method stub

		int row1=xydao.DeleteXyByGzcdId(id);
		int row2=dao.DelectGzcd(id);

		return dao.getGzcdInfo();
	}



	@Override
	public bGzcd getGzcdById(Integer gzcdid) {
		// TODO Auto-generated method stub
		return dao.getGzcdById(gzcdid);
	}



	@Override
	public boolean UpdatebGzcd(bGzcd gzcd) {
		// TODO Auto-generated method stub
		
		
		boolean flag=false;
		
		int rows=dao.UpdatebGzcd(gzcd);
		
		if(rows>0) {
			
			flag=true;
						
		}
		
		return flag;
	}

}
