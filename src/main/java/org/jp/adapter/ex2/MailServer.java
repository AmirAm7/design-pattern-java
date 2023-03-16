package org.jp.adapter.ex2;

public interface MailServer {
	void connectAndSendMail(String emailAddress, String content, String receiverName);
}
