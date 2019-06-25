package com.gao.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gao.biz.bGzcdBiz;
import com.gao.po.bGzcd;

@Controller
public class gzcdController {
	@Resource
      private bGzcdBiz biz;
	
	@RequestMapping("/UpdateGzcd")
	public @ResponseBody boolean UpdateGzcd(bGzcd gzcd) {
		
		return biz.UpdatebGzcd(gzcd);
		
		
	}

	@RequestMapping("/getGzcd")
	public @ResponseBody bGzcd getGzcdById(@RequestParam(value="gzcdid")int gzcdid) {
		
		return biz.getGzcdById(gzcdid);
		
		
	}
	
	
	@RequestMapping("/DeleteGzcd")
	public @ResponseBody List<bGzcd> removeGzcd(@RequestParam(value="gzcdid")int gzcdid){
		
		return biz.DeleteGzcd(gzcdid); 
		
		
	}	
	
	
	@RequestMapping("/getAllGzcd")
	public @ResponseBody List<bGzcd> getGzcdInfo(){		
		return biz.getGzcdInfo();
	}
	
	
	
	@RequestMapping("/AddGzcd")
	public @ResponseBody boolean AddGzcd(bGzcd gzcd) {
	
	return biz.AddbGzcd(gzcd);
	
	}
	


}
