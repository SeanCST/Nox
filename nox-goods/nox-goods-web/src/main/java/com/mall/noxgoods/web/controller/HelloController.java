package com.mall.noxgoods.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods/hello")
public class HelloController {

    @GetMapping
    public String hello() throws InterruptedException {
        Thread.sleep(10 * 1000);
        return "Hello Goods";
    }

}
