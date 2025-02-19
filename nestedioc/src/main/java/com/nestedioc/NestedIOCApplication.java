package com.nestedioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nestedioc.beans.Launcher;
import com.nestedioc.beans.Rocket;

@SpringBootApplication
public class NestedIOCApplication {

	@Bean
	public Launcher launcher(@Value("${launchPad}") int launchPad, Rocket rocket) {
		Launcher launcher = new Launcher();
		launcher.setLaunchPad(launchPad);
		launcher.setRocket(rocket);
		return launcher;
	}

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder();
		builder = builder.parent(ParentConfig.class).sources(NestedIOCApplication.class);
		SpringApplication springApplication = builder.build();
		
		ApplicationContext context = springApplication.run(args);
		Launcher launcher = context.getBean(Launcher.class);
		launcher.launch();
	}
}












