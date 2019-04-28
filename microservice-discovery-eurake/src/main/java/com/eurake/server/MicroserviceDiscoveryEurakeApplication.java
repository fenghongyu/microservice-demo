package com.eurake.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroserviceDiscoveryEurakeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDiscoveryEurakeApplication.class, args);
	}
}
