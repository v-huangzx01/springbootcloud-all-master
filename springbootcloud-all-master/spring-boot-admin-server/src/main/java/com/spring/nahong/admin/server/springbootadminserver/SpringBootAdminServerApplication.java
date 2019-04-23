package com.spring.nahong.admin.server.springbootadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@EnableEurekaClient
@SpringBootApplication
public class SpringBootAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminServerApplication.class, args);
	}
}
