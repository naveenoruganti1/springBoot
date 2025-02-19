package com.nestedioc.beans;

// no source code
public class Rocket {
	private String fuelType;
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

	public void ignite() {
		System.out.println("Rocket [fuelType=" + fuelType + ", capacity=" + capacity + "] is ignited...");
	}

}
