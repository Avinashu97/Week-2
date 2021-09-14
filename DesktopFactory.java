package com.comp.AbstractFactory;

import com.computer.beans.Computers;
import com.computer.beans.Desktop;

public class DesktopFactory implements ComputerAbstractFactory {
	private String brand;
	private String price;
	private String processor;
	
	
	public DesktopFactory(String brand, String price, String processor) {
		this.brand = brand;
		this.price = price;
		this.processor = processor;
	}


	@Override
	public Computers createComputer() {
		// TODO Auto-generated method stub
		return new Desktop(this.brand, this.price, this.processor);
	}

}
