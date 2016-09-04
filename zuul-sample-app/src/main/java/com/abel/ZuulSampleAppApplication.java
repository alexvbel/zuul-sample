package com.abel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulSampleAppApplication {


	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}


	public static void main(String[] args) {
		SpringApplication.run(ZuulSampleAppApplication.class, args);
	}
}
