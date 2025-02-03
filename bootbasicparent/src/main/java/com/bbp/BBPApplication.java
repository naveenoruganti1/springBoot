package com.bbp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bbp.beans.Robot;

//@SpringBootApplication
@Configuration
@ComponentScan(basePackages = { "com.bbp.*" })
@EnableAutoConfiguration
public class BBPApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BBPApplication.class, args);
		Robot robot = context.getBean(Robot.class);
		robot.init();
	}
}
