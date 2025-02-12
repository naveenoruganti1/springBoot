package com.pbb;

import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class ProgbootbannerApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ProgbootbannerApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(ProgbootbannerApplication.class);
		//builder.bannerMode(Banner.Mode.OFF);
		builder.banner(new ResourceBanner(new ClassPathResource("banner1.txt")));
		SpringApplication springApplication = builder.build();
		ApplicationContext context = springApplication.run(args);
	}

}
