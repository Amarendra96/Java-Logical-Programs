package com.jsp;

import java.util.Scanner;

public class MainDigitOrNumber {
    public static boolean isDigitOrNumber(int n) {
    	return (n<=9 && n>=-9);
    }
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		boolean rs = isDigitOrNumber(n);
		if (rs==true) {
			System.out.println(n+" is a digit");
		} else {
            System.out.println(n+" is a number");
		}
	}
}
