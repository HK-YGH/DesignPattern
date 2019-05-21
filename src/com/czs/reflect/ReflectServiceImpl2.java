package com.czs.reflect;

import java.lang.reflect.InvocationTargetException;

public class ReflectServiceImpl2 {

	private String name;

	public ReflectServiceImpl2(String name) {
		super();
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("Hello "+name);
	}
	
	//构造函数含有参数的类通过反射生成对象
	/*
	 * 1 通过forname找到类加载器
	 * 2 通过getConstructor方法，它的参数可以多个。匹配构造方法的参数类型
	 * 3 再用newInstance方法生成对象 
	 */
	public static ReflectServiceImpl2 getInstance(){
		ReflectServiceImpl2 object = null;
		try{
			object = (ReflectServiceImpl2) Class.forName("com.czs.reflect.ReflectServiceImpl2").getConstructor(String.class).newInstance("czs2");
		}catch(ClassNotFoundException | InstantiationException | IllegalAccessException
				| NoSuchMethodException | SecurityException | IllegalArgumentException |
				InvocationTargetException ex) {
			ex.printStackTrace();
		}
		return object;
	}
	
	public static void main(String[] args) {
		ReflectServiceImpl2 obj = ReflectServiceImpl2.getInstance();
		obj.sayHello();
	}
}
