package com.wang.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nacos")
public class NacosConfig {
    @NacosValue(value = "${msg}",autoRefreshed = true)
    private String msg;

    @RequestMapping("config")
    public String config(){
        return msg;
    }
}
