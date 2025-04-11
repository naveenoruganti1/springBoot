package com.eventprog.event;

import org.springframework.context.ApplicationEvent;

public class ReloadCacheEvent extends ApplicationEvent {
	private String key;

	public ReloadCacheEvent(Object source, String key) {
		super(source);
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
