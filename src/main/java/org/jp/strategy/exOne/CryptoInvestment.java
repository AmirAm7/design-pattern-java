package org.jp.strategy.exOne;
/**
 * the CryptoInvestment class that implements the InvestmentStrategy interface
 * and overrides the invest method
 */
public class CryptoInvestment implements  InvestmentStrategy{
	@Override
	public void invest(double investmentMoney ) {
		System.out.printf("You have {} successfully invested in gold!", investmentMoney);
		//algorithm...
	}
}
