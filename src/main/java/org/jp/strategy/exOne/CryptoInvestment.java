package org.jp.strategy.exOne;

public class CryptoInvestment implements  InvestmentStrategy{
	@Override
	public void invest(double investmentMoney ) {
		System.out.printf("You have {} successfully invested in gold!", investmentMoney);
		//algorithm...
	}
}
