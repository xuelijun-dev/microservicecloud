package com.xue.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController_Consumer {
//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "comsumer/dept/add")
    public boolean add(String dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }
    @RequestMapping(value = "comsumer/dept/list")
    public Object list(String dept){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",Object.class);
    }
    @RequestMapping(value = "comsumer/dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery",Object.class);
    }
}
