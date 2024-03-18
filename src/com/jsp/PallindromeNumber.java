package com.jsp;

import java.util.Scanner;

public class PallindromeNumber {

	static boolean isPallindrome(int n) {
		int rev=0,temp=n;
		do {
			int d= n%10;
			rev=rev*10+d;
			n=n/10;
		}while(n!=0);
		return temp==rev;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		boolean rs = isPallindrome(n);
		if (rs==true) {
			System.out.println(n+" is pallindrome no.");
		} else {
			System.out.println(n+" is not pallindrome no.");

		}
	}

}
