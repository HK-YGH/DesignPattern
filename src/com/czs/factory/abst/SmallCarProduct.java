package com.czs.factory.abst;

public class SmallCarProduct implements IProduct {

	@Override
	public void doAction(String name) {
		// TODO Auto-generated method stub
		System.out.println("smallcar:"+name);
	}

}
