package com.gao.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gao.biz.B_UserBiz;
import com.gao.po.B_User;

@Controller
public class BUserController {
       @Resource
    private B_UserBiz  biz;
       
       @RequestMapping("/Main")
       
//  @RequestParam(value="userid") int userid 将id传入以便拿到值做结果的查询
       
public @ResponseBody B_User getUser(@RequestParam(value="userid") int userid) {
    	   
    	 return  biz.getUserById(userid);
    	   
}
	
       @RequestMapping("/Login")
       public  @ResponseBody B_User LoginUser(@RequestParam(value="yhm") String yhm,@RequestParam(value="mm") String mm) {
    	   
    	       Map map = new HashMap();
    	       
    	       map.put("yhm", yhm);
    	       
    	       map.put("mm", mm);
    	       
    	       B_User  user = biz.CheckLogin(map);
    	       
    	       
    	       return user;
    	   
    	   
    	   
    	   
       }
	
	
	
}
