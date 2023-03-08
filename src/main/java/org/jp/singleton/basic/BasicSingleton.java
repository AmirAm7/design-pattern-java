package org.jp.singleton.basic;

/**
 * Singleton is a class that can only be instantiated once
 */
public class BasicSingleton {

	/**
	 * we need a field of our object (final and static
	 */
	private static final BasicSingleton instance = new BasicSingleton();

	/**
	 * constructor must be private
	 */
	private BasicSingleton() {
		System.out.println("The Basic Singleton object has been created");
	}

	/**
	 * Since our constructor is private, we need to create a getter to allow object to be accessed from the outside
	 */
	public static BasicSingleton getInstance(){
		return instance;
	}
}
