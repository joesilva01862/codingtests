package com.kyle.test1;

/**
 * Concrete implementation of the Shape interface for a Rectangle.
 * 
 * @author Joe Silva
 *
 */
public class Rectangle implements Shape {
	private double width;
	private double height;
	
	public void setSides(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Area is calculated as width * height
	 */
	@Override
	public double getArea() {
        return width * height;	
    }
	
	/**
	 * Perimeter is calculated as 2*(width + height).
	 */
	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

}
