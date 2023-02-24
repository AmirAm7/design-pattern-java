package org.jp.proxy.virtualProxy;

import java.util.ArrayList;
import java.util.List;


/**
 * RealSubject
 */
public class CustomerListImpl implements CustomerList{
	@Override
	public List<Customer> getCustomerList() {
		List<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer("John", "123 Main Street", true));
		customerList.add(new Customer("Jane", "456 Main Street", false));
		customerList.add(new Customer("Joe", "789 Main Street", true));
		System.out.println( "CustomerListImpl: Loading customer list from database");
		return customerList;
	}
}
