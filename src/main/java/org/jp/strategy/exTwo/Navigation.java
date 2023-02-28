package org.jp.strategy.exTwo;
import java.util.ArrayList;

public class Navigation {


	private ArrayList<Route> possibleRoutes;
	private RouteStrategy chosenStrategy;

	public Navigation(ArrayList<Route> possibleRoutes) {
		this.possibleRoutes = possibleRoutes;
	}

	public void chooseStrategy (RouteStrategy chosenStrategy) {
		this.chosenStrategy = chosenStrategy;
	}

	public void calculateRoute(){
		System.out.println("Calculating route...");
		chosenStrategy.calculateRoute(possibleRoutes);
		System.out.println("Done!");
	}
}
