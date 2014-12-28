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
public class SynchronizedFactorizer implements Servlet{

	 @GuardedBy("this") private BigInteger lastNumber;
	 @GuardedBy("this") private BigInteger[] lastFactors;
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
		   BigInteger i = extractFromRequest(req);
	        if (i.equals(lastNumber))
	            encodeIntoResponse(resp, lastFactors);
	        else {
	            BigInteger[] factors = factor(i);
	            lastNumber = i;
	            lastFactors = factors;
	            encodeIntoResponse(resp, factors);
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
