package com.bel.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

public class BootPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {
	@Override
	public void onApplicationEvent(ApplicationPreparedEvent event) {
		ApplicationContext context = event.getApplicationContext();
		//((ConfigurableApplicationContext)context).refresh();
		System.out.println("application prepared");
	}
}
