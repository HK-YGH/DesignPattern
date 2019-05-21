package com.czs.reflect.proxy;

public class HelloWorldImpl implements HelloWorld {

	private String session;
	
	public HelloWorldImpl() {
	
	}

	public HelloWorldImpl(String session) {
		this.session = session;
	}

	@Override
	public void sayHelloWorld() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

}
