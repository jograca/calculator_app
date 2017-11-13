package com.lmig.gfc.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.calculator.models.Calculator;
import com.lmig.gfc.calculator.models.Memory;

@Controller
public class CalculatorController {

<<<<<<< Updated upstream
	private Memory calculatorMemory = new Memory();
=======
	// Set a public variable calculateMemory
	private Memory calculatorMemory;
>>>>>>> Stashed changes

	// Constructor for Memory
	// Sets the variable calculatorMemory to be a new Memory Object
	public CalculatorController() {
		calculatorMemory = new Memory();
	}

	@RequestMapping("/")
	public ModelAndView detaultPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		return mv;
	}

<<<<<<< Updated upstream
=======
	// Setup a RequestMapping for the calculate page
	// Setup a ModelAndView which accepts 3 user inputs (firstNumber, secondNumber,
	// select)
	// Setup conditional statements to correctly call the right functions in the
	// Calculator Class
>>>>>>> Stashed changes
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
		if (select == '√') {
			Calculator calculator = new Calculator();
			calculator.squareRootValues(firstNumber);
			calculatorMemory.storeResult(calculator);
		}

		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		
		mv.addObject("calculatorMemory", calculatorMemory);
		return mv;

<<<<<<< Updated upstream
=======
		calculatorMemory.clearMemory();

		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");	
		
		return mv;
>>>>>>> Stashed changes
	}

}
