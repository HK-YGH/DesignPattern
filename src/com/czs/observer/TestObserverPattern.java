package com.czs.observer;

public class TestObserverPattern {

	public static void main(String[] args) {
		ProductList observable = ProductList.getInstance();
		TaoBaoObserver tbo = new TaoBaoObserver();
		JdObserver jdo = new JdObserver();
		observable.addProductListObserver(jdo);
		observable.addProductListObserver(tbo);
		observable.addProduct("新增商品1");
		observable.addProduct("新增商品2");
	}
}
