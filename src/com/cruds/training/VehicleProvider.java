package com.cruds.training;

import java.util.ArrayList;
import java.util.LinkedList;

public class VehicleProvider {
	
	public static ArrayList<String> getVehicleModel()
	{
		ArrayList<String> models = new ArrayList<>();
		models.add("Honda");
		models.add("Hyundai");
		models.add("Maruthi");
		return models;
	}
	
	
	public static IVehicle getVehicle(String type)
	{
		if(type.equals(IVehicle.LUXURY_TYPE))
		{
			return new Car();
		}
		if(type.equals(IVehicle.PASS_TYPE))
		{
			return new Bus();
		}
		if(type.equals(IVehicle.PET_TYPE))
		{
			return new Dog();
		}
		return null;
	}

}
