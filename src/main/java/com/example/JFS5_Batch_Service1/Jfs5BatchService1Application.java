package com.example.JFS5_Batch_Service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class Jfs5BatchService1Application {

	public static void main(String[] args) {
		SpringApplication.run(Jfs5BatchService1Application.class, args);
	}

}
