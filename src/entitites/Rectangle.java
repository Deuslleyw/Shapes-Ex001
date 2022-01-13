package entitites;

import entitites.enums.Color;

public class Rectangle extends shape {
	
	private double width;
	private double height;
	
	public Rectangle() {
		super();
	}
	
	
	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

}
