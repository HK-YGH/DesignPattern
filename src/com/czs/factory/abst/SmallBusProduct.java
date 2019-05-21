package com.czs.factory.abst;

public class SmallBusProduct implements IProduct {

	@Override
	public void doAction(String name) {
		// TODO Auto-generated method stub
		System.out.println("smallbus:"+name);
	}

}
