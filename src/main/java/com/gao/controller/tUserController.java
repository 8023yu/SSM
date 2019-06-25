package com.gao.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gao.biz.tUserBiz;
import com.gao.po.tUser;

@Controller
public class tUserController {
	@Resource
	private tUserBiz biz;
	@RequestMapping("/AddUser")
	public@ResponseBody boolean AddUser(tUser user) {
		boolean flag=biz.AddT_User(user);
	    return flag;
	}
	@RequestMapping("getUser")
	public @ResponseBody tUser getUser(@RequestParam(value="id")int id) {
		
		return biz.getUser(id);
		
	}

}
