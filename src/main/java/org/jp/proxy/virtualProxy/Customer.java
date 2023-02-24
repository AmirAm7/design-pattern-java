package org.jp.proxy.virtualProxy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Customer {
	private String name;
	private String address;
	private boolean bonusCard;
	public Customer(String name, String address, boolean bonusCard) {
		this.name = name;
		this.address = address;
		this.bonusCard = bonusCard;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				", bonusCard=" + bonusCard +
				'}';
	}
}
