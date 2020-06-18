package com.cctv.productserver.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanbofan
 * @create 2020-06-17 20:04
 * @desc
 **/
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String index(){
        return "hello world";
    }
}