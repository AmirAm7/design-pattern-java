package org.jp.strategy.exTwo;

import java.util.ArrayList;
/**
 * the class that will be used by the strategies
 * to calculate the shortest distance
 */
public class ShortestDistance implements  RouteStrategy {
	@Override
	public void calculateRoute(ArrayList<Route> possibleRoutes) {
		Route r = possibleRoutes.stream().filter(route 
				-> route.getDistanceInMeter() == possibleRoutes.stream()
				.map(Route::getDistanceInMeter).min(Integer::compareTo).get()).findFirst().get();

		System.out.println("route with shortest distance = " + r);
	}
}
