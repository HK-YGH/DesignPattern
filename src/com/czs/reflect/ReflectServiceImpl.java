package com.czs.reflect;

public class ReflectServiceImpl {

	public void sayHello(String name){
		System.out.println("Hello "+name);
	}
	
	public String say(String name){
		System.out.println("测试反射invoke的返回值");
		return name;
	}
	//给类加载器注册了一个类ReflectServiceImpl的全定限名
	//然后通过newInstance方法初始化了一个类对象，这种方式较为简单
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
