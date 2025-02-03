package com.bg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bg.beans.BiCycle;

@SpringBootApplication
public class BGApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BGApplication.class, args);
		BiCycle biCycle = context.getBean(BiCycle.class);
		biCycle.ride();
	}
}
