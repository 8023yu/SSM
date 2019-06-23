package com.gao.biz;

import java.util.List;

import com.gao.po.B_Gzcd;

public interface B_GzcdBiz {
	
    public boolean AddB_Gzcd(B_Gzcd gzcd);
    
    public List<B_Gzcd> getAllGzcd();
    
    public List<B_Gzcd> DeleteGzcd(Integer id);
    
    public B_Gzcd getGzcd(Integer gzcdid);
    
    public boolean UpdateB_Gzcd(B_Gzcd gzcd);
    
	
}
