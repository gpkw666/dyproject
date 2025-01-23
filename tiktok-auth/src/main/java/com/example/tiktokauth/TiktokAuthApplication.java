package com.example.tiktokauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TiktokAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiktokAuthApplication.class, args);
    }
}
