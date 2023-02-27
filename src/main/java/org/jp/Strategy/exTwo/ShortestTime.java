package org.jp.Strategy.exTwo;

import java.util.ArrayList;

public class ShortestTime implements  RouteStrategy {
	@Override
	public void calculateRoute(ArrayList<Route> possibleRoutes) {
		Route route = possibleRoutes.stream().filter(r -> r.getTimeInMinute() == possibleRoutes.stream().map(Route::getTimeInMinute).min(Integer::compareTo).get()).findFirst().get();
		System.out.println("route with shortest time = " + route);
	}
}
