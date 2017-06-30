package com.wiggle.perf;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.JSON;
import io.swagger.client.api.AvailibilityApi;
import io.swagger.client.auth.OAuth;
import io.swagger.client.model.InlineResponse2001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Collections;
import java.util.Properties;

@SpringBootApplication
@EnableScheduling
public class PerfApplication {
	public static void main(String[] args) throws ApiException {
		SpringApplication.run(PerfApplication.class, args);
	}
}
