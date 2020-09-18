//package com.xiaofsu.demo;
//
//
//import org.springframework.web.servlet.handler.AbstractHandlerMapping;
//
//import javax.servlet.http.HttpServletRequest;
//
//public class MyCustomHandler extends AbstractHandlerMapping {
//
//    private MyCustomController myCustomController;
//
//    public MyCustomHandler(MyCustomController myCustomController) {
//        this.myCustomController = myCustomController;
//    }
//
//    @Override
//    protected Object getHandlerInternal(HttpServletRequest request) throws Exception {
//        System.out.println(request.getRequestURI());
//        return myCustomController;
//    }
//}