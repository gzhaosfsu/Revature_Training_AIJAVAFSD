package com.day3.VehicleRentalSystem;

public class Bike extends Vehicle {
	double discount = 0.9;
	
	public Bike(String vehicleNumber, String model, double ratePerDay, int days) {
		super(vehicleNumber, model, ratePerDay, days);
	}


	@Override
	public double calculateRent(double ratePerDay, int days) {
		// TODO Auto-generated method stub
		return super.calculateRent(ratePerDay, days) * discount;
	}


	@Override
	public String toString() {
		return "Bike \t| " + vehicleNumber + " | " + model + "| Days: " + days + "| Rent: " + calculateRent(this.ratePerDay, this.days);
	}
}
