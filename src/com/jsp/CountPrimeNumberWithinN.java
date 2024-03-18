package com.jsp;

import java.util.Scanner;

public class CountPrimeNumberWithinN {

	public static boolean isPrime(int x) {
		for(int i=2;i<=x/2;i++) {
			if(x%i==0)
				return false;
		}
		return true;
	}
	
	public static int primeCount(int m) {
		int count=0;
		for(int i=2;i<=m;i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eneter the number:");
		int n = scanner.nextInt();
		int pc = primeCount(n);
		System.out.println("The prime number between "+n+" is:"+pc);
	}
}
