package org.jp.strategy.exTwo;
import java.util.ArrayList;

/**
 * the Navigation class that will be used by the strategies
 */
public class Navigation {

	/**
	 * the list of possible routes
	 */
	private ArrayList<Route> possibleRoutes;
	/**
	 * the interface RouteStrategy that will be used to choose the strategy
	 */
	private RouteStrategy chosenStrategy;

	public Navigation(ArrayList<Route> possibleRoutes) {
		this.possibleRoutes = possibleRoutes;
	}

	/**
	 * the method that will be used to choose the strategy
	 * @param chosenStrategy
	 */
	public void chooseStrategy (RouteStrategy chosenStrategy) {
		this.chosenStrategy = chosenStrategy;
	}

	/**
	 * the method that will be used to calculate the route
	 */

	public void calculateRoute(){
		System.out.println("Calculating route...");
		chosenStrategy.calculateRoute(possibleRoutes);
		System.out.println("Done!");
	}
}
