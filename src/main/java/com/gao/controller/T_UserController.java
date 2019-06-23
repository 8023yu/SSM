package com.gao.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gao.biz.T_UserBiz;
import com.gao.po.T_User;

@Controller
public class T_UserController {
	@Resource
	private T_UserBiz biz;
	@RequestMapping("/AddUser")
	public@ResponseBody boolean AddUser(T_User user) {
		boolean flag=biz.AddT_User(user);
	    return flag;
	}
	@RequestMapping("getUser")
	public @ResponseBody T_User getUser(@RequestParam(value="id")int id) {
		
		return biz.getUser(id);
		
	}

}
