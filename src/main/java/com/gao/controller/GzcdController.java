package com.gao.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gao.biz.B_GzcdBiz;
import com.gao.po.B_Gzcd;

@Controller
public class GzcdController {
	@Resource
      private B_GzcdBiz biz;
	
	@RequestMapping("/UpdateGzcd")
	public @ResponseBody boolean UpdateGzcd(B_Gzcd gzcd) {
		
		return biz.UpdateB_Gzcd(gzcd);
		
		
	}
	
	
	
	@RequestMapping("/getGzcd")
	public @ResponseBody B_Gzcd getGzcd(@RequestParam(value="gzcdid")int gzcdid) {
		
		return biz.getGzcd(gzcdid);
		
		
	}
	
	
	
	@RequestMapping("/DeleteGzcd")
	public @ResponseBody List<B_Gzcd> removeGzcd(@RequestParam(value="gzcdid")int gzcdid){
		
		return biz.DeleteGzcd(gzcdid); 
		
		
	}
	
	
	
	
	@RequestMapping("/getAllGzcd")
	public @ResponseBody List<B_Gzcd> getAllGzcd(){		
		return biz.getAllGzcd();
	}
	
	
	
	
	@RequestMapping("/AddGzcd")
	public @ResponseBody boolean AddGzcd(B_Gzcd gzcd) {
	
	return biz.AddB_Gzcd(gzcd);
	
	}
	
	
	
	
	

}
