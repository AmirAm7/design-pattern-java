package org.jp.strategy.exTwo;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Route {
	private String name;
	private int timeInMinute;
	private int distanceInMeter;

	public Route(String name, int timeInMinute, int distanceInMeter) {
		this.name = name;
		this.timeInMinute = timeInMinute;
		this.distanceInMeter = distanceInMeter;
	}

	@Override
	public String toString() {
		return "Route{" +
				"name='" + name + '\'' +
				", timeInMinute=" + timeInMinute +
				", distanceInMeter=" + distanceInMeter +
				'}';
	}
}
