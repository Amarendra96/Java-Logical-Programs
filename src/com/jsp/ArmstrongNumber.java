package com.jsp;

import java.util.Scanner;

public class ArmstrongNumber {
	public static int digitCount(int m) {
		int count=0;
		while (m!=0) {
            count++;
			m=m/10;
		}
		return count;
	}
	public static int power(int n,int p) {
		int product=1;
		while (p>0 ) {
			product=product*n;
			p--;
		}
		return product;
	}
	public static boolean isArmstrong(int x) {
		int sum=0;
		int temp=x;
		int dc= digitCount(x);
		do {
			
			int d= x%10;
			sum=sum+power(d,dc);
			x=x/10;
		} while (x!=0);
		if (temp==sum) {
			return true;
		} else {
             return false;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int nextInt = scanner.nextInt();
		boolean armstrong = isArmstrong(nextInt);
		if (armstrong==true) {
			System.out.println(nextInt+" is  an Aramstrong number. ");
		} else {
			System.out.println(nextInt+"  is not an Aramstrong number. ");

		}
	}
}
