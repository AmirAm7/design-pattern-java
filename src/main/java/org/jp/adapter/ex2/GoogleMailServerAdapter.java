package org.jp.adapter.ex2;

public class GoogleMailServerAdapter implements MailServer {

	private GoogleMailServer googleMailServer;

	public GoogleMailServerAdapter(GoogleMailServer googleMailServer) {
		this.googleMailServer = googleMailServer;
	}

	@Override
	public void connectAndSendMail(String emailAddress, String content, String receiverName) {
			googleMailServer.buildConnection();
			googleMailServer.sendEmail(emailAddress,content);
			System.out.println("receiver name = " + receiverName);
	}
}
