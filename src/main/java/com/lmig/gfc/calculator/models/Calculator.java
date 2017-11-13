package com.lmig.gfc.calculator.models;

public class Calculator {

	// Setup private variables
	private double firstNumber;
	private double secondNumber;
	private double result;
	private char operation;

	// Create 5 functions to perform correct calculations	
	
	public void addValues(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		operation = '+';
		result = firstNumber + secondNumber;
	}

	public void subtractValues(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		operation = '-';
		result = firstNumber - secondNumber;
	}

	public void multiplyValues(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		operation = '*';
		result = firstNumber * secondNumber;
	}

	public void divideValues(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		operation = '/';
		result = firstNumber / secondNumber;
	}

	public void quotientValues(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		operation = '^';
		result = Math.pow(firstNumber, secondNumber);
	}
	
	public double getResult() {
		return result;
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public char getOperation() {
		return operation;
	}

}
