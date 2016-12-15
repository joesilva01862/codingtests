package com.kyle.test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestShapes {

	/**
	 * Note: Not sure how detailed the coding test will have to be, but in a
	 * professional setting, I'd be concerned to code and test for boundaries as well.
	 * 
	 * For example, I'd have to check whether the values for the shape are valid.
	 * To solve that, I'd create a specific exception and throw it from the setSides() method
	 * of each of the classes. 
	 */
	@Test
	public void testTriangle() {
		Triangle triangle = new Triangle();
		
		// test for whole numbers
		triangle.setSides(3, 4, 5);
		assertTrue("Triangle area calculation has failed.", triangle.getArea() == 6  );
		
		
		// Make sure that calculation is also correct for fractional numbers
		// Remember: I have set the precision at 6 digits after decimal point (See the ShapeUtil class);
		// Otherwise, its difficult to test because we could get very small differences in different machines.
		triangle.setSides(4, 5, 6.7);
		assertTrue("Triangle area calculation for fractionated sides failed", triangle.getArea() == 9.952600);
		
		triangle.setSides(3.5, 4.3, 5.7);
		assertTrue("Triangle perimeter calculation has failed.", triangle.getPerimeter() == 13.5  );
	}

	@Test
	public void testRectangle() {
		Rectangle rect = new Rectangle();
		
		// test for whole numbers
		rect.setSides(3, 4);
		assertTrue("Rectangle area calculation has failed.", rect.getArea() == 12  );
		rect.setSides(10,  12);
		assertTrue("Rectangle perimeter calculation has failed.", rect.getPerimeter() == 44  );
		
		
		// test an area with fractional numbers
		rect.setSides(4.5, 5.5);
		assertTrue("Rectangle area calculation for fractionated sides failed", rect.getArea() == 24.75);
		rect.setSides(4.55, 5.61);
		assertTrue("Rectangle perimeter calculation has failed.", rect.getPerimeter() == 20.32  );
	}

	
	@Test
	public void testCircle() {
		Circle circle = new Circle();
		
		// test with whole numbers
		circle.setRadius(5);
		assertTrue("Circle area calculation has failed.", circle.getArea() == 78.539816  );
		assertTrue("Circle perimeter calculation has failed.", circle.getPerimeter() == 31.415927  );
		
		// test with fractional numbers
		circle.setRadius(1.2);
		assertTrue("Circle area calculation for fractionated radius failed", circle.getArea() == 4.523893);
		assertTrue("Circle perimeter calculation for fractionated radius failed.", circle.getPerimeter() == 7.539822  );
	}

	
	
}
