package com.gao.biz;

import com.gao.po.T_User;

public interface T_UserBiz {
	
	public boolean AddT_User(T_User user);

	public T_User getUser(Integer id);
}
