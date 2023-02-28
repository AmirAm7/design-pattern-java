package org.jp.observer;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Newsletter {

	private String topic;
	private String content;

	public Newsletter(String topic, String content) {
		this.topic = topic;
		this.content = content;
	}
}
