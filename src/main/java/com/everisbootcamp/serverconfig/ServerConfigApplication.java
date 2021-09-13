package com.everisbootcamp.serverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableConfigServer
@SpringBootApplication
public class ServerConfigApplication { 
	public static void main(String[] args) {
		SpringApplication.run(ServerConfigApplication.class, args);
		log.info("SERVER CONFIG ENABLED");
	}

}
