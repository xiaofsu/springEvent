//package com.xiaofsu.demo;
//
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.support.PropertiesLoaderUtils;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.DispatcherServlet;
//import org.springframework.web.servlet.HandlerExecutionChain;
//import org.springframework.web.servlet.HandlerMapping;
//import org.springframework.web.servlet.handler.AbstractUrlHandlerMapping;
//
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//import java.util.Properties;
//
//@Component
//public class Config implements HandlerMapping {
//
////    /**
////     * Name of the class path resource (relative to the DispatcherServlet class)
////     * that defines DispatcherServlet's default strategy names.
////     */
////    private static final String DEFAULT_STRATEGIES_PATH = "DispatcherServlet.properties";
////
////    private static final Properties defaultStrategies;
////
////    static {
////        // Load default strategy implementations from properties file.
////        // This is currently strictly internal and not meant to be customized
////        // by application developers.
////        try {
////            ClassPathResource resource = new ClassPathResource(DEFAULT_STRATEGIES_PATH, DispatcherServlet.class);
////            defaultStrategies = PropertiesLoaderUtils.loadProperties(resource);
////            System.out.println(defaultStrategies);
////        }
////        catch (IOException ex) {
////            throw new IllegalStateException("Could not load '" + DEFAULT_STRATEGIES_PATH + "': " + ex.getMessage());
////        }
////    }
//
//    @Override
//    public HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
//        return null;
//    }
//}
//
//
///**
// * author:xiaoFsu
// * time:2020.09.16 14:48:12
// *
// * {
// * org.springframework.web.servlet.HandlerExceptionResolver=org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver,
// * org.springframework.web.servlet.mvc.annotation.ResponseStatusExceptionResolver,
// * org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver,
// * org.springframework.web.servlet.FlashMapManager=org.springframework.web.servlet.support.SessionFlashMapManager,
// * org.springframework.web.servlet.ViewResolver=org.springframework.web.servlet.view.InternalResourceViewResolver,
// * org.springframework.web.servlet.HandlerAdapter=org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter,
// * org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter,
// * org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter,
// * org.springframework.web.servlet.function.support.HandlerFunctionAdapter,
// * org.springframework.web.servlet.RequestToViewNameTranslator=org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator,
// * org.springframework.web.servlet.HandlerMapping=org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping,
// * org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping,org.springframework.web.servlet.function.support.RouterFunctionMapping,
// * org.springframework.web.servlet.ThemeResolver=org.springframework.web.servlet.theme.FixedThemeResolver,
// * org.springframework.web.servlet.LocaleResolver=org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver
// * }
// *
// */