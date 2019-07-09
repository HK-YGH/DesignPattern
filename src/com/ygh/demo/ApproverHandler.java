package com.ygh.demo;

import desginPatter.chainOfResponsibility.Handler;
import lombok.Data;

@Data
public abstract class ApproverHandler<T extends PurchaseResquest> extends Handler<T>{

    protected String name;

    public ApproverHandler(String name){
        this.name = name;
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        super.setNextHandler(nextHandler);
    }

    @Override
    public abstract  void handlerRequest(T request);

}
