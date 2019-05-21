package com.czs.reflect.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxyExample implements MethodInterceptor {

	/**
	 * 生成Cglib代理对象
	 * @param cls --Class类
	 * @return Class类的Cglib代理对象
	 */
	public Object getProxy(Class<?> cls){
		//cglib enhancer 增强类对象
		Enhancer enhancer = new Enhancer();
		//设置增强类型
		enhancer.setSuperclass(cls);
		//定义代理逻辑对象为当前对象，要求当前对象实现MethodInterceptor方法
		enhancer.setCallback(this);
		//生成并返回代理对象
		return enhancer.create();
	}
	
	/**
	 * proxy 代理对象
	 * method 方法
	 * args 方法参数
	 * methodProxy 方法代理
	 */
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("调用真实对象前");
		Object result = methodProxy.invokeSuper(proxy, args);
		System.err.println("调用真实对象后");
		return result;
	}

}
