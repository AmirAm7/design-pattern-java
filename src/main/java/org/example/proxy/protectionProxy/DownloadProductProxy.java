package org.example.proxy.protectionProxy;

public class DownloadProductProxy implements  Downloadable{
	private  final int NUM_DOWNLOAD_ALLOWED = 3;
	private int numberDownloads = 0;
	private DownloadProduct downloadProduct;

	public DownloadProductProxy(String name) {
		this.downloadProduct = new DownloadProduct(name);
	}

	@Override
	public void download(Customer customer) {
			if(numberDownloads < NUM_DOWNLOAD_ALLOWED){
				numberDownloads++;
				downloadProduct.download(customer);
			}
			else {
				System.out.printf(customer.getName() + " has already downloaded the product 3 times and can no longer download it"  + downloadProduct);
			}
	}
}
