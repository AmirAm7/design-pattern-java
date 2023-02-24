package org.jp.proxy.virtualProxy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Company{

	private String name;
	private String address;
	private CustomerList listOfCustomers;

	public Company(String name, String address, CustomerList listOfCustomers) {
		this.name = name;
		this.address = address;
		this.listOfCustomers = listOfCustomers;
	}
}
