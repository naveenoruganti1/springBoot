package com.bel.listener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;

import com.bel.beans.Tank;

public class BootReadyEventListener implements ApplicationListener<ApplicationReadyEvent>{
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		ApplicationContext context = event.getApplicationContext();
		Tank tank = context.getBean(Tank.class);
		tank.info();
	}
}
