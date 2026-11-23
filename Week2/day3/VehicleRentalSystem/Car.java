package com.day3.VehicleRentalSystem;

public class Car extends Vehicle{
	double insurancePerDay;
	
	
	public Car(String vehicleNumber, String model, double ratePerDay, int days, double insurancePerDay) {
		super(vehicleNumber, model, ratePerDay, days);
		this.insurancePerDay = insurancePerDay;
	}
	
	@Override
	public double calculateRent(double ratePerDay, int days) {
		// TODO Auto-generated method stub
		return super.calculateRent(this.ratePerDay + this.insurancePerDay, this.days);
	}

	@Override
	public String toString() {
		return "Car \t| " + vehicleNumber + " | " + model + "\t| Days: " + days + "\t| Rent: " + calculateRent(this.ratePerDay, this.days);
	}

	
}
