package com.craft.software;

public class Calculator {
	
	
	public int addition(int a, int b) {
		return a+b;
	}
	public int subtraction(int a, int b) {
		return a-b;
	}
	public int multiplication(int a, int b) {
		return a*b;
	}
	public int division(int a, int b) {
		return a/b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c= new Calculator();
		System.out.println("Addition: " +c.addition(23,34));
		System.out.println("Subtraction: " +c.subtraction(23,34));
		System.out.println("Multiplication: " +c.multiplication(23,34));
		System.out.println("Division: " +c.division(46,23));

	}

}
