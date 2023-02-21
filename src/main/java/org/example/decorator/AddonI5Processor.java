package org.example.decorator;

public class AddonI5Processor extends AddonTouchbar{
	public AddonI5Processor(MacBook macBook) {
		super(macBook);
	}

	@Override
	public String getDescription() {
		return " and with 5 processor";
	}

	@Override
	public double getPrice() {
		return getMacBook().getPrice() + 500;
	}

	public int getCountOfProcessor(){
		return 5;
	}
}
