package com.czs.reflect;

import java.lang.reflect.Method;

public class ReflectMethod1 {

	public static Object reflectMethod(){
		Object returnObj = null;
		ReflectServiceImpl rsi = ReflectServiceImpl.getInstance();
		try{
			Method method = rsi.getClass().getMethod("say", String.class);
			returnObj = method.invoke(rsi, "ÆßÏ¦");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return returnObj;
	}
	
	public static void main(String[] args) {
		Object o = reflectMethod();
		System.out.println(o);
	}
}
