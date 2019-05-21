package com.czs.reflect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample2 implements InvocationHandler {

	//真实对象
	private Object target = null;
	
	//建立代理对象和真实对象的代理关系，并且返回代理对象
	public static Object bind(Object target){
		JdkProxyExample2 _this = new JdkProxyExample2();
		_this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), _this);
	}
	
	//代理对象逻辑
	/**
	 * proxy 代理对象
	 * method 当前调度方法
	 * args 当前调度方法的参数
	 * return 代理结果返回
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("进入代理逻辑方法");
		System.out.println("在调度真实对象之前的服务");
		Object obj = method.invoke(target, args);
		System.out.println("在调度真实对象之后的服务");
		return obj;
	}

}
