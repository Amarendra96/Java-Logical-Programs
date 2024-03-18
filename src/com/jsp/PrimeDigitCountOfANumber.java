package com.jsp;

import java.util.Scanner;

public class PrimeDigitCountOfANumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		int pdc=0;
		while (n!=0) {
			int d=n%10;
			if (d==2|| d==3||d==5||d==7) {
				pdc++;
			}
			n=n/10;
		}
		System.out.println(pdc+" no of prime digit present in a number.");
	}
	

}
