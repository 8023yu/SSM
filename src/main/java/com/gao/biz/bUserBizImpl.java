package com.gao.biz;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gao.dao.bUserDao;
import com.gao.po.bUser;
@Service
public class bUserBizImpl implements bUserBiz {
	@Resource
	private bUserDao dao;

	@Override
	public bUser CheckLogin(Map map) {
		// TODO Auto-generated method stub
		
		bUser  user  = null;
		
		List<bUser> list = dao.getUserByCondition(map);
		
		if(list.size()>0) {
			
		    user = list.get(0);
			
		}
		
		return user;
	}

	@Override
	public bUser getUserById(Integer id) {
		// TODO Auto-generated method stub
		return dao.getUserById(id);
	}

}
