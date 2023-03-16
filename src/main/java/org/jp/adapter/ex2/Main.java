package org.jp.adapter.ex2;

public class Main {
	public static void main(String[] args) {
		GoogleMailServer googleMailServer = new GoogleMailServer();
		MailServer adapterMAilServer = new GoogleMailServerAdapter(googleMailServer);
		adapterMAilServer.connectAndSendMail("amir@yahooo.com", "Hello", "Jan");
	}
}
