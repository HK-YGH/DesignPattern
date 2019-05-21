package com.czs.reflect.proxy.intercepter;

import java.lang.reflect.Method;

public interface Intercepter {

	public boolean before(Object proxy,Object target,Method method,Object[] args);
	
	public void around(Object proxy,Object target,Method method,Object[] args);
	
	public void after(Object proxy,Object target,Method method,Object[] args);
}
