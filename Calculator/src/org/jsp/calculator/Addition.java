package org.jsp.calculator;

public class Addition {
	
	
	public static long add(long n1, long n2) {
		long sum;
		System.err.println("Output is " + n1 + " + "+ n2 + " = " + (sum = n1 + n2) );
		System.out.println("-------------------------------");
		return sum;
	}

	public static double add(double n1, double n2) {
		double sum = 0;
		System.err.println("Output is " + n1 + " + "+ n2 + " = " + (sum = n1 + n2) );
		System.out.println("-------------------------------");
		return sum;
	}
	
	public static double add(long n1, double n2) {
		double sum = 0;
		System.err.println("Output is " + n1 + " + "+ n2 + " = " + (sum = n1 + n2) );
		System.out.println("-------------------------------");
		return sum;
	}

	public static double add(double n1, long n2) {
		double sum = 0;
		System.err.println("Output is " + n1 + " + "+ n2 + " = " + (sum = n1 + n2) );
		System.out.println("-------------------------------");
		return sum;
	}

	
	
}
