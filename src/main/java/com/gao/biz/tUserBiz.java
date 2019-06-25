package com.gao.biz;

import com.gao.po.tUser;

public interface tUserBiz {
	
	public boolean AddT_User(tUser user);

	public tUser getUser(Integer id);
}
