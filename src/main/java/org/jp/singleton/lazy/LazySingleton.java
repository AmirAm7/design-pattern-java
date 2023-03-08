package org.jp.singleton.lazy;

/**
 * LazySingleton is a singleton that is created when it is needed
 */
public class LazySingleton {

	/**
	 * We only create one attribute.
	 * We don't create the object immediately
	 */
	private static LazySingleton instance;

	/**
	 * constructor must be private
	 */
	private LazySingleton() {
		System.out.println("The Basic Singleton object has been created");
	}

	/**
	 * Since our constructor is private, we need to create a getter to allow object to be accessed from the outside
	 * object is created when it is needed
	 * we need to check if the object is null before creating it
	 */
	public static LazySingleton getInstance(){
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
