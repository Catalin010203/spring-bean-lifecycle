package com.example.alpha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {"com.example.alpha," + "util"}
)
public class AlphaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlphaApplication.class, args);
	}

}
