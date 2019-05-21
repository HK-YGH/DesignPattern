package com.czs.reflect.proxy.intercepter;

import com.czs.reflect.proxy.HelloWorld;
import com.czs.reflect.proxy.HelloWorldImpl;

public class TestMyIntercepter {

	public static void main(String[] args) {
		String intercepterClass = "com.czs.reflect.proxy.intercepter.MyIntercepter";
		//String intercepterClass = null;
		HelloWorldImpl helloWorldImpl = new HelloWorldImpl("czs");
		//HelloWorldImpl helloWorldImpl = new HelloWorldImpl();
		IntercepterJdkProxy jdkProxy = new IntercepterJdkProxy(helloWorldImpl, intercepterClass);
		HelloWorld helloWorld = (HelloWorld) jdkProxy.bind();
		helloWorld.sayHelloWorld();
	}
}
