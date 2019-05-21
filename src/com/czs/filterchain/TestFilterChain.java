package com.czs.filterchain;

public class TestFilterChain {

	public static void main(String[] args) {
		String str = "你好棒,<script>,我真的不是被就业的，我喜欢敏感的词汇";
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
