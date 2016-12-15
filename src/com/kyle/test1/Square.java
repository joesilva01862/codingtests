package com.kyle.test1;

public class Square implements Shape {
	private double size;
	
	/**
	 * Area is calculated as size squared
	 */
	@Override
	public double getArea() {
		// we could use the Math.sq() function here, but the version below
		// is probably faster for high volumes calculations
		double area = size * size; 
		return ShapeUtil.round(area);
	}

	/**
	 * The perimeter is calculated as 4 * size
	 */
	@Override
	public double getPerimeter() {
		double perimeter = 4 * size;
		return ShapeUtil.round(perimeter);
	}

}
