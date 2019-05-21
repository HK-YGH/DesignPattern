package com.czs.filterchain;

public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {
		// TODO Auto-generated method stub
		request.requestStr = request.requestStr.replace("被就业", "就业").replace("敏感","")+"---SensitiveFilter---";
		filterChain.doFilter(request, response, filterChain);
		response.responseStr += "---SensitiveFilter---";
	}

}
