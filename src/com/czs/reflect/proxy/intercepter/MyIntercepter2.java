package com.czs.reflect.proxy.intercepter;

import java.lang.reflect.Method;

public class MyIntercepter2 implements Intercepter {

	@Override
	public boolean before(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		 	System.err.println("2---���䷽��ǰ�߼�");
			return true;
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.err.println("2---around���������У�ȡ���˱��������ķ���");
	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.err.println("2---���䷽�����߼�");
	}

}
