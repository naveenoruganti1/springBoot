package com.nestedioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nestedioc.beans.Rocket;

@Configuration
public class ParentConfig {
	@Bean
	public Rocket rocket(@Value("${fuelType}") String fuelType, @Value("${capacity}") int capacity) {
		Rocket rocket = new Rocket();
		rocket.setFuelType(fuelType);
		rocket.setCapacity(capacity);
		return rocket;
	}
}
