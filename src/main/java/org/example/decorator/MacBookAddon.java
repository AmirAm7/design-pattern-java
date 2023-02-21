package org.example.decorator;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class MacBookAddon implements MacBook{
	private MacBook macBook;

	public MacBookAddon(MacBook macBook) {
		this.macBook = macBook;
	}
}
