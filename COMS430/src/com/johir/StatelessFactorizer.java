package com.johir;

import java.io.IOException;
import java.math.BigInteger;

import javax.servlet.*;

import net.jcip.annotations.ThreadSafe;

import java.util.concurrent.atomic.*;
@ThreadSafe
public class StatelessFactorizer implements Servlet {

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
		BigInteger[] factors=factor(i);
		encodeIntoResponse(resp, factors);
		
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
