package org.jp.observer;

public class SportNewsletter extends NewsletterSubject {
	private Newsletter currentNewsletter;
	public SportNewsletter(Newsletter newsletter) {
		this.currentNewsletter = newsletter;
	}
	public Newsletter getCurrentNewsletter(){
		return currentNewsletter;
	}
	public void setCurrentNewsletter(Newsletter newNewsletter){
		this.currentNewsletter = newNewsletter;
		System.out.println("Sport newsletter has been updated!");
		this.sendNewsletter(currentNewsletter);
	}
}
