package org.jp.proxy.protectionProxy;

public class DownloadProduct implements  Downloadable{

	private String productName;

	public DownloadProduct(String productName) {
		this.productName = productName;
	}

	@Override
	public void download(Customer customer) {
		System.out.println(customer.getName() +  " successfully downloaded the product" + productName);
	}
}
