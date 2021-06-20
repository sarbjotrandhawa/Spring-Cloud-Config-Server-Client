package com.configuration.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringClougConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClougConfigServerApplication.class, args);
	}

}
