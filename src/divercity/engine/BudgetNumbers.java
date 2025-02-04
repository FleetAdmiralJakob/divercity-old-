// This file is part of DiverCity
// DiverCity is based on MicropolisJ
// Copyright (C) 2013 Jason Long
// Portions Copyright (C) 1989-2007 Electronic Arts Inc.
//
// MicropolisJ is free software; you can redistribute it and/or modify
// it under the terms of the GNU GPLv3, with additional terms.
// See the README file, included in this distribution, for details.

package divercity.engine;

/**
 * The information generated by the generateBudget function.
 * @see divercity.engine.DiverCity#generateBudget
 */
public class BudgetNumbers
{
	public int taxRate;
	public int taxIncome;
	public int operatingExpenses;
	public int previousBalance;
	public int newBalance;

	public int roadRequest;
	public int roadFunded;
	public double roadPercent;

	public int fireRequest;
	public int fireFunded;
	public double firePercent;

	public int policeRequest;
	public int policeFunded;
	public double policePercent;
	
	public int schoolRequest;
	public int schoolFunded;
	public double schoolPercent;
	
	public int cultureRequest;
	public int cultureFunded;
	public double culturePercent;
}
