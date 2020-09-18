//package com.xiaofsu.demo;
//
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.AbstractController;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@Component
//public class MyCustomController extends AbstractController {
//
//    @Override
//    protected ModelAndView handleRequestInternal(HttpServletRequest request,
//                                                 HttpServletResponse response) throws Exception {
//
//        // 这里判断 请求的方法是否存在数据库，如果存在则查询sql
//        // 如果判断 请求的方法不存在数据库，则直接返回异常。
//        System.out.println("请求IP : " + getClientIp(request));
////        System.out.println("请求账号: " + HttpUtil.getTokenUser(request));
//        System.out.println("请求方法: " + request.getRequestURI());
//
//        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
//        response.getWriter().println("{\"hello\":\"world\"}");
//
//        return null;
//    }
//
//    public static String getClientIp(HttpServletRequest request) {
//        String ip = request.getHeader("X-Forwarded-For");
//        if (!StringUtils.isEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
//            //多次反向代理后会有多个ip值，第一个ip才是真实ip
//            int index = ip.indexOf(",");
//            if (index != -1) {
//                return ip.substring(0, index);
//            } else {
//                return ip;
//            }
//        }
//        ip = request.getHeader("X-Real-IP");
//        if (!StringUtils.isEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
//            return ip;
//        }
//        return request.getRemoteAddr();
//
//    }
//}