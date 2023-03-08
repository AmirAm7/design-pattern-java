package org.jp.singleton.basic;

public class Demo {
	public static void main(String[] args) {
		BasicSingleton object = BasicSingleton.getInstance();
		BasicSingleton object1 = BasicSingleton.getInstance(); // will not create
	}
}
