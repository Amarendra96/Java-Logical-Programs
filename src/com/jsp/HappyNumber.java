package com.jsp;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		boolean rs=isHappyNo(n);
		if (rs==true) {
			System.out.println(n+" is a happy no.");
		} else {
			System.out.println(n+" is not a happy no.");

		}
	}
	public static boolean isHappyNo(int x) {
		while (x>9) {
			int sum=0;
			do {
				int d=x%10;
				sum=sum+d*d;
				x=x/10;
			} while (x!=0);
			x=sum;
		}
		return x==1 || x==7;
	}
}
