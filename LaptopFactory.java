package com.comp.AbstractFactory;

import com.computer.beans.Computers;
import com.computer.beans.Laptop;

public class LaptopFactory implements ComputerAbstractFactory {
	private String brand;
	private String price;
	private String processor;
	
	
	public LaptopFactory(String brand, String price, String processor) {
		this.brand = brand;
		this.price = price;
		this.processor = processor;
	}


	@Override
	public Computers createComputer() {
		// TODO Auto-generated method stub
		return new Laptop(this.brand, this.price, this.processor);
	}

}
