package org.jp.strategy.exOne;

public class GoldInvestment implements  InvestmentStrategy{

	@Override
	public void invest(double investmentMoney) {
		System.out.println("You have " + investmentMoney + " successfully invested in gold!");
		//algorithm...
	}
}
