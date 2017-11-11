package com.lmig.gfc.calculator.models;

import java.util.ArrayList;

public class Memory {

	private ArrayList<Calculator> calculationsList = new ArrayList<Calculator>();

	public Memory() {
		calculationsList = new ArrayList<Calculator>();
	}

	public void storeResult(Calculator calculation) {
		calculationsList.add(0, calculation);
	}

	public ArrayList<Calculator> getCalculationsList() {
		return calculationsList;
	}

	public void clearMemory() {
		calculationsList.removeAll(calculationsList);
	}

}
