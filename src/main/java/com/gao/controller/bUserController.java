package com.gao.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gao.biz.bUserBiz;
import com.gao.po.bUser;

@Controller
public class bUserController {
       @Resource
    private bUserBiz  biz;
       
       @RequestMapping("/Main")
       
//  @RequestParam(value="userid") int userid 将id传入以便拿到值做结果的查询
       
public @ResponseBody bUser getUser(@RequestParam(value="userid") int userid) {
    	   
    	 return  biz.getUserById(userid);
    	   
}
	
       @RequestMapping("/Login")//登录验证
       public  @ResponseBody bUser LoginUser(@RequestParam(value="yhm") String yhm,@RequestParam(value="mm") String mm) {
    	   
    	       Map<String,Object> map = new HashMap<String,Object>();
    	       
    	       map.put("yhm", yhm);
    	       
    	       map.put("mm", mm);
    	       
    	       bUser  user = biz.CheckLogin(map);

    	       return user;
    	   
    	   
    	   
    	   
       }
	
	
	
}
