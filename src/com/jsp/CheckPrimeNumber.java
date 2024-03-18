package com.jsp;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static boolean isPrime(int x) {
		for(int i=2;i<=x/2;i++) {
			if (x%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		boolean rs = isPrime(n);
		if (rs==true) {
			System.out.println(n+" is prime Number.");
		} else {
			System.out.println(n+" is not a prime Number.");

		}
	}		
}

