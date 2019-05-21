package com.czs.factory.abst;

public class CarFactory implements IProductFactory {

	@Override
	public IProduct order(String name) {
		// TODO Auto-generated method stub
		IProduct product = null;
		if(name.contains("small")) product = new SmallCarProduct();
		else {
			product = new BigCarProduct();
		}
		return product;
	}

}
