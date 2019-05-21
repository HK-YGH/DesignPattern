package com.czs.reflect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample2 implements InvocationHandler {

	//��ʵ����
	private Object target = null;
	
	//��������������ʵ����Ĵ����ϵ�����ҷ��ش������
	public static Object bind(Object target){
		JdkProxyExample2 _this = new JdkProxyExample2();
		_this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), _this);
	}
	
	//��������߼�
	/**
	 * proxy �������
	 * method ��ǰ���ȷ���
	 * args ��ǰ���ȷ����Ĳ���
	 * return ����������
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("��������߼�����");
		System.out.println("�ڵ�����ʵ����֮ǰ�ķ���");
		Object obj = method.invoke(target, args);
		System.out.println("�ڵ�����ʵ����֮��ķ���");
		return obj;
	}

}
