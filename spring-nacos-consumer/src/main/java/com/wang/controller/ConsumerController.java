package com.wang.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "failBackConsumer")
    @RequestMapping("consumer")
    public String consumer(String name){
       String back_data= restTemplate.getForEntity("http://nacos-producer/producer",String.class,name).getBody();
        return "远程访问获取到的数据："+back_data;
    }

    public String failBackConsumer(String name){
        return "返回失败的回退信息-"+name;
    }
}
