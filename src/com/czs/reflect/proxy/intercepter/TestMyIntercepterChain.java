package com.czs.reflect.proxy.intercepter;

import com.czs.reflect.proxy.HelloWorld;
import com.czs.reflect.proxy.HelloWorldImpl;

public class TestMyIntercepterChain {

	public static void main(String[] args) {
		HelloWorldImpl helloWorldImpl = new HelloWorldImpl("czs");
		String intercepterClass1 = "com.czs.reflect.proxy.intercepter.MyIntercepter";
		String intercepterClass2 = "com.czs.reflect.proxy.intercepter.MyIntercepter2";
		String intercepterClass3 = "com.czs.reflect.proxy.intercepter.MyIntercepter3";
		
		HelloWorld proxy1 = (HelloWorld) IntercepterJdkProxy.bind(helloWorldImpl, intercepterClass1);
		HelloWorld proxy2 = (HelloWorld) IntercepterJdkProxy.bind(proxy1, intercepterClass2);
		HelloWorld proxy3 = (HelloWorld) IntercepterJdkProxy.bind(proxy2, intercepterClass3);
		proxy3.sayHelloWorld();
	}
}
