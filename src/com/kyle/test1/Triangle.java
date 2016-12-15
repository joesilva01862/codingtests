package com.kyle.test1;

/**
 * Concrete implementation of the Shape interface for a Triangle.
 * 
 * @author Joe
 *
 */
public class Triangle implements Shape {
	private double side1;
	private double side2;
	private double side3;
	
	public void setSides(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/**
	 * I'm using Heron's formula to calculate the area, where:
	 * Area = sq root of s.(s-a) . (s-b) . (s-c)
	 * s = half the sum of all sides.
	 * a, b and c are the sides of the triangle
	 */
	@Override
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return ShapeUtil.round(area);	
    }
	
	/**
	 * Perimeter is calculated as side1 + side2 + side3.
	 */
	@Override
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return ShapeUtil.round(perimeter);
	}

}
