package com.czs.builder;

public class TestBuilder {

	public static void main(String[] args) {
		TicketHelper th = new TicketHelper();
		th.buildChildrenNoSet("无座儿童");
		th.builtChildrenForSet("有座儿童");
		th.buildElderly("老人票");
		th.buildSoldier("军人票");
		TicketBuilder.builder(th);
	}
}
