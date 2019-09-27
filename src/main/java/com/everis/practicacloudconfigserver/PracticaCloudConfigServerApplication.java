package com.everis.practicacloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PracticaCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticaCloudConfigServerApplication.class, args);
	}

}
