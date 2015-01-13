package com.johir;

import java.io.IOException;
import java.math.BigInteger;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;
@ThreadSafe
public class CachedFactorizer implements Servlet {

	@GuardedBy("this") private BigInteger lastNumber;
	@GuardedBy("this") private BigInteger[] lastFactors;
	@GuardedBy("this") private long hits;
	@GuardedBy("this") private long cachedHits;
	public synchronized long getHits(){return hits;}
	public synchronized double getCacheHitRatio(){
		return (double) cachedHits/(double) hits;
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		BigInteger i=extractFromRequest(req);
		BigInteger[] factors=null;
		synchronized (this){
			++hits;
			if(i.equals(lastNumber)){
				++cachedHits;
				factors=lastFactors.clone();
			}
		}
		if(factors==null){
			factors=factor(i);
			synchronized (this) {
				lastNumber=i;
				lastFactors=factors.clone();
			}
		}
		
		
	}
    BigInteger extractFromRequest(ServletRequest req) {
        return new BigInteger("7");
    }
    BigInteger[] factor(BigInteger i) {
        // Doesn't really factor
        return new BigInteger[]{i};
    }
    
    void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {
    }

}
