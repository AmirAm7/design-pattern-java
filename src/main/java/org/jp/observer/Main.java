package org.jp.observer;

public class Main {
	public static void main(String[] args) {
		SportNewsletter sportNewsletter = new SportNewsletter(new Newsletter("WM 2023", "contents ..." ));
		Person person1 = new Person("John");
		Person person2 = new Person("Peter");
		Person person3 = new Person("Mary");

		sportNewsletter.subscribe(person1);
		sportNewsletter.subscribe(person2);
		sportNewsletter.subscribe(person3);

		sportNewsletter.setCurrentNewsletter(new Newsletter("Winter Olympics: \t", "The winner is Lion juli"));

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		sportNewsletter.unsubscribe(person3);
		sportNewsletter.setCurrentNewsletter(new Newsletter("Winter Olympics: \t", "New topic about olympic"));

	}
}
