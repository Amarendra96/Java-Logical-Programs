package com.jsp;

public class NeonNumberWithin100 {

	public static boolean isNeonNo(int num) {
		int n= num*num;
		int sum=0;
		do {
			int d= n%10;
			sum=sum+d;
			n=n/10;
		} while (n!=0);
		return num==sum;
	}
	public static void main(String[] args) {
		System.out.println("The neon number within 100 are:");
		for(int n=1;n<=100;n++) {
			boolean rs = isNeonNo(n);
			if(rs==true) {
				System.out.println(n+" ");
			}

		}
	}
}

