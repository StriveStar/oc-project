package com.online.ocService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.online.ocService.mapper")
public class OcServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcServiceApplication.class, args);
	}
}
