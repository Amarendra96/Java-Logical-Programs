package com.jsp;

import java.util.Scanner;

public class CheckPrime {

	public static boolean checkPrime(int x) {
		int count=1;
		for(int i=1;i<=x/2;i++) {
			if(x%i==0)
				count++;
		}
		if(count==2) {
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int nextInt = scanner.nextInt();
		boolean rs=checkPrime(nextInt);
		if (rs==true) {
			System.out.println(nextInt+" is prime");
		} else {
			System.out.println(nextInt+" is not prime");

		}
	}
}
