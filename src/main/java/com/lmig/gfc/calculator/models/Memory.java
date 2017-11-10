package com.lmig.gfc.calculator.models;

import java.util.ArrayList;

public class Memory {

	private int memoryCapacity;
	
	private ArrayList<Calculator> calculationsList;
	
	public Memory(int memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
		calculationsList = new ArrayList<Calculator>();
	}
	
	public void storeResult(Calculator calculation) {
		calculationsList.add(calculation);
	}

	public int getMemoryCapacity() {
		return memoryCapacity;
	}

	public ArrayList<Calculator> getCalculationsList() {
		return calculationsList;
	}
	
}
