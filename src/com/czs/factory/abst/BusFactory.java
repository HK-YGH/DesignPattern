package com.czs.factory.abst;

public class BusFactory implements IProductFactory {

	@Override
	public IProduct order(String name) {
		IProduct product = null;
		if(name.contains("small")) product = new SmallBusProduct();
		else {
			product = new BigBusProduct();
		}
		return product;
	}

}
