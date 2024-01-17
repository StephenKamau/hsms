package com.stephenk.hsms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HsmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HsmsApplication.class, args);
	}

}
