package com.lmig.gfc.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {
	
	@RequestMapping("/")
	public String detaultPage() {
			return "calculator";
	}
		
}
