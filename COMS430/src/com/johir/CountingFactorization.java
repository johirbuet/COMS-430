package com.johir;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class CountingFactorization implements Servlet {
	private final AtomicLong count= new AtomicLong(0);
	public long getCount(){
		return count.get();
	};
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
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		BigInteger i=extractFromRequest(req);
		BigInteger[] factors=factor(i);
		
	}
	private BigInteger[] factor(BigInteger i) {
		// TODO Auto-generated method stub
		return new BigInteger[]{i};
	}
	private BigInteger extractFromRequest(ServletRequest req) {
		// TODO Auto-generated method stub
		return new BigInteger("7");
	}
	   void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {
	    }

}
