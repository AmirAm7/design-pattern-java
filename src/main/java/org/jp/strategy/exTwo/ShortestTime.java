package org.jp.strategy.exTwo;

import java.util.ArrayList;
/**
 * the class that will be used by the strategies
 * to calculate the shortest time
 */
public class ShortestTime implements  RouteStrategy {
	@Override
	public void calculateRoute(ArrayList<Route> possibleRoutes) {
		Route route = possibleRoutes.stream().filter(r -> r.getTimeInMinute() == possibleRoutes.stream().map(Route::getTimeInMinute).min(Integer::compareTo).get()).findFirst().get();
		System.out.println("route with shortest time = " + route);
	}
}
