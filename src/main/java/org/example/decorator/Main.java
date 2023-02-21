package org.example.decorator;

public class Main {
	public static void main(String[] args) {

		MacBookPro macBookPro = new MacBookPro();
		//MacBookAir macBookAir = new MacBookAir();
		System.out.println("macBookPro = " + macBookPro.getDescription());
		System.out.println("macBookPro = " + macBookPro.getPrice());

		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		AddonTouchbar addonTouchbar = new AddonTouchbar(macBookPro);
		System.out.println("addonTouchbar des = " + addonTouchbar.getDescription());
		System.out.println("addonTouchbar price= " + addonTouchbar.getPrice());

		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		AddonI5Processor addonI5Processor = new AddonI5Processor(addonTouchbar);
		System.out.println("addonI5Processor.getDescription(); = " + addonI5Processor.getDescription());
		System.out.println("addonI5Processor.getPrice() = " + addonI5Processor.getPrice());
	}
}
