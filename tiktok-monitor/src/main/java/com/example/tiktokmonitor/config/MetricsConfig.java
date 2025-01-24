package com.example.tiktokmonitor.config;
import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.exporter.HTTPServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MetricsConfig {

    @Bean
    public HTTPServer prometheusServer() throws Exception {
        return new HTTPServer(1234); // 在1234端口启动Prometheus HTTPServer
    }
}
