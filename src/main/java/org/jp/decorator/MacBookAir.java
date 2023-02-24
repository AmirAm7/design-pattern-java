package org.jp.decorator;

public class MacBookAir implements MacBook{
	@Override
	public String getDescription() {
		return "This is a MacBookAir";
	}
	@Override
	public double getPrice() {
		return 0;
	}
}
