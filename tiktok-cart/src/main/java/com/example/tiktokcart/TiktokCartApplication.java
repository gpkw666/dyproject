package com.example.tiktokcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TiktokCartApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiktokCartApplication.class, args);
    }

}
