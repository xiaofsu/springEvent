package com.xiaofsu.demo;

import com.xiaofsu.demo.event.DemoConfig;
import com.xiaofsu.demo.event.DemoPublisher;
import com.xiaofsu.demo.event.MyEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        // 必须指定一下这个
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        DemoPublisher bean = context.getBean(DemoPublisher.class);
        bean.publishMsg("A 注册成功");
        bean.publishMsg("B 注册成功");
        bean.publishMsg("C 注册成功");
        bean.publishMsg("D 注册成功");
        bean.publishMsg("E 注册成功");
        bean.publishMsg("F 注册成功");
        bean.publishMsg("G 注册成功");


        bean.publishMsg2("A 发送成功");
        bean.publishMsg2("B 发送成功");
        bean.publishMsg2("C 发送成功");
        bean.publishMsg2("D 发送成功");
        bean.publishMsg2("E 发送成功");
        bean.publishMsg2("F 发送成功");
        bean.publishMsg2("G 发送成功");


//        context.close();
    }


//    @Bean
//    public MyCustomHandler myCustomHandler(MyCustomController myCustomController) {
//        MyCustomHandler myCustomHandler = new MyCustomHandler(myCustomController);
//        myCustomHandler.setOrder(Ordered.HIGHEST_PRECEDENCE);
//        return myCustomHandler;
//    }
}
