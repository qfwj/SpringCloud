package com.example.qfcloud.controller;

import com.example.qfcloud.helloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by puhui on 2017/5/1.
 */
@RestController
public class HelloController {
    @Autowired
    helloService hello_Service;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return hello_Service.hiService(name);
    }
}
