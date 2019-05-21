package com.czs.reflect.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxyExample implements MethodInterceptor {

	/**
	 * ����Cglib�������
	 * @param cls --Class��
	 * @return Class���Cglib�������
	 */
	public Object getProxy(Class<?> cls){
		//cglib enhancer ��ǿ�����
		Enhancer enhancer = new Enhancer();
		//������ǿ����
		enhancer.setSuperclass(cls);
		//��������߼�����Ϊ��ǰ����Ҫ��ǰ����ʵ��MethodInterceptor����
		enhancer.setCallback(this);
		//���ɲ����ش������
		return enhancer.create();
	}
	
	/**
	 * proxy �������
	 * method ����
	 * args ��������
	 * methodProxy ��������
	 */
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("������ʵ����ǰ");
		Object result = methodProxy.invokeSuper(proxy, args);
		System.err.println("������ʵ�����");
		return result;
	}

}
