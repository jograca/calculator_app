package com.lmig.gfc.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.calculator.models.Calculator;
import com.lmig.gfc.calculator.models.Memory;

@Controller
public class CalculatorController {

	private Memory calculatorMemory = new Memory();

	// Constructor
	public CalculatorController() {
		calculatorMemory = new Memory();
	}

	@RequestMapping("/")
	public String detaultPage() {
		return "calculator";
	} 
	
	@RequestMapping("/calculate")
	public ModelAndView calculate(double firstNumber, double secondNumber, char select) {

		if (select == '+') {
			Calculator calculator = new Calculator();
			calculator.addValues(firstNumber, secondNumber);
			calculatorMemory.storeResult(calculator);
		}
		if (select == '-') {
			Calculator calculator = new Calculator();
			calculator.subtractValues(firstNumber, secondNumber);
			calculatorMemory.storeResult(calculator);
		}
		if (select == '*') {
			Calculator calculator = new Calculator();
			calculator.multiplyValues(firstNumber, secondNumber);
			calculatorMemory.storeResult(calculator);
		}
		if (select == '/') {
			Calculator calculator = new Calculator();
			calculator.divideValues(firstNumber, secondNumber);
			calculatorMemory.storeResult(calculator);
		}
		if (select == '^') {
			Calculator calculator = new Calculator();
			calculator.quotientValues(firstNumber, secondNumber);
			calculatorMemory.storeResult(calculator);
		}

		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");

		mv.addObject("calculatorMemory", calculatorMemory);

		return mv;

	}

	@RequestMapping(value = "/oneargops")
	public ModelAndView oneArgumentCalculate(double firstNumber, String select) {

		if (select.equals("SIN")) {
			Calculator calculator = new Calculator();
			calculator.sinValues(firstNumber);
			calculatorMemory.storeResult(calculator);
		}
		if (select.equals("COS")) {
			Calculator calculator = new Calculator();
			calculator.sinValues(firstNumber);
			calculatorMemory.storeResult(calculator);
		}
		if (select.equals("TAN")) {
			Calculator calculator = new Calculator();
			calculator.sinValues(firstNumber);
			calculatorMemory.storeResult(calculator);
		}

		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		
		mv.addObject("calculatorMemory", calculatorMemory);

		return mv;
	}

}
