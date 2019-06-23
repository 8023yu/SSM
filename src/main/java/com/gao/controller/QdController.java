package com.gao.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gao.biz.B_QdBiz;
import com.gao.po.B_Qd;

@Controller
public class QdController {
	@Resource
	private B_QdBiz biz;
	
	@RequestMapping("/DeleteQd")
	public @ResponseBody List<B_Qd> removeQd(@RequestParam(value="qdid") int qdid){
	
	return biz.DeleteQd(qdid);
}
	
	
	@RequestMapping("/getAllQd")
	public @ResponseBody List<B_Qd> getAllQds(){
		
		return biz.getAllQd();
				
	}
	
	@RequestMapping("/AddQd")
	public @ResponseBody boolean AddQd(B_Qd qd) {
		
		return biz.AddB_Qd(qd);
	}
	
    @RequestMapping("/getQd")
    public @ResponseBody B_Qd getQd(@RequestParam(value="qdid") int qdid ) {
    	
    	return biz.getQd(qdid);
    	
    }
    
    @RequestMapping("/UpdateQd")
    public @ResponseBody boolean UpdateQd(B_Qd qd) {
    	
    	
    	return biz.UpdateQd(qd);
    	
    }
    
    
    
	
	
	

}
