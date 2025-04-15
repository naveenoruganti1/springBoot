package com.bel.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;

public class BootStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {
	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		ApplicationContext context = event.getApplicationContext();
		int c = context.getBeanDefinitionCount();
		System.out.println("bean definitions (StartedEvent) loaded into ioc container and no : " + c);
	}
}
