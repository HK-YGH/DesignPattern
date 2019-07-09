package com.ygh.demo;

public class CongressHandler<T extends PurchaseResquest> extends ApproverHandler<T> {

    public CongressHandler(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(PurchaseResquest request) {
        System.out.println(String.format("董事会审批了该购买请求：金额为：%s 购买目的为：%s",request.getAmount(),request.getPurpose()));
    }
}
