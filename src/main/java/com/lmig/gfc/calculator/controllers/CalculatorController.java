package com.lmig.gfc.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.calculator.models.Calculator;
import com.lmig.gfc.calculator.models.Memory;

// Setup a Controller
@Controller
public class CalculatorController {

	// Instantiate the Memory Class
	// Save to the variable "calculateMemory"
	private Memory calculatorMemory = new Memory();

	public CalculatorController() {
		calculatorMemory = new Memory();
	}

	// Setup a RequestMapping for the home page
	@RequestMapping("/")
	public ModelAndView defaultPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		return mv;
	}

	// Setup a RequestMapping for the calculate page
	// Setup a ModelAndView which accepts 3 user inputs (firstNumber, secondNumber,
	// select)
	// Setup conditional statements to correctly call the right functions in the
	// Calculator Class
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

	// Setup a RequestMapping for "clear"
	// Setup a Model and View to call the clearResultsView method
	@RequestMapping("/clear")
	public ModelAndView clearResultsView() {

		calculatorMemory.clearMemory();

		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");

		return mv;
	}

}
