package com.thoughtstopen.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbRestfulWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbRestfulWebServiceApplication.class, args);
	}

}
