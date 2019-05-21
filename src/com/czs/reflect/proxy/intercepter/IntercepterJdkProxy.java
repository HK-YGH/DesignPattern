package com.czs.reflect.proxy.intercepter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class IntercepterJdkProxy implements InvocationHandler {

	private Object target;
	private String intercepterClass;

	public IntercepterJdkProxy(Object target, String intercepterClass) {
		this.target = target;
		this.intercepterClass = intercepterClass;
	}

	public Object bind() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	public static Object bind(Object target,String intercepterClass) {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new IntercepterJdkProxy(target,intercepterClass));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (intercepterClass == null) {
			return method.invoke(target, args);
		}

		Object result = null;
		// 反射生成拦截器
		Intercepter intercepter = (Intercepter) Class.forName(intercepterClass).newInstance();

		if (intercepter.before(proxy, target, method, args)) {
			result = method.invoke(target, args);
		} else {
			intercepter.around(proxy, target, method, args);
		}

		// 调用后置方法
		intercepter.after(proxy, target, method, args);
		return result;
	}

}
