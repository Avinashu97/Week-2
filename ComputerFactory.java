package com.comp.AbstractFactory;

import com.computer.beans.Computers;

public class ComputerFactory {

	public static Computers createComputer(ComputerAbstractFactory obj) {
		return obj.createComputer();
	}
}
