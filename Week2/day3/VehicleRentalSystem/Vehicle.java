package com.day3.VehicleRentalSystem;

public class Vehicle {
	String vehicleNumber;
	String model;
	double ratePerDay;
	int days;
	
	public Vehicle(String vehicleNumber, String model, double ratePerDay, int days) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.ratePerDay = ratePerDay;
		this.days = days;
	}
	
	public double calculateRent(double ratePerDay, int days) {
		return ratePerDay * days;
	}
	

}
