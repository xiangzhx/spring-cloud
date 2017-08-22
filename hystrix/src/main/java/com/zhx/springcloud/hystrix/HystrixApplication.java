package com.zhx.springcloud.hystrix;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
public class HystrixApplication {

	public static void main(String[] args) {
//		SpringApplication.run(HystrixApplication.class, args);
		new SpringApplicationBuilder(HystrixApplication.class).web(true).run(args);
	}
}
