package com.czs.observer;

public class TestObserverPattern {

	public static void main(String[] args) {
		ProductList observable = ProductList.getInstance();
		TaoBaoObserver tbo = new TaoBaoObserver();
		JdObserver jdo = new JdObserver();
		observable.addProductListObserver(jdo);
		observable.addProductListObserver(tbo);
		observable.addProduct("������Ʒ1");
		observable.addProduct("������Ʒ2");
	}
}
