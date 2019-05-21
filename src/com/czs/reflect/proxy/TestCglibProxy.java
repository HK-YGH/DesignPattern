package com.czs.reflect.proxy;

import com.czs.reflect.ReflectServiceImpl;

public class TestCglibProxy {

	public static void main(String[] args) {
		CglibProxyExample cglib = new CglibProxyExample();
		ReflectServiceImpl proxy = (ReflectServiceImpl) cglib.getProxy(ReflectServiceImpl.class);
		proxy.sayHello("czs");
	}
}
