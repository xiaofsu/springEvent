package com.xiaofsu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class IndexController {

    @Autowired
    WebApplicationContext applicationContext;

    public List<String> urls() {
        List<String> urls = new ArrayList<>();
        RequestMappingHandlerMapping mapping = applicationContext
                .getBean(RequestMappingHandlerMapping.class);
//        mapping.re
//        Object defaultHandler = mapping.getDefaultHandler();

//        Method getMappingForMethod = ReflectionUtils.findMethod(RequestMappingHandlerMapping.class, "getMappingForMethod",Method.class,Class.class);
//        getMappingForMethod.setAccessible(true);
//
//        RequestMappingInfo mapping_info = (RequestMappingInfo) getMappingForMethod.invoke(requestMappingHandlerMapping, m_d,entry.getValue());
//
//        mapping.registerMapping();
        // 获取url与类和方法的对应信息
        Map<RequestMappingInfo, HandlerMethod> map = mapping
                .getHandlerMethods();
        for (RequestMappingInfo info : map.keySet()) {
            // 获取url的Set集合，一个方法可能对应多个url
            Set<String> patterns = info.getPatternsCondition().getPatterns();
            for (String url : patterns) {
                //把结果存入静态变量中程序运行一次次方法之后就不用再次请求次方法
                urls.add(url);
            }
        }



        return urls;
    }

    @RequestMapping("/test")
    public List<String> test(String name){
        return urls();
    }

}
