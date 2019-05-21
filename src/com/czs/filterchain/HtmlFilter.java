package com.czs.filterchain;

public class HtmlFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {
		// TODO Auto-generated method stub
		request.requestStr = request.requestStr.replace("<", "[").replace(">","]")+"---HtmlFilter---";
		filterChain.doFilter(request, response, filterChain);
		response.responseStr += "---HtmlFilter---";
	}

}
