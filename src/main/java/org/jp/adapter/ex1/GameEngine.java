package org.jp.adapter.ex1;

public class GameEngine {

	public static void main(String[] args) {
		EnemyObject ork1 = new EnemyObjectOrk();
		ork1.attack();
		ork1.sayHello();
		
		//EnemyObject wizard1 = new Wizard(); //Wizard hat nicht das EnemyObject Interface implementiert..
		
		//Lösung
		EnemyObject wizardAdapter = new WizardAdapter(new Wizard());
		
		wizardAdapter.attack();
	}

}
