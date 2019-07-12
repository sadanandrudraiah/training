package com.cruds.training;

public class Bus implements IVehicle{

	@Override
	public void start() {
		System.out.println("Bus starts");
	}

	@Override
	public void stop() {
		System.out.println("Bus stops");
	}

}
