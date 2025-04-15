package com.bel.beans;

import org.springframework.stereotype.Component;

@Component
public class Tank {

	public Tank() {
		System.out.println("tank() created");
	}

	public void info() {
		System.out.println("tank capacity: 10 liters");
	}
}
