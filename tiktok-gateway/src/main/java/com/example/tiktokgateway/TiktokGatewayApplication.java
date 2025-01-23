package com.example.tiktokgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 网关模块
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TiktokGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiktokGatewayApplication.class, args);
    }

}
