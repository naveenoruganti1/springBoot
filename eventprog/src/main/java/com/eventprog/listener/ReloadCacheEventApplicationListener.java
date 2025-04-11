package com.eventprog.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.eventprog.event.ReloadCacheEvent;

@Component
public class ReloadCacheEventApplicationListener /* implements ApplicationListener<ReloadCacheEvent> */ {
	/*
	 * @Override public void onApplicationEvent(ReloadCacheEvent event) {
	 * System.out.println("received request for reload the data in cache of key : "
	 * + event.getKey()); }
	 */
	@EventListener
	public void onReloadCacheEvent(ReloadCacheEvent event) {
		System.out.println("received request for reload the data in cache of key : " + event.getKey());
	}
}
