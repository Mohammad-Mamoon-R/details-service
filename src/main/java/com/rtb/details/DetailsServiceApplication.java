package com.rtb.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetailsServiceApplication.class, args);
                System.out.println("Main Method");
	}

}
