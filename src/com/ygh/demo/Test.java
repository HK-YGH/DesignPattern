package com.ygh.demo;


import com.ygh.Handler;

public class Test {
    public static void main(String[] args) {
        double amount = 22;
       PurchaseResquest purchaseResquest = new PurchaseResquest(amount,"买办公用品");
       Handler directorHandler = new DirectorHandler("张三");
       Handler vicepresident = new Vicepresident("李四");
       Handler presidentHandler = new PresidentHandler("王五");
       Handler congressHandler = new CongressHandler("赵六");

       directorHandler.setNextHandler(vicepresident);
       vicepresident.setNextHandler(presidentHandler);
       presidentHandler.setNextHandler(congressHandler);

       directorHandler.handlerRequest(purchaseResquest);
    }
}
