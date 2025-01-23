package com.example.tiktoksearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TiktokSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiktokSearchApplication.class, args);
    }

}
