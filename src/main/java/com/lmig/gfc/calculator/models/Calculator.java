package com.lmig.gfc.calculator.models;

public class Calculator {

	public double addValues(double firstNumber, double secondNumber) {
		return Math.round(firstNumber + secondNumber);
	}
	
	public double subtractValues(double firstNumber, double secondNumber) {
		return Math.round(firstNumber - secondNumber);
	}
	
	public double multiplyValues(double firstNumber, double secondNumber) {
		return Math.round(firstNumber * secondNumber);
	}
	
	public double divideValues(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
	}
	
	public double quotientValues(double firstNumber, double secondNumber) {
		return Math.pow(firstNumber, secondNumber);
	}
}
