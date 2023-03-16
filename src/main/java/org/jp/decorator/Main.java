package org.jp.decorator;

/**
 * decorator pattern is used to add new functionality to an existing object
 */
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
		
		AddonI5Processor addonI5Processor1 = new AddonI5Processor(addonTouchbar);
		System.out.println("addonI5Processor1.getCountOfProcessor() = " + addonI5Processor1.getCountOfProcessor());

	}
}
