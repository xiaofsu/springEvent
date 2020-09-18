package com.xiaofsu.demo.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author xiaoFsu
 * 继承 ApplicationEvent
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
