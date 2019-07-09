package com.ygh.demo;

public class Vicepresident<T extends PurchaseResquest> extends ApproverHandler<T> {

    public Vicepresident(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(PurchaseResquest request) {
        if (request.getAmount()>5 && request.getAmount() < 10) {
            System.out.println(String.format("副董事长%s审批了该购买请求：金额为：%s 购买目的为：%s",name,request.getAmount(),request.getPurpose()));
        }else{
            nextHandler.handlerRequest(request);
        }
    }
}
