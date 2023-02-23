package org.example.proxy.protectionProxy;

public class Main {
	public static void main(String[] args) {

		DownloadProduct javaEbook = new DownloadProduct("Java Ebook");
		Customer cus1 = new Customer("Piter");

		javaEbook.download(cus1);
		javaEbook.download(cus1);
		javaEbook.download(cus1);
		javaEbook.download(cus1);
		javaEbook.download(cus1);

		System.out.println(" - - - - - - - - - -");

		DownloadProductProxy ebookProxy = new DownloadProductProxy("Design patterns Ebook");
		ebookProxy.download(cus1);
		ebookProxy.download(cus1);
		ebookProxy.download(cus1);
		ebookProxy.download(cus1);
	}
}
