package com.online.ocPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.online"})
public class OcPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcPortalApplication.class, args);
	}
}
