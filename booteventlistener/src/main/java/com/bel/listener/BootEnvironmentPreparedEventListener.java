package com.bel.listener;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;

public class BootEnvironmentPreparedEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
		Environment env = event.getEnvironment();
		System.out.println("BootEnvironmentPreparedEvent reading property (application.name) from env : "
				+ env.getProperty("application.name"));
		
	}

}
