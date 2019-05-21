package com.czs.reflect.proxy.intercepter;

import java.lang.reflect.Method;

import com.czs.reflect.proxy.HelloWorldImpl;

public class MyIntercepter implements Intercepter {

	@Override
	public boolean before(Object proxy, Object target, Method method, Object[] args) {
		System.err.println("1---反射方法前逻辑");
		HelloWorldImpl obj = (HelloWorldImpl) target;
		if(obj.getSession() == null){
			System.err.println("1---session没有userId,拦截，执行around方法");
			return false;
		}else {
			System.err.println("1---session存在userId,不拦截，执行代理对象的方法");
			return true;
		}
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.err.println("1---around方法被執行，取代了被代理对象的方法");
	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.err.println("1---反射方法后逻辑");
	}

}
