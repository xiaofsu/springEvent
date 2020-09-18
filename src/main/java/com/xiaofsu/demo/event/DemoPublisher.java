package com.xiaofsu.demo.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class DemoPublisher {

    @Autowired
    private ApplicationContext applicationContext;

    /**
     * @author:xiaoFsu
     * @time:2020.09.18-13:14:25
     * 发送 demoEvent的方法
     */
    @Async
    public void publishMsg(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }

    /**
     * @author:xiaoFsu
     * @time:2020.09.18-13:14:25
     * 发送 myEvent的方法
     */
    @Async
    public void publishMsg2(String msg){
        applicationContext.publishEvent(new MyEvent(this,msg));
    }

}
