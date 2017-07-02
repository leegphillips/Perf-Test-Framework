package com.wiggle.perf;

import io.swagger.client.ApiException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class PerfApplication {
	public static void main(String[] args) throws ApiException {
		SpringApplication.run(PerfApplication.class, args);
	}
}
