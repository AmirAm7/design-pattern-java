package org.jp.strategy.exOne;

/**
 * Strategy pattern is a behavioral design pattern that allows selecting an algorithm at runtime.
 */
public class Main {

	public static void main(String[] args) {
		Investment investment1 = new Investment(250);
		investment1.setTalkedToBankEmployee();
		investment1.setChosenStrategy(new GoldInvestment());
		investment1.makeInvestment();
	}
}
