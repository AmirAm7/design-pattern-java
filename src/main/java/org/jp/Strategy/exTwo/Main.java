package org.jp.Strategy.exTwo;

import java.util.ArrayList;

public class Main {

	ShortestTime shortestTime;
	public static void main(String[] args) {
		Route route1 = new Route ("Route 1", 8, 450);
		Route route2 = new Route ("Route 2", 34, 2800);
		Route route3 = new Route ("Route 3", 33, 3000);
		Route route4 = new Route ("Route 3", 9, 440);

		ArrayList<Route> routes = new ArrayList<>();
		routes.add(route1);
		routes.add(route2);
		routes.add(route3);
		routes.add(route4);

		Navigation nv1 = new Navigation(routes);
		nv1.chooseStrategy(new ShortestDistance());
		nv1.calculateRoute();

		System.out.println(" - - - - - - - - - - - - - - - -");

		Navigation nv2 = new Navigation(routes);
		nv2.chooseStrategy(new ShortestTime());
		nv2.calculateRoute();
	}
}
