package org.jsp.calculator;

import java.util.Scanner;

public class Display {

	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Two Numbers: ");
		System.out.println("Enter Number 1 ");
		double num1 = s.nextDouble();
		System.out.println("Enetr Number 2");
		double num2 = s.nextDouble();

		System.out.println("Choose addition method:");
		
		 
		while(true) {
			displayMenu();
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				Addition.add((long) num1, (long) num2);
				break;
			case 2:
				Addition.add((double) num1, (double) num2);
				break;
			case 3:
				Addition.add((double) num1, (long) num2);
				break;
			case 4:
				Addition.add((long) num1, (double) num2);
				break;

			case 5:
				Subtraction.subtraction((long) num1, (long) num2);
				break;
			case 6:
				Subtraction.subtraction((double) num1, (double) num2);
				break;
			case 7:
				Subtraction.subtraction((double) num1, (long) num2);
				break;
			case 8:
				Subtraction.subtraction((long) num1, (double) num2);
				break;
			case 9:
				Multiplication.multiplication((long) num1, (long) num2);
				break;
			case 10:
				Multiplication.multiplication((double) num1, (double) num2);
				break;
			case 11:
				Multiplication.multiplication((double) num1, (long) num2);
				break;
			case 12:
				Multiplication.multiplication((long) num1, (double) num2);
				break;

			case 13:
				Devide.devide((long) num1, (long) num2);
				break;
			case 14:
				Devide.devide((double) num1, (double) num2);
				break;
			case 15:
				Devide.devide((double) num1, (long) num2);
				break;
			case 16:
				Devide.devide((long) num1, (double) num2);
				break;
			
			default:
				System.out.println("invalid choice");
				break;
			}
			
		}
		

		
	}
	
	public static void displayMenu() {
		System.out.println("Menu Of Calculation ");
		System.out.println("1. long + long");
		System.out.println("2. double + double");
		System.out.println("3. double + long");
		System.out.println("4. long + double");
		System.out.println("--------------");
		System.out.println("SUBTRACTION");
		System.out.println("5. long - long");
		System.out.println("6. double - double");
		System.out.println("7. double + long");
		System.out.println("8. long - double");
		System.out.println("------------------");
		System.out.println("MULTIPLICATION");
		System.out.println("9. long - long");
		System.out.println("10. double - double");
		System.out.println("11. double + long");
		System.out.println("12. long - double");
		System.out.println("--------------");
		System.out.println("DIVISION ");
		System.out.println("13. long - long");
		System.out.println("14. double - double");
		System.out.println("15. double + long");
		System.out.println("16. long - double");
	}
	
}








