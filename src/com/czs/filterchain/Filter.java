package com.czs.filterchain;

import java.util.Collection;

public interface Filter<T> {

	public void doFilter(Request request,Response response,Filter<? extends T> filter);

}
