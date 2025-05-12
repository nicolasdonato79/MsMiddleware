package com.example.msMiddleware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class MsMiddilewareApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMiddilewareApplication.class, args);
	}

}
