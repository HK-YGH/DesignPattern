package com.czs.reflect.proxy.intercepter;

import java.lang.reflect.Method;

public class MyIntercepter3 implements Intercepter {

	@Override
	public boolean before(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		
		System.err.println("3---���䷽��ǰ�߼�");
		return true;
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.err.println("3---around���������У�ȡ���˱��������ķ���");
	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		System.err.println("3---���䷽�����߼�");
	}

}
