package org.jp.singleton.lazy;

import org.jp.singleton.basic.BasicSingleton;

public class Demo {
	public static void main(String[] args) {
		org.jp.singleton.basic.BasicSingleton object = org.jp.singleton.basic.BasicSingleton.getInstance();
		org.jp.singleton.basic.BasicSingleton object1 = BasicSingleton.getInstance(); // will not create
	}
}
