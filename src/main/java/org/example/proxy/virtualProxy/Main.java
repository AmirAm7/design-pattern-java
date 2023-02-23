package org.example.proxy.virtualProxy;

import java.util.List;

public class Main {
	public static void main(String[] args) {

		CustomerList list1 = new CustomerListProxyImpl();
		Company company1 = new Company("BMW", "Straßburger Str., Münschen ", list1 );

		System.out.println("company1.getName() = " + company1.getName());
		list1 = company1.getListOfCustomers();
		List<Customer> cusList = list1.getCustomerList();
		System.out.println("- - - - - - - - - - - ");

		for (Customer customer: cusList
			 ) {
			System.out.println("customer = " + customer);
		}
	}
}
