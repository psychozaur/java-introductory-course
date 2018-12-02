package com.podstaw.od.java.rybicki.marcin.simple_calc;

public class Division extends Operation {

	@Override
	public double calculate (double number1, double number2) {
		if (number2 == 0) {
			System.out.println("Don't divide by 0");
			return number1;
		}
		return number1 / number2;
	}
}
