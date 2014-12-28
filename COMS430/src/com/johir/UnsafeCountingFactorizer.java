package com.johir;

import java.io.IOException;
import java.math.BigInteger;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public class UnsafeCountingFactorizer implements Servlet {

private long count;
public long getCount(){
	return count++;
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
	BigInteger[] factors=factor(i);
	count++;
	encodeIntoResponse(resp, factors);
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
