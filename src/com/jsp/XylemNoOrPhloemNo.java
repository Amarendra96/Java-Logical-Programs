package com.jsp;

import java.util.Scanner;

public class XylemNoOrPhloemNo {

	public static String checkXylemPhloem(int n) {
		int edsum=0,mdsum=0,temp=n;
		do {
			int d=n%10;
			if (temp==n || d==n) {
				edsum=edsum+d;
			} else {
				mdsum=mdsum+d;
			}
			n=n/10;
		} while (n!=0);
		if (edsum==mdsum) {
			return "Xylem Number";
		} else {

			return "Phloem Number" ;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		String st = checkXylemPhloem(n);
		System.out.println(n+ " is a "+st);
	}
}
