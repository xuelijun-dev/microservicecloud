package com.xue.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Microservicecloud_Config3344 {
    public static void main(String[] args) {
        SpringApplication.run(Microservicecloud_Config3344.class,args);
    }
}
