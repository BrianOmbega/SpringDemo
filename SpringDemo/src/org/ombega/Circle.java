package org.ombega;

public class Circle implements Shape{
	private Point center;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("The center point is:("+ center.getX() + "," + center.getY() + ")");
		
	}
	
}
