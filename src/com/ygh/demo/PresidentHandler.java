package com.ygh.demo;

public class PresidentHandler<T extends PurchaseResquest> extends ApproverHandler<T> {

    public PresidentHandler(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(PurchaseResquest request) {
        if (request.getAmount()>10 && request.getAmount() < 20) {
            System.out.println(String.format("董事长%s审批了该购买请求，购买金额为%s，购买目的为%s",super.name,request.getAmount(),request.getPurpose()));
        }else{
            nextHandler.handlerRequest(request);
        }
    }
}
