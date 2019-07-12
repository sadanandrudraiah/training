package com.cruds.training;

public class TestVehicle {

	public static void main(String[] args) {

		IVehicle v = VehicleProvider.getVehicle(IVehicle.LUXURY_TYPE);
		v.start();
		v.stop();
		
		
		
	}

}
