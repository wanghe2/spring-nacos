package com.wang;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import  com.alibaba.nacos.api.config.ConfigType;
@SpringBootApplication
@NacosPropertySource(dataId = "music_wind",autoRefreshed = true)
public class ConfigApp {
    public static void main(String[] args){
        SpringApplication.run(ConfigApp.class,args);
    }
}
