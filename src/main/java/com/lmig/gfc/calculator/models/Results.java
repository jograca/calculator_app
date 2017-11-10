package com.lmig.gfc.calculator.models;

import java.util.ArrayList;

public class Results {
	
	private int memory;
	
	// Methods addResultToMemory, recallResultFromMemory, clearResults
	// Attributes: 
	
	private ArrayList<Calculator> calculationsList;
	
	public Results(int memory) {
		this.setMemory(memory);
		calculationsList = new ArrayList<Calculator>();
	}
	
	public void addResultToMemory(Calculator calculation) {
		calculationsList.add(calculation);
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	
}
