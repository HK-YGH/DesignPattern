package com.czs.filterchain;

public class TestFilterChain {

	public static void main(String[] args) {
		String str = "��ð�,<script>,����Ĳ��Ǳ���ҵ�ģ���ϲ�����еĴʻ�";
		Request request = new Request();
		Response response = new Response();
		request.setRequestStr(str);
		response.setResponseStr("response");
		
		FilterChain fc = new FilterChain();
		fc.addFilter(new HtmlFilter()).addFilter(new SensitiveFilter());
		
		fc.doFilter(request, response, fc);
		
		System.out.println(request.requestStr);
		System.out.println(response.responseStr);
	}
}
