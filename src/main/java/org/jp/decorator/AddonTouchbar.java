package org.jp.decorator;

public class AddonTouchbar extends MacBookAddon{
	public AddonTouchbar(MacBook macBook) {
		super(macBook);
	}

	@Override
	public String getDescription() {
		return getMacBook().getDescription() + " with Touchbar";
	}

	@Override
	public double getPrice() {
		return getMacBook().getPrice() + 200;
	}
}
