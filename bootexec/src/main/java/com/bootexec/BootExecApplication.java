package com.bootexec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bootexec.beans.LaunchPad;

@SpringBootApplication
//@Configuration
//@ComponentScan(basePackages = { "com.bootexec.*" })
//@EnableAutoConfiguration
public class BootExecApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootExecApplication.class, args);
		LaunchPad launchPad = context.getBean(LaunchPad.class);
		launchPad.launch();
	}
}
