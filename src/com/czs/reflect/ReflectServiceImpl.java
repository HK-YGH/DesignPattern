package com.czs.reflect;

public class ReflectServiceImpl {

	public void sayHello(String name){
		System.out.println("Hello "+name);
	}
	
	public String say(String name){
		System.out.println("���Է���invoke�ķ���ֵ");
		return name;
	}
	//���������ע����һ����ReflectServiceImpl��ȫ������
	//Ȼ��ͨ��newInstance������ʼ����һ����������ַ�ʽ��Ϊ��
	public static ReflectServiceImpl getInstance(){
		ReflectServiceImpl object = null;
		try{
			object = (ReflectServiceImpl) Class.forName("com.czs.reflect.ReflectServiceImpl").newInstance();
		}catch(ClassNotFoundException | InstantiationException | IllegalAccessException ex){
			ex.printStackTrace();
		}
		return object;
	}
	public static void main(String[] args) {
		ReflectServiceImpl obj = ReflectServiceImpl.getInstance();
		obj.sayHello("czs1");
	}
}
