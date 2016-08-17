package com.Assessment;

import java.lang.reflect.Array;

public class Jeep extends Vehicle{

	Jeep(int doors, int windows, int wheels, int exhaustPipes, int seats) {
		super(doors, windows, wheels, exhaustPipes, seats);
		// TODO Auto-generated constructor stub
	
	}public Jeep() {int doors = 2; int windows = 2; int wheels = 4; int exhaustPipes = 3; int seats = 4;
		// TODO Auto-generated constructor stub
	

	}

	@Override
	public String toString() {
		return "Jeep [car=" + car + ", getCar()=" + getCar() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	private void Jeep() {
		// TODO Auto-generated method stub
		
	}

}
