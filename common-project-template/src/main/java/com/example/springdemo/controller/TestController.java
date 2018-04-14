package com.example.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2018-02-08.
 */

@RestController
public class TestController {

    //测试接口
    @RequestMapping("/test")
    public ModelAndView test(ModelAndView mv){
        mv.setViewName("/index");
        return mv;
    }
}

