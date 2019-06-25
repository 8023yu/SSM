package com.gao.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gao.biz.bQdBiz;
import com.gao.po.bQd;

@Controller
public class qdController {
	@Resource
	private bQdBiz biz;
	
	@RequestMapping("/DeleteQd")
	public @ResponseBody List<bQd> removeQd(@RequestParam(value="qdid") int qdid){
	
	return biz.DeleteQd(qdid);
}
	
	
	@RequestMapping("/getAllQd")
	public @ResponseBody List<bQd> getAllQds(){
		
		return biz.getQdInfo();
				
	}
	
	@RequestMapping("/AddQd")
	public @ResponseBody boolean AddQd(bQd qd) {
		
		return biz.AddbQd(qd);
	}
	
    @RequestMapping("/getQd")
    public @ResponseBody bQd getQd(@RequestParam(value="qdid") int qdid ) {
    	
    	return biz.getQd(qdid);
    	
    }
    
    @RequestMapping("/UpdateQd")
    public @ResponseBody boolean UpdateQd(bQd qd) {
    	
    	
    	return biz.UpdateQd(qd);
    	
    }
    
    
    
	
	
	

}
