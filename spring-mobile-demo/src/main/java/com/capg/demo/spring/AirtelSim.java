package com.capg.demo.spring;

public class AirtelSim implements Sim{

	@Override
	public void call() {
		System.out.println("Calling with Airtel");
		
	}

	@Override
	public void browse() {
		System.out.println("Browsing with Airtel");
		
	}

}
