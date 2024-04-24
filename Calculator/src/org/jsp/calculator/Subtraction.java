package org.jsp.calculator;

public class Subtraction {

	public static long subtraction(long n1, long n2) {
		long result = n1 - n2;
		System.err.println("output is : " + n1 + " - " + n2 + " = " + result);
		System.out.println("--------------");

		return result;
	}

	public static double subtraction(double n1, double n2) {
		double result = n1 - n2;
		System.err.println("output is : " + n1 + " - " + n2 + " = " + result);
		System.out.println("--------------");

		return result;
	}

	public static long subtraction(long n1, double n2) {
		long result = (long) (n1 - n2);
		System.err.println("output is : " + n1 + " - " + n2 + " = " + result);
		System.out.println("--------------");
		return result;

	}

	public static double subtraction(double n1, long n2) {
		double result = n1 - n2;
		System.err.println("output is : " + n1 + " - " + n2 + " = " + result);
		System.out.println("--------------");
		return result;
	}

}
