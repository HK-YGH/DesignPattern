package com.czs.reflect.proxy;

public class TestJdkProxy {

	public static void main(String[] args) {
//		JdkProxyExample jdk = new JdkProxyExample();
//		HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());
		HelloWorld proxy = (HelloWorld) JdkProxyExample2.bind(new HelloWorldImpl());
		proxy.sayHelloWorld();
	}
}
