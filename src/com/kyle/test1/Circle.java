package com.kyle.test1;

/**
 * Circle is a shape for which we need to provide only a single
 * number to calculate area and perimeter.
 * 
 * @author Joe Silva
 *
 */
public class Circle implements Shape {
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * The area of a circle is calculated as PI * (radius squared).
	 */
	@Override
	public double getArea() {
		double area = Math.PI * (radius * radius);
		return ShapeUtil.round(area);
	}
	
	/**
	 * The perimeter (aka circumference) is calculated as 2 * PI * radius
	 */
	@Override
	public double getPerimeter() {
		double perimeter = 2 * Math.PI * radius;
		return ShapeUtil.round(perimeter);
	}
	

}
