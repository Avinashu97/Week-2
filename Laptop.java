package com.computer.beans;

public class Laptop implements Computers {
	private String brand;
	private String price;
	private String processor;
	
	public Laptop(String brand, String price, String processor) {
		super();
		this.brand = brand;
		this.price = price;
		this.processor = processor;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return this.brand;
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String getProcessor() {
		// TODO Auto-generated method stub
		return this.processor;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", processor=" + processor + "]";
	}

}
