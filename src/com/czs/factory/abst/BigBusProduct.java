package com.czs.factory.abst;

public class BigBusProduct implements IProduct {

	@Override
	public void doAction(String name) {
		// TODO Auto-generated method stub
		System.out.println("bigbus被生产了:"+name);
	}

}
