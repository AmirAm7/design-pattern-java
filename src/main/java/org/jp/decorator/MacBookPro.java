package org.jp.decorator;

public class MacBookPro implements MacBook{
	@Override
	public String getDescription() {
		return "MacBookPro";
	}
	@Override
	public double getPrice() {
		return 1220;
	}

	public int getPower(){
		return 5;
	}

}
