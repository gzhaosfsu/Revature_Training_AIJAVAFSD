package com.day3.VehicleRentalSystem;
import java.util.Scanner;
import com.day3.VehicleRentalSystem.*;
public class RentalApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of vehicles: ");
		
		int numVehicles = sc.nextInt();
		sc.nextLine();
		Vehicle [] vehicles = new Vehicle[numVehicles];
		
		for (int i = 0; i < numVehicles;  i++) {
			System.out.println("Enter type (1 - Car, 2 - Bike) : ");
			String type = sc.nextLine();
			if (type.equals("1") || type.equals("1 - Car")) {
				System.out.println("Enter Vehicle Number: ");
				String vehicleNumber = sc.nextLine();
				System.out.println("Enter Model: ");
				String model = sc.nextLine();
				System.out.println("Enter Rate per Day: ");
				double ratePerDay = sc.nextDouble();
				System.out.println("Enter Days: ");
				int days = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Insurance per Day: ");
				double insurancePerDay = sc.nextDouble();
				sc.nextLine();
				vehicles[i] = new Car(vehicleNumber, model, ratePerDay, days, insurancePerDay);
			}
			else if (type.equals("2") || type.equals("2 - Bike")) {
				System.out.println("Enter Vehicle Number: ");
				String vehicleNumber = sc.nextLine();
				System.out.println("Enter Model: ");
				String model = sc.nextLine();
				System.out.println("Enter Rate per Day: ");
				double ratePerDay = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter Days: ");
				int days = sc.nextInt();
				sc.nextLine();
				vehicles[i] = new Bike(vehicleNumber, model, ratePerDay, days);
			}
		}
		
		System.out.println("--- Rental Details ---");
		double totalRent = 0;
		for (Vehicle v: vehicles) {
			System.out.println(v);
			totalRent += v.calculateRent(v.ratePerDay, v.days);
		}
		System.out.println("Total Rent collected: " + totalRent);
	}

}
