package com.lmig.gfc.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.calculator.models.Calculator;

@Controller
public class CalculatorController {
	
	private Calculator calculator;
	private double result;
	
	// Constructor
	public CalculatorController() {
		calculator = new Calculator();
	}
	
	@RequestMapping("/")
	public String detaultPage() {
			return "calculator";
	} 
	
	@RequestMapping("/calculate")
	public ModelAndView calculate(double firstNumber, double secondNumber, String select) {
		
		if (select.equals("+")) {
			result = calculator.addValues(firstNumber, secondNumber);
		}
		if (select.equals("-")) {
			result = calculator.subtractValues(firstNumber, secondNumber);
		}
		if (select.equals("*")) {
			result = calculator.multiplyValues(firstNumber, secondNumber);
		}
		if (select.equals("/")) {
			result = calculator.divideValues(firstNumber, secondNumber);
		}
		if (select.equals("^")) {
			result = calculator.quotientValues(firstNumber, secondNumber);
		}
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		mv.addObject("firstNumber", firstNumber);
		mv.addObject("secondNumber", secondNumber);
		mv.addObject("operand", select);
		
		mv.addObject("calculator", calculator);
		
		mv.addObject("value", result);
		return mv;
		
	} 
}
