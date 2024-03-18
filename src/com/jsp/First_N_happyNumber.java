package com.jsp;

import java.util.Scanner;

public class First_N_happyNumber {
	public static boolean isHappyNo(int x) {
		while (x>9) {
			int sum=0;
			do {
				int d=x%10;
				sum=sum+d*d;
				x=x/10;
			}while(x!=0);
			x=sum;
		}
		return x==1|| x==7;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = scanner.nextInt();
		for(int m=1;n>0;m++) {
			boolean rs = isHappyNo(m);
			if(rs==true)
			{
				System.out.println(m+" ");
				n--;
			}
		}
	}

}
