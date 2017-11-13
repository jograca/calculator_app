package com.lmig.gfc.calculator.models;

import java.util.ArrayList;

public class Memory {

	// Setup an array calculationsList to hold Calculator Objects
	
	private ArrayList<Calculator> calculationsList = new ArrayList<Calculator>();

	public Memory() {
		calculationsList = new ArrayList<Calculator>();
	}

	public void storeResult(Calculator calculation) {
		calculationsList.add(0, calculation);
	}
	
	public void clearMemory() {
		calculationsList.clear();
	}

}
