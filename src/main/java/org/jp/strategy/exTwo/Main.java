package org.jp.strategy.exTwo;

import java.util.ArrayList;

/**
 *  Strategy Pattern is a behavioral design pattern that allows selecting an algorithm at runtime.
 */
public class Main {

	ShortestTime shortestTime;
	public static void main(String[] args) {
		Route route1 = new Route ("Route 1", 8, 450);
		Route route2 = new Route ("Route 2", 34, 2800);
		Route route3 = new Route ("Route 3", 33, 3000);
		Route route4 = new Route ("Route 3", 9, 440);
		/**
		 * the list of possible routes
		 */
		ArrayList<Route> routes = new ArrayList<>();
		routes.add(route1);
		routes.add(route2);
		routes.add(route3);
		routes.add(route4);
		/**
		 * the strategy shorts distance is used
		 */
		Navigation nv1 = new Navigation(routes);
		nv1.chooseStrategy(new ShortestDistance());
		nv1.calculateRoute();

		System.out.println(" - - - - - - - - - - - - - - - -");
		/**
		 * the strategy shorts time is used
		 */
		Navigation nv2 = new Navigation(routes);
		nv2.chooseStrategy(new ShortestTime());
		nv2.calculateRoute();
	}
}
