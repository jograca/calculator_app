package com.lmig.gfc.calculator.models;

import java.util.ArrayList;

public class Memory {

<<<<<<< Updated upstream
	private ArrayList<Calculator> calculationsList = new ArrayList<Calculator>();
=======
	// Setup an array calculationsList to hold Calculator Objects
	
	private ArrayList<Calculator> calculationsList;
>>>>>>> Stashed changes

	// Constructor 
	public Memory() {
		calculationsList = new ArrayList<Calculator>();
	}

	public void storeResult(Calculator calculation) {
		calculationsList.add(0, calculation);
	}

	public ArrayList<Calculator> getCalculationsList() {
		return calculationsList;
	}

	public void clearMemory(Calculator calculation) {
		calculationsList.clear();
	}

}
