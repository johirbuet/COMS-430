package com.johir;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import net.jcip.annotations.NotThreadSafe;
@NotThreadSafe

public class UnsafeCachingFactorizer implements Servlet {

	private final AtomicReference<BigInteger> lastnumber=new AtomicReference<BigInteger>();
	private final AtomicReference<BigInteger[]> lastfactors=new AtomicReference<BigInteger[]>();
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
		if(i.equals(lastnumber.get()))
		{
			encodeIntoResponse(res, lastfactors.get());
		}
		else{
			BigInteger[] factors=factor(i);
			lastnumber.set(i);
			lastfactors.set(factors);
			encodeIntoResponse(res, factors);
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
