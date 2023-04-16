package com.mall.noxbff.web.controller;

import com.mall.noxcommon.util.DemoUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String hello(){
        int anInt = DemoUtils.randomInt();
        log.info("随机数：" + anInt);
        String uri = "http://nox-goods/goods/hello";
        String object = restTemplate.getForObject(uri, String.class);
        return object;
    }
}
