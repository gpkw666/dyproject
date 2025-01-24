package com.example.tiktokmonitor.config;

import io.prometheus.client.Counter;
import io.prometheus.client.Gauge;
public class SampleMetrics {

    // 定义一个计数器
    private static final Counter requests = Counter.build()
            .name("requests_total")
            .help("Total number of requests.")
            .register();

    // 定义一个Gauge
    private static final Gauge inProgress = Gauge.build()
            .name("inprogress_requests")
            .help("Number of requests currently in progress.")
            .register();

    public static void incrementRequests() {
        requests.inc();
    }

    public static void setInProgress(double value) {
        inProgress.set(value);
    }
}

