package com.spas.ppmtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.spas")
@SpringBootApplication
public class PpmtoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(PpmtoolApplication.class, args);
	}
}
