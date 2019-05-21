package com.czs.reflect;

import java.lang.reflect.Method;

public class ReflectMethod2 {

	public static Object reflect(){
		ReflectServiceImpl2 object = null;
		try{
			object = (ReflectServiceImpl2) Class.forName("com.czs.reflect.ReflectServiceImpl2").getConstructor(String.class).newInstance("czs");
			Method method = object.getClass().getMethod("sayHello");
			method.invoke(object);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return object;
	}
	
	public static void main(String[] args) {
		reflect();
	}
}
