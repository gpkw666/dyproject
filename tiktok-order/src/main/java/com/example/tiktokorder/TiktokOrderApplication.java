package com.example.tiktokorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class TiktokOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiktokOrderApplication.class, args);
	}

}
