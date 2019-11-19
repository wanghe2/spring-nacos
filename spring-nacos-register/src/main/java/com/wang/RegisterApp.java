package com.wang;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class RegisterApp {

    public static void main(String[] args){
        SpringApplication.run(RegisterApp.class,args);
    }

    @RestController
    static class TestController {

        @GetMapping("/hello")
        public String hello(String name) {
            return "hello " + name;
        }

    }

}

