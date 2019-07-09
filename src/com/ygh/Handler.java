package com.ygh;

public abstract class Handler<T extends Request> {

    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract  void handlerRequest(T t);
}
