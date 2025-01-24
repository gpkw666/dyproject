package com.example.tiktokgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                // 购物车服务
                .route("cart", r -> r.path("/cart/**")
                        .uri("http://127.0.0.1:9092"))
                // 订单服务
                .route("order", r -> r.path("/order/**")
                        .uri("http://127.0.0.1:9095"))
                // 商品服务
                .route("commodity", r -> r.path("/commodity/**")
                        .uri("http://127.0.0.1:9093"))
                // 支付服务
                .route("payment", r -> r.path("/payment/**")
                        .uri("http://127.0.0.1:9096"))
                // 用户服务
                .route("user", r -> r.path("/user/**")
                        .uri("http://127.0.0.1:9099"))
                .build();
    }
}

