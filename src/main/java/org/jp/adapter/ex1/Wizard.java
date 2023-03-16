package org.jp.adapter.ex1;

public class Wizard {
	private String name;
	private int health;
	
	public void attackEnemy() {
		System.out.println("Der Zauberer greift den Gegner an!!!");
	}
	
	public void goToBed() {
		System.out.println("Der Zauberer macht ein Nickerchen");
	}
	
	public void speak() {
		System.out.println("Hey, bleib stehen oder ich werde dich verzaubern!");
	}
}
