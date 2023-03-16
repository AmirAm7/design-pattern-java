package org.jp.strategy.exOne;
/**
 * the StockMarketInvestment class that implements the InvestmentStrategy interface
 * and overrides the invest method
 */
public class StockMarketInvestment implements InvestmentStrategy{

	@Override
	public void invest(double investmentMoney) {
		System.out.printf("You have {} successfully invested in gold!", investmentMoney);
		//algorithm...
	}
}
