package org.jp.adapter.ex1;

public class EnemyObjectOrk implements EnemyObject {
	
	private String name;
	private int health;
	
	@Override
	public void attack() {
		System.out.println("Ork greift an!!!");
	}

	@Override
	public void sleep() {
		System.out.println("Du kannst ruhig bleiben, denn der Ork schläft!");
	}

	@Override
	public void sayHello() {
		System.out.println("Der Ork sagt Hallo! Vorsicht ist geboten, eventuell ist es eine Falle");
	}
	
}
