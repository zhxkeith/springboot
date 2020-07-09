package com.zhx.springboot.exception;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 * 全局数据绑定
 * 全局数据预处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
public ModelAndView defaultErrorHandler(HttpServletRequest req,Exception exception){
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception",exception);
        mav.addObject("url",req.getRequestURI());
        mav.setViewName("errorPage");
        return mav;
}
}
