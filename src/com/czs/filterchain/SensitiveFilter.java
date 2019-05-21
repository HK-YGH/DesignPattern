package com.czs.filterchain;

public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {
		// TODO Auto-generated method stub
		request.requestStr = request.requestStr.replace("����ҵ", "��ҵ").replace("����","")+"---SensitiveFilter---";
		filterChain.doFilter(request, response, filterChain);
		response.responseStr += "---SensitiveFilter---";
	}

}
