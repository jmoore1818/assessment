package com.Assessment;

import java.lang.reflect.Array;

public class Vehicle {


	public static void main(String[] args) {
		
		int doors = 0;
		int windows = 0;
		int wheels = 0;
		int exhaustPipes = 0;
		int seats = 0;		
		
	}
	
	Vehicle(int doors, int windows, int wheels, int exhaustPipes, int seats) {
	}

	Vehicle car = new Vehicle(4, 6, 4, 2, 2);

	};


	public Vehicle(Vehicle car) {
		this.car = car;


	
	
	public Vehicle getCar() {
		return car;
	}

	public void setCar(Vehicle car) {
		this.car = car;
		
		
	}

	public Vehicle getJeep() {
		return Jeep;
	}

	public void setJeep(Vehicle jeep) {
		Jeep = jeep;
	}

	@Override
	public String toString() {
		return "Vehicle [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	

	
	}


