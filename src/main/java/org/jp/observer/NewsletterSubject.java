package org.jp.observer;

import java.util.ArrayList;

public abstract class NewsletterSubject {
	private ArrayList<NewsletterObserver> observers = new ArrayList<NewsletterObserver>();
	public void subscribe (NewsletterObserver observer){
		if(!observers.contains(observer)){
			observers.add(observer);
		}
	}
	public void unsubscribe (NewsletterObserver observer){
		observers.remove(observer);
	}

	public  void sendNewsletter (Newsletter newsletter){
		for (NewsletterObserver o : observers){
			o.update(newsletter);
		}
	}
}
