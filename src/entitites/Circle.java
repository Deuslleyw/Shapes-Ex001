package entitites;

import entitites.enums.Color;

public class Circle extends shape {
	
	private double radius;
	
	public Circle() {
		super();
	}
	

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	
}
