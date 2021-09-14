package com.comp.test;

import com.comp.AbstractFactory.ComputerFactory;
import com.comp.AbstractFactory.DesktopFactory;
import com.comp.AbstractFactory.LaptopFactory;
import com.computer.beans.Computers;

public class ComputerClient {
	
	
	public static void main(String[] args) {
		
		Computers desktop = ComputerFactory.createComputer(new DesktopFactory("Dell", "35k", "i5"));
		Computers laptop = ComputerFactory.createComputer(new LaptopFactory("HP", "50k", "i7"));
		
		System.out.println("Desktop ====>"+desktop);
		
		System.out.println("Laptop ====>"+laptop);
	}

}
