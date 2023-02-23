package org.example.proxy.protectionProxy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Customer {
	private String name;

	public Customer(String name) {
		this.name = name;
	}
}
