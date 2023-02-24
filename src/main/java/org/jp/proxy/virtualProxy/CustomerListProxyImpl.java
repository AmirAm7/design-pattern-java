package org.jp.proxy.virtualProxy;

import java.util.List;

public class CustomerListProxyImpl implements  CustomerList{

	private CustomerList customerList;

	@Override
	public List<Customer> getCustomerList() {
		if(customerList == null){
			System.out.println("CustomerListProxyImpl: Customer list is not loaded, loading now");
			customerList = new CustomerListImpl();
		}
		return customerList.getCustomerList();
	}
}
