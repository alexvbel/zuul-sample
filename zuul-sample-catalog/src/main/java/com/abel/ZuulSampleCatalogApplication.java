package com.abel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ZuulSampleCatalogApplication {


	@RequestMapping(value = "/catalog")
	public List<String> catalog() {
		return Arrays.asList("First", "Second");
	}

	public static void main(String[] args) {
		SpringApplication.run(ZuulSampleCatalogApplication.class, args);
	}
}
