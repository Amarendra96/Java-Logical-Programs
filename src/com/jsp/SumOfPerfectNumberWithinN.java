package com.jsp;

import java.util.Scanner;

public class SumOfPerfectNumberWithinN {
	public static boolean isPerfect(int x) {
		int sum=0;
		for(int i=1;i<=x/2;i++) {
			if(x%i==0) {
				sum=sum+i;
			}
		}
		return sum==x;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n= scanner.nextInt();
		int sumOfPerfectNo=0;
		for(int i =1;i<=n;i++) {
			boolean rs = isPerfect(i);
			if(rs==true) {
				sumOfPerfectNo=sumOfPerfectNo+i;
			}
		}
		System.out.println("The sum of perfect no:"+sumOfPerfectNo);
	}

}
