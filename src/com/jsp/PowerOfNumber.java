package com.jsp;

public class PowerOfNumber {
	public static int power(int n, int p) {
		int prod=1;
		while(p>0) {
			prod=prod*n;
			p--;
		}
		return prod;
	}
public static void main(String[] args) {
	int p1=power(7,2);
	System.out.println(p1);
}
}
