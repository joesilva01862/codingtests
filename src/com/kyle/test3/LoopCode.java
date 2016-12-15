package com.kyle.test3;

import java.util.Arrays;

public class LoopCode {
	
	// original solution copied from the coding test doc.
	private void originalSolution() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print(".");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}
	
	// This produces the exact same result as the original loop
	private void solution1() {
		for (int i = 1; i <= 5; i++) {
			char[] dots = new char[5-i];
			Arrays.fill(dots, '.');
			char[] numbers = new char[i];
			Arrays.fill(numbers, (char)('0'+i));
			System.out.println(new String(dots) + new String(numbers));
		}
	}

	// This produces the same result for the nth number maxNumber
	private void solution2(int maxNumber) {
		for (int i = 1; i <= maxNumber; i++) {
			char[] dots = new char[maxNumber-i];
			Arrays.fill(dots, '.');
			char[] numbers = new char[i];
			Arrays.fill(numbers, (char)('0'+i));
			System.out.println(new String(dots) + new String(numbers));
		}
	}
	
	// Note:
	// Not sure if the coding test is expected to produce results for a number 
	// beyond a single digit precision; that is possible but the solution would
	// be much more involved. Here's how I'd do it: given a nth number, i'd figure out
	// how many digits is its precision; then proceed to create a number of dots
	// corresponding to that precision; then write the number starting from 1 with leading 0s.
	// For example:
	// For n being 10, the sequence would look like this:
	// ..................01
	// ................0202
	// ..............030303
	// ............04040404
	// ...
	// 10101010101010101010
	
	public static void main(String[] args) {
		LoopCode loop = new LoopCode();
		loop.originalSolution();
		loop.solution1();
		loop.solution2(8);
	}

}
