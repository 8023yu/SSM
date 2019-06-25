package com.gao.biz;

import java.util.List;

import com.gao.po.bGzcd;

public interface bGzcdBiz {
	
    public boolean AddbGzcd(bGzcd gzcd);
    
    public List<bGzcd> getGzcdInfo();
    
    public List<bGzcd> DeleteGzcd(Integer id);
    
    public bGzcd getGzcdById(Integer gzcdid);
    
    public boolean UpdatebGzcd(bGzcd gzcd);
    
	
}
