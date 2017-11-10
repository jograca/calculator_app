package com.lmig.gfc.calculator.models;

import java.util.ArrayList;

public class Results {
	
	private int memory;
	
	private ArrayList<Calculator> calculationsList;
	
	public Results(int memory) {
		this.memory = memory;
		calculationsList = new ArrayList<Calculator>();
	}
	
	public void addResultToMemory(Calculator calculation) {
		calculationsList.add(calculation);
	}
	
}
