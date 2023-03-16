package org.jp.adapter.ex1;

import org.jp.adapter.ex1.EnemyObject;

public class WizardAdapter implements EnemyObject {

	private Wizard wizard;
	
	public WizardAdapter(Wizard wizard) {
		this.wizard = wizard;
	}
	
	@Override
	public void attack() {
		wizard.attackEnemy();
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}
	
}
