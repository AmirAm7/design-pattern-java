package org.jp.strategy.exOne;

/**
 * the GoldInvestment class that implements the InvestmentStrategy interface
 * and overrides the invest method
 */
public class GoldInvestment implements  InvestmentStrategy{

	@Override
	public void invest(double investmentMoney) {
		System.out.println("You have " + investmentMoney + " successfully invested in gold!");
		//algorithm...
	}
}
