package com.jsp;

import java.util.Scanner;

public class BiggestDigitOfANumber {


	public static int getBiggestDigit(int x) {
		int big=-9;
		while (x!=0) {
			int d= x%10;
			if (d>big) {
				big=d;
			}
			x=x/10;
		}
		return big;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int nextInt = scanner.nextInt();
		int biggestDigit = getBiggestDigit(nextInt);
		System.out.println("The biggest digit of the number is:"+biggestDigit);
	}

}
