package com.jsp;

import java.util.Scanner;

public class StrongNumber {

	public static int fact(int n) {
		int fact=1;
		while(n>1) {
			fact=fact*n;
			n--;
		}
		return fact;
	}
	
	public static boolean checkStrong(int x) {
		int sum=0;
		int temp=x;
		while (x!=0) {
			int d=x%10;
			sum=sum+fact(d);
			x=x/10;
		}
		if (sum==temp) {
			return true;
		} else {
            return false;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = scanner.nextInt();
		boolean rs = checkStrong(n);
		if (rs==true) {
			System.out.println(n+" is Strong number");
			
		} else {
			System.out.println(n+" is not Strong number");
		}
	}
}
