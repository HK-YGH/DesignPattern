package com.ygh.demo;

public class DirectorHandler<T extends PurchaseResquest> extends ApproverHandler<T> {


    public DirectorHandler(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(PurchaseResquest request) {
        if (request.getAmount()<5) {
            System.out.println(String.format("部门主管%s审批了该购买请求：金额为：%s 购买目的为：%s",name,request.getAmount(),request.getPurpose()));
        }else{
            System.out.println(String.format("部门主管无权审批该申请"));
            this.nextHandler.handlerRequest(request);
        }
    }
}
