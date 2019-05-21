package com.czs.reflect.proxy.intercepter;

import java.lang.reflect.Method;

public class MyIntercepter2 implements Intercepter {

	@Override
	public boolean before(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		 	System.err.println("2---反射方法前逻辑");
			return true;
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.err.println("2---around方法被執行，取代了被代理对象的方法");
	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.err.println("2---反射方法后逻辑");
	}

}
