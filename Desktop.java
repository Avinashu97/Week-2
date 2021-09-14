package com.computer.beans;

public class Desktop implements Computers {
   
	private String brand;
	private String price;
	private String processor;
	
	public Desktop(String brand, String price, String processor) {
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
		return "Desktop [brand=" + brand + ", price=" + price + ", processor=" + processor + "]";
	}

	
}
