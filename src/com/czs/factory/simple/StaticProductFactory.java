package com.czs.factory.simple;

public class StaticProductFactory {

	public static jdbcInf createProduct(String productNo) throws Exception {
		switch (productNo) {
		case "mysql":
			return new MysqlInst();
		case "oracle":
			return new OracleInst();
		default:
			throw new Exception("未支持此编号产品生产");
		}
	}
}
