package com.jsp;

import java.util.Scanner;

public class PrimeNumberBetweenMandN {
	
	public static boolean isPrime(int y) {
		for(int i=2;i<y;i++) {
			if(y%i==0)
				return false;
		}
		return true;
	}
	
	public static void printPrimeRangeFromMtoN(int m, int n) {
		for(int i=m+1;i<=n;i++) {
			if(isPrime(i))
				System.out.println(i+" ");
		}
//		System.out.println(" ");
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the M value:");
	int m = scanner.nextInt();
	System.out.println("Enter the N value:");
	int n = scanner.nextInt();
	System.out.println("The prime range from "+m+" to "+n+" is :");
	printPrimeRangeFromMtoN(m, n);
	}
}

