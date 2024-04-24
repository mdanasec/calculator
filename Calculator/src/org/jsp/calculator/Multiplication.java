package org.jsp.calculator;

public class Multiplication {

	public static long multiplication(long n1, long n2) {
		long multi = n1 * n2;
		System.err.println("output is : " + n1 + " - " + n2 + " " + multi);
		System.out.println("--------------");
		return multi;
	}

	public static double multiplication(double n1, double n2) {
		double multi = n1 * n2;
		System.err.println("output is : " + n1 + " - " + n2 + " " + multi);
		System.out.println("--------------");
		return multi;
	}

	public static long multiplication(long n1, double n2) {
		long multi = (long) (n1 * n2);
		System.err.println("output is : " + n1 + " - " + n2 + " " + multi);
		System.out.println("--------------");
		return multi;
	}

	public static double multiplication(double n1, long n2) {
		double multi = n1 * n2;
		System.err.println("output is : " + n1 + " - " + n2 + " " + multi);
		System.out.println("--------------");
		return multi;
	}

}
