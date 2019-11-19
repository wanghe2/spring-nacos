package com.wang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @RequestMapping("producer")
    public String producer(){
        return "good job";
    }

}
