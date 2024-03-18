package com.jsp;

import java.util.Scanner;

public class SumOfDigitInANumber {

	public static int getSumOfDigitInANumber(int x) {
		int sod=0;
		while (x!=0) {
			int d=x%10;
			sod=sod+d;
			x=x/10;
		}

		return sod;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scanner.nextInt();

		int sod = getSumOfDigitInANumber(n);
		System.out.println("The Sum Of Digit:"+sod);
	}

}
