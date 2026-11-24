package com.day4.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class useEmployee {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Employee[] emps = {
				new Employee(1,"Charles", "HR", 85000D), 
				new Employee(2,"Thomas", "Finance", 105000D),
				new Employee(3, "Jake", "Security", 75000D),
				new Employee(4, "Richard", "Management", 125000D),
				new Employee(5, "Alfred", "Security", 87500D)
		};
		
		try(FileOutputStream fos = new FileOutputStream("employees.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(emps);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("employees.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Employee[] readEmps = (Employee[]) ois.readObject();
			for (Employee e : readEmps) {
				System.out.println(e);
			}
		}

	}

}