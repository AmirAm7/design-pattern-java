package org.jp.Strategy.exTwo;

import java.util.ArrayList;

public class ShortestDistance implements  RouteStrategy {
	@Override
	public void calculateRoute(ArrayList<Route> possibleRoutes) {
		Route r = possibleRoutes.stream().filter(route 
				-> route.getDistanceInMeter() == possibleRoutes.stream()
				.map(Route::getDistanceInMeter).min(Integer::compareTo).get()).findFirst().get();

		System.out.println("route with shortest distance = " + r);
	}
}
