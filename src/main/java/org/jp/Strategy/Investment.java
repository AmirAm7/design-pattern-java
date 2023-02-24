package org.jp.Strategy;

public class Investment {
	private double investMoney;
	private boolean talkedToBankEmployee = false;
	private InvestmentStrategy chosenStrategy;

	public Investment(double investMoney) {
		this.investMoney = investMoney;
	}
	public void setTalkedToBankEmployee(){
		System.out.println("The consultation went great!");
		talkedToBankEmployee = true;
	}

	public void setChosenStrategy(InvestmentStrategy strategy){
		this.chosenStrategy = strategy;
		System.out.println("The strategy is decided!");
	}

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
