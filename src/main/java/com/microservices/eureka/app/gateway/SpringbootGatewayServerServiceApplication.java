package com.microservices.eureka.app.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootGatewayServerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGatewayServerServiceApplication.class, args);
	}

}
