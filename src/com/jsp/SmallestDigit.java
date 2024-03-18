package com.jsp;

import java.util.Scanner;

public class SmallestDigit {

	public static int getSmallestDigit(int x) {
		if (x==0 ) {
			return 0;
		}
		int smallest=9;
		while (x!=0) {
			int d= x%10;
			if (d<smallest) {
				smallest=d;
			}
			x=x/10;
		}
		return smallest;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		int smallestDigit = getSmallestDigit(n);
		System.out.println("The smallest digit of the number is: "+smallestDigit);
	}
}
