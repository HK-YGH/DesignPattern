package com.czs.factory.simple;

public class TestStaticFactory {
	public static void main(String[] args) throws Exception {
		jdbcInf dbInstance = StaticProductFactory.createProduct("mysql");
		dbInstance.getConnection();
	}
}
