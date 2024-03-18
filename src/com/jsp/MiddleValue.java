package com.jsp;

import java.util.Scanner;

public class MiddleValue {
	public static int findMiddleValue(int a,int b,int c) {
		int big=(a>b && a>c)?a:(b>c)?b:c;
		int small=(a<b&& a<c)?a:(b<c)?b:c;
		int mid=(a+b+c)-(big+small);
		return mid;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the a value:");
		int a = scanner.nextInt();
		System.out.println("Enter the b value:");
		int b = scanner.nextInt();
		System.out.println("Enter the c value:");
		int c = scanner.nextInt();
		int mid= findMiddleValue(a, b, c);
		System.out.println("The middle value from these 3 integervalue is: "+mid);
	}

}
