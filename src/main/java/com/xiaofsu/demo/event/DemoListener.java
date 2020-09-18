package com.xiaofsu.demo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author xiaoFsu
 * ApplicationListener<DemoEvent>   实现ApplicationListener接口，指定监听的事件类型
 *
 */
@Component
@EnableAsync
public class DemoListener{

    /**
     * author:xiaoFsu
     * time:2020.09.18 9:59:09
     * 使用此方法对消息进行接收处理
     */
    @Async
    @EventListener
    public void onApplicationEvent(DemoEvent event) {
        System.out.println("DemoEvent -- >  线程名称："+Thread.currentThread().getName()+ " ->> 时间："+ new Date()+ " ->>消息："+event.getMsg());
        // 模拟短信发送处理需要的时长
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * author:xiaoFsu
     * time:2020.09.18 9:59:09
     * 使用此方法对消息进行接收处理
     */
    @Async
    @EventListener
    public void onApplicationEvent(MyEvent event) {
        System.out.println("MyEvent -- > 线程名称："+Thread.currentThread().getName()+ " ->> 时间："+ new Date()+ " ->>消息："+event.getMsg());
        // 模拟短信发送处理需要的时长
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
