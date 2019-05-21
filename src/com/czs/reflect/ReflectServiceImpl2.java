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
	
	//���캯�����в�������ͨ���������ɶ���
	/*
	 * 1 ͨ��forname�ҵ��������
	 * 2 ͨ��getConstructor���������Ĳ������Զ����ƥ�乹�췽���Ĳ�������
	 * 3 ����newInstance�������ɶ��� 
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
