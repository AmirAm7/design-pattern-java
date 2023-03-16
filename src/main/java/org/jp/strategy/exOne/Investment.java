package org.jp.strategy.exOne;
/**
 * the Investment class that will be used by the client
 * the client will first talk to a bank employee -> setTalkedToBankEmployee()
 * and it will use the strategy interface to choose a strategy -> setChosenStrategy()
 * and then it will make the investment -> makeInvestment()
 */
public class Investment {
	private final double investMoney;
	private boolean talkedToBankEmployee = false;
	/**
	 * the strategy interface reference
	 */
	private InvestmentStrategy chosenStrategy;

	public Investment(double investMoney) {
		this.investMoney = investMoney;
	}

	/**
	 * if the client talked to a bank employee
	 */
	public void setTalkedToBankEmployee(){
		System.out.println("The consultation went great!");
		talkedToBankEmployee = true;
	}

	/**
	 * the methode is used to choose a strategy
	 * @param strategy
	 */
	public void setChosenStrategy(InvestmentStrategy strategy){
		this.chosenStrategy = strategy;
		System.out.println("The strategy is decided!");
	}

	/**
	 * the method that will be used by the client
	 * to make the investment
	 */
	public  void makeInvestment (){
		int minInvestmentMoney = 200;
		if (talkedToBankEmployee && chosenStrategy != null && investMoney >= minInvestmentMoney){
			chosenStrategy.invest(investMoney);
		}
		else{
			throw  new RuntimeException("First, a strategy must be chosen or a consultation should take place ");
		}
	}
}
