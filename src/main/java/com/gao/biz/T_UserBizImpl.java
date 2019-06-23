package com.gao.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gao.dao.T_UserDao;
import com.gao.po.T_User;
@Service
public class T_UserBizImpl implements T_UserBiz {
@Resource
	private T_UserDao dao;
	
	
	public boolean AddT_User(T_User user) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int rows = dao.InsertT_User(user);
		if(rows>0) {		
			flag=true;		
		}
		    return flag;
	}


	@Override
	public T_User getUser(Integer id) {
		// TODO Auto-generated method stub
		
		return dao.getT_User(id);
	}

}
