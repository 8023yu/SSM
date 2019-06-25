package com.gao.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gao.dao.tUserDao;
import com.gao.po.tUser;
@Service
public class tUserBizImpl implements tUserBiz {
@Resource
	private tUserDao dao;
	
	
	public boolean AddT_User(tUser user) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int rows = dao.InsertUser(user);
		if(rows>0) {		
			flag=true;		
		}
		    return flag;
	}


	@Override
	public tUser getUser(Integer id) {
		// TODO Auto-generated method stub
		
		return dao.GetUserInfo(id);
	}

}
