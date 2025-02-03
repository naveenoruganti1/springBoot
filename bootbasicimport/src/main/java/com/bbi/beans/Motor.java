package com.bbi.beans;

import org.springframework.stereotype.Component;

@Component
public class Motor {
	public void start() {
		System.out.println("starting motor");
	}
}
