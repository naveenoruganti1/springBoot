package com.bbi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bbi.beans.Motor;

@SpringBootApplication
public class BBIApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BBIApplication.class, args);
		Motor motor = context.getBean(Motor.class);
		motor.start();
	}
}
