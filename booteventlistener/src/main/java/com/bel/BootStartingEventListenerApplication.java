package com.bel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.bel.listener.BootEnvironmentPreparedEventListener;
import com.bel.listener.BootFailedEventListener;
import com.bel.listener.BootPreparedEventListener;
import com.bel.listener.BootReadyEventListener;
import com.bel.listener.BootStartedEventListener;
import com.bel.listener.BootStartupActivityListener;

@SpringBootApplication
public class BootStartingEventListenerApplication {
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplicationBuilder(BootStartingEventListenerApplication.class)
				.listeners(new BootStartupActivityListener(), new BootEnvironmentPreparedEventListener(),
						new BootStartedEventListener(), new BootPreparedEventListener(), new BootReadyEventListener(),
						new BootFailedEventListener())
				.build();
		ApplicationContext context = springApplication.run(args);
	}

	@Bean
	public CommandLineRunner runner() {
		return (args) -> {
			throw new Exception("startup failed");
		};
	}
}
