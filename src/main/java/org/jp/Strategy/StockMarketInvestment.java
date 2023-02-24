package org.jp.Strategy;

public class StockMarketInvestment implements InvestmentStrategy{

	@Override
	public void invest(double investmentMoney) {
		System.out.printf("You have {} successfully invested in gold!", investmentMoney);
		//algorithm...
	}
}
