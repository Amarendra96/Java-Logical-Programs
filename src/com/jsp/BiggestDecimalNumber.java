package com.jsp;

import java.util.Scanner;

public class BiggestDecimalNumber {
	public static double getSmallest(double a,double b,double c) {

		double smallest=a;
		if(b<smallest) {
			smallest=b;
		}
		else if(c<smallest) {
			smallest=c;
		}
		return smallest;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 'a' value:");
		double a = scanner.nextDouble();
		System.out.println("Enter the 'b' value:");
		double b = scanner.nextDouble();
		System.out.println("Enter the 'c' value:");
		double c = scanner.nextDouble();
		double smallest = getSmallest(a, b, c);
		System.out.println("The smallest decimal number is: "+smallest);
		scanner.close();
	}
}
