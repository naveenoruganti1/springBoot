package com.basicboot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FuelTank {
	@Value("${fuelType}")
	private String fuelType;
	@Value("${capacity}")
	private int capacity;

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "FuelTank [fuelType=" + fuelType + ", capacity=" + capacity + "]";
	}

}
