package com.czs.observer;

import java.util.Observable;
import java.util.Observer;

public class JdObserver implements Observer {

	@Override
	public void update(Observable o, Object product) {
		// TODO Auto-generated method stub
		String newProduct = (String) product;
		System.err.println("发布新产品【"+newProduct+"】同步到京东商城");
	}

}
