package org.jp.observer;

public class Person implements NewsletterObserver{
	private String name;
	private Newsletter currentNewsletter;
	public Person(String name) {
		this.name = name;
	}
	@Override
	public void update(Newsletter newsletter) {
		currentNewsletter = newsletter;
		System.out.println("Hello " + name + ", you have a new newsletter: " + currentNewsletter.getTopic() +
				" " + currentNewsletter.getContent());
	}
}
