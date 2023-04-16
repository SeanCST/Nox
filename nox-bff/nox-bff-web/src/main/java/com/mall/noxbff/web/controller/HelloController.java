package com.mall.noxbff.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String hello(){
        String uri = "http://nox-goods/goods/hello";
        String object = restTemplate.getForObject(uri, String.class);
        return object;
    }
}
