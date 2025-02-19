package com.nestedioc.beans;

// no source code
public class Launcher {
	private int launchPad;
	private Rocket rocket;

	public int getLaunchPad() {
		return launchPad;
	}

	public void setLaunchPad(int launchPad) {
		this.launchPad = launchPad;
	}

	public Rocket getRocket() {
		return rocket;
	}

	public void setRocket(Rocket rocket) {
		this.rocket = rocket;
	}

	public void launch() {
		System.out.println("launching rocket from launchpad : " + launchPad);
		rocket.ignite();
	}
}
