package com.czs.factory.abst;

public class BigCarProduct implements IProduct {

	@Override
	public void doAction(String name) {
		// TODO Auto-generated method stub
		System.out.println("bigcar:"+name);
	}

}
