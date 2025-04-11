package com.eventprog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.eventprog.event.ReloadCacheEvent;

@Component
public class CityController {
	@Autowired
	private ApplicationEventPublisher publisher;

	public void updateCity(int cityId, String cityName) {
		ReloadCacheEvent event = null;

		System.out.println("updating city with id : " + cityId + " and name : " + cityName + " in database");
		event = new ReloadCacheEvent(this, "cities");
		publisher.publishEvent(event);
	}
}
