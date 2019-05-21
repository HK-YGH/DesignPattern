package com.czs.factory.abst;

public class TestAbstractFactory {

	public static void main(String[] args) {
		IProduct product = ProductFactory.order("busbig1");
		product.doAction("ÅÜÆðÀ´");
	}
}
