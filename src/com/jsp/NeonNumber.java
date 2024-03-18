package com.jsp;

import java.util.Scanner;

public class NeonNumber {

	public static boolean isNeonNumber(int num) {
		int n= num*num;
		int sum=0;
		do {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		} while (n!=0);
		return num==sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		boolean rs = isNeonNumber(n);
		if (rs==true) {
			System.out.println(n+" is neon number.");
		} else {
			System.out.println(n+" is  not neon number.");

		}
	}

}
