package com.eventprog.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eventprog.config.JavaConfig;
import com.eventprog.controller.CityController;

public class EventProgTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		try {
			CityController cityController = context.getBean(CityController.class);
			cityController.updateCity(10, "Chennai");
		} finally {
			((ConfigurableApplicationContext) context).close();
		}
	}
}
