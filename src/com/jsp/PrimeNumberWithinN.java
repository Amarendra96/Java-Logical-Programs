package com.jsp;

import java.util.Scanner;

public class PrimeNumberWithinN {
	public static boolean isPrime(int x) {
		for(int i=2;i<=x/2;i++) {
			if(x%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = scanner.nextInt();
		
		for(int i=2;i<=n;i++) {
			boolean rs = isPrime(i);
			if(rs==true) {
				System.out.println(i+" ");
			}
		}
	}

}
