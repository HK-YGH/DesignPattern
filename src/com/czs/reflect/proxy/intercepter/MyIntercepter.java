package com.czs.reflect.proxy.intercepter;

import java.lang.reflect.Method;

import com.czs.reflect.proxy.HelloWorldImpl;

public class MyIntercepter implements Intercepter {

	@Override
	public boolean before(Object proxy, Object target, Method method, Object[] args) {
		System.err.println("1---���䷽��ǰ�߼�");
		HelloWorldImpl obj = (HelloWorldImpl) target;
		if(obj.getSession() == null){
			System.err.println("1---sessionû��userId,���أ�ִ��around����");
			return false;
		}else {
			System.err.println("1---session����userId,�����أ�ִ�д������ķ���");
			return true;
		}
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.err.println("1---around���������У�ȡ���˱��������ķ���");
	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.err.println("1---���䷽�����߼�");
	}

}
