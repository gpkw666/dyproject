package com.example.tiktokmonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 监控系统
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TiktokMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiktokMonitorApplication.class, args);
    }

}
