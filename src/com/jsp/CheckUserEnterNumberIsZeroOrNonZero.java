package com.jsp;

import java.util.Scanner;

public class CheckUserEnterNumberIsZeroOrNonZero {


	public static boolean checkZero(int n) {
		return n==0;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		boolean rs = checkZero(n);
		if (rs==true) {
			System.out.println("User enter number "+n+" is zero.");
		} else {
			System.out.println("User enter number "+n+" is non zero.");
		}

	}

}
