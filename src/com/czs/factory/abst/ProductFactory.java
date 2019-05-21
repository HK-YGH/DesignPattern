package com.czs.factory.abst;

public class ProductFactory {

	public static IProduct order(String name) {
		// TODO Auto-generated method stub
		IProductFactory factory = null;
		if(name.contains("bus")){
			factory = new BusFactory();
		}else if(name.contains("car")){
			factory = new CarFactory();
		}
		
		if(factory!=null){
			return factory.order(name);
		}
		return null;
	}

}
