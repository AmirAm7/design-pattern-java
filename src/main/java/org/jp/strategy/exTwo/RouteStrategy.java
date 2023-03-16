package org.jp.strategy.exTwo;

import java.util.ArrayList;

/**
 * the strategy interface that will be implemented by all the strategies
 */
public interface RouteStrategy {
	void calculateRoute (ArrayList<Route> possibleRoutes);
}
