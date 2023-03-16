package org.jp.decorator;
import lombok.Getter;
import lombok.Setter;

/**
 * MacBookAddon abstract class
 */
@Setter
@Getter
public abstract class MacBookAddon implements MacBook{
	private MacBook macBook;
	public MacBookAddon(MacBook macBook) {
		this.macBook = macBook;
	}
}
