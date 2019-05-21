package com.czs.filterchain;

import java.util.ArrayList;
import java.util.List;

public class FilterChain<T extends FilterChain> implements Filter<FilterChain> {
	@Override
	public void doFilter(Request request, Response response, Filter<? extends FilterChain> filter) {

	}

//	private List<Filter> filters = new ArrayList<>();
//	private int index = 0;
//
//	public FilterChain addFilter(Filter filter){
//		this.filters.add(filter);
//		return this;
//	}
//
//	@Override
//	public void doFilter(Request request, Response response, FilterChain filterChain) {
//		// TODO Auto-generated method stub
//		if(index == filters.size()) return;
//		Filter f = filters.get(index);
//		index++;
//		f.doFilter(request, response, filterChain);
//	}


}
