package com.lmig.gfc.calculator.models;

public class Calculator {

	private double firstNumber;
	private double secondNumber;
	private double result;
	private char operation;
	private String oneArgOp;

	// Two number methods
	
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

	// Single number methods
	
	public void sinValues(double firstNumber) {
		this.firstNumber = firstNumber;
		oneArgOp = "SIN";
		result = Math.sin(firstNumber);
	}
	
	public void cosValues(double firstNumber) {
		this.firstNumber = firstNumber;
		oneArgOp = "COS";
		result = Math.cos(firstNumber);
	}

	public void tanValues(double firstNumber) {
		this.firstNumber = firstNumber;
		oneArgOp = "TAN";
		result = Math.tan(firstNumber);
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

	public String getOneArgOp() {
		return oneArgOp;
	}

	
}
