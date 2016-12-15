package com.kyle.test1;

import java.math.BigDecimal;

/**
 * We need to set decimal place precision for fractional numbers.
 * I decided for the purpose of this coding test, to set it at 6 digits.
 * 
 * @author Joe Silva
 *
 */
public class ShapeUtil {
	private final static int DECIMAL_NUMBER_PRECISION = 6;
	
	public static double round(double val) {
		return BigDecimal.valueOf(val).setScale(DECIMAL_NUMBER_PRECISION, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
}
