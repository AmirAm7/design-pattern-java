package org.jp.Strategy.exOne;

public class Main {

	public static void main(String[] args) {
		Investment investment1 = new Investment(250);
		investment1.setTalkedToBankEmployee();
		investment1.setChosenStrategy(new GoldInvestment());
		investment1.makeInvestment();
	}
}
