package com.calculator;

import static org.junit.Assert.*;

import org.junit.Test;
import com.craft.software.Calculator;

public class CalculatorTester {
	
	Calculator c = new Calculator();

	@Test
	public void additionTest() {
		assertEquals(6,c.addition(3,3));
	}
	@Test
	public void subtractionTest() {
		assertEquals(0,c.subtraction(3,3));
	}
	@Test
	public void multiplicationTest() {
		assertEquals(9,c.multiplication(3,3));
	}
	@Test
	public void divisionTest() {
		assertEquals(1,c.division(3,3));
	}


	


}
