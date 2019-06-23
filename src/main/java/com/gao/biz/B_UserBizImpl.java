package com.gao.biz;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gao.dao.B_UserDao;
import com.gao.po.B_User;
@Service
public class B_UserBizImpl implements B_UserBiz {
	@Resource
	private B_UserDao dao;

	@Override
	public B_User CheckLogin(Map map) {
		// TODO Auto-generated method stub
		
		B_User  user  = null;
		
		List<B_User> list = dao.getUserByCondition(map);
		
		if(list.size()>0) {
			
		    user = list.get(0);
			
		}
		
		return user;
	}

	@Override
	public B_User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return dao.getUserById(id);
	}

}
