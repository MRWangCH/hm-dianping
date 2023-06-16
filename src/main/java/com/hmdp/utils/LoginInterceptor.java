package com.hmdp.utils;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //判断是否需要拦截（Threadlocal中是否有有用户）
        if (UserHolder.getUser() == null){
            //没有需要拦截
            response.setStatus(401);
            //拦截
            return false;
        }
        //8. 放行
        return true;
    }

}
