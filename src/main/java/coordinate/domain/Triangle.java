package coordinate.domain;

import java.util.ArrayList;

public class Triangle {
	private ArrayList<Point> points;

	public Triangle(ArrayList<Point> points) {
		this.points = points;
	}

	public static Triangle of(ArrayList<Point> points) {
		return new Triangle(points);
	}

	public static double getArea(ArrayList<Point> points) {
		double a = points.get(0).getDistance(points.get(1));
		double b = points.get(1).getDistance(points.get(2));
		double c = points.get(2).getDistance(points.get(0));
		double s = (a + b + c) / 2;
		return Math.sqrt(s * ((s - a) * (s - b) * (s - c)));
	}

	public boolean isTriangle() {
		if (!(points.get(0).isOneLine(points.get(1), points.get(2)))) {
			return true;
		}
		return false;
	}

}
