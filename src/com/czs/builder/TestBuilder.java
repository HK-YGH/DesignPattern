package com.czs.builder;

public class TestBuilder {

	public static void main(String[] args) {
		TicketHelper th = new TicketHelper();
		th.buildChildrenNoSet("������ͯ");
		th.builtChildrenForSet("������ͯ");
		th.buildElderly("����Ʊ");
		th.buildSoldier("����Ʊ");
		TicketBuilder.builder(th);
	}
}
