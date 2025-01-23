package com.example.tiktokpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TiktokPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiktokPaymentApplication.class, args);
    }

}
