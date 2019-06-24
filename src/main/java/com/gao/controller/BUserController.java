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
    private B_UserBiz biz;

    // TODO: 2019/6/24 去看看 restful 风格的api写法。 
    @RequestMapping("/Main")
    @ResponseBody
    public B_User getUser(@RequestParam(value = "userid") int userid) {
        return biz.getUserById(userid);

    }

    // TODO: 2019/6/24  所有变量名、方法名 要遵循 "驼峰命名" 规则，去查查！！ 
    @ResponseBody
    @RequestMapping("/Login")
    public B_User LoginUser(@RequestParam(value = "yhm") String yhm, @RequestParam(value = "mm") String mm) {

        // TODO: 2019/6/24 Map<?,?> map = new HashMap(16) 去看看 Map 底层实现。
        Map map = new HashMap();

        map.put("yhm", yhm);

        map.put("mm", mm);

        B_User user = biz.CheckLogin(map);


        return user;


    }


}
