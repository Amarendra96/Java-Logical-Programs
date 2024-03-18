package com.jsp;

import java.util.Scanner;

public class SumOfPrimeNumberWithinN {
	public static boolean isPrime(int x) {
		for(int i=2;i<=x/2;i++) {
			if(x%i==0)
				return false;
		}
		return true;
	}
	public static int sumOfPrime(int n) {
		int sum=0;
		for(int i=2;i<=n;i++) {
			if(isPrime(i))
				sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = scanner.nextInt();
		int sumOfPrime = sumOfPrime(n);
		System.out.println("The sum of Prime number within "+n+" is:"+sumOfPrime);
	}
}
