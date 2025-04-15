package com.bel.listener;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

public class BootFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {

	@Override
	public void onApplicationEvent(ApplicationFailedEvent event) {
		Throwable t = event.getException();
		System.out.println(
				"encountered exception during startup of spring boot application with message : " + t.getMessage());
	}

}
