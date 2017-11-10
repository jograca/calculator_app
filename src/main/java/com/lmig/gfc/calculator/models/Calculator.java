package com.lmig.gfc.calculator.models;

public class Calculator {

	private double result;
	
	public void addValues(double firstNumber, double secondNumber) {
		result = firstNumber + secondNumber;
	}
	
	public void subtractValues(double firstNumber, double secondNumber) {
		result = firstNumber - secondNumber;
	}
	
	public void multiplyValues(double firstNumber, double secondNumber) {
		result = firstNumber * secondNumber;
	}
	
	public void divideValues(double firstNumber, double secondNumber) {
		result = firstNumber / secondNumber;
	}
	
	public void quotientValues(double firstNumber, double secondNumber) {
		result = Math.pow(firstNumber, secondNumber);
	}

	public double getResult() {
		return result;
	}
}
