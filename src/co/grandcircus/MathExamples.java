package co.grandcircus;

import java.util.Scanner;
import java.math.BigDecimal;

public class MathExamples {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		double num = 5;
		double num2 = 2;
		System.out.println(num / num2);

		int num3 = 5;
		int num4 = 2;

		System.out.println(num3 / num4);

		/*
		 * implicit cast - as long as one of the values is a double, it will return some
		 * precision and be more accurate
		 */
		System.out.println(num / num4);

		/*
		 * Getting around floating number inaccuracies: 1. Rounding 2. Design functions
		 * to handle these cases 3. BigDecimal class
		 */

		System.out.println(0.1 + 0.2);

		// need to create new BigDecimal objects
		BigDecimal one = new BigDecimal(".1");
		BigDecimal two = new BigDecimal(".2");

		/*
		 * Performing arithmetic with the BigDecimals needs to be done by redefining the
		 * values and calling methods in this way. See:
		 * https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html
		 */
		one = one.add(two);

		System.out.println(one);

		one = one.multiply(two);
		System.out.println(one);

		/*
		 * There isn't an easy way to determine when to use BigDecimal (i.e., how to
		 * predict when some double will produce .30000000004, for example. Should make
		 * those decisions in consultation with project team based on the type of data
		 * being handled (e.g., in financial setting you would almost always want to use
		 * BigDecimals to avoid any inaccuracies with transactions).
		 */

		scnr.close();

	}

}
