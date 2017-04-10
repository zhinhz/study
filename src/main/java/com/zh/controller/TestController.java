package com.zh.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhanghao on 2017/4/10.
 */

@RestController
@EnableAutoConfiguration
public class TestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Hello World~";
    }
}