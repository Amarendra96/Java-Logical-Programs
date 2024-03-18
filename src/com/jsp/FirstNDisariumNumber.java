package com.jsp;

import java.util.Scanner;

public class FirstNDisariumNumber {


	public static int digitCount(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;

		}
		return count;
	}
	public static int pow(int n,int p) {
		int product=1;
		while(p>0) {
			product=product*n;
			p--;
		}
		return product;
	}
	public static boolean isDisarium(int x) {
		int sum=0;
		int temp=x;
		int dc = digitCount(x);
		while(x!=0) {
			int d=x%10;
			sum=sum+pow(d, dc);
			x=x/10;
			dc--;
		}
		return sum==temp;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=scanner.nextInt();
		for(int i=1;n>0;i++) {
			boolean rs = isDisarium(i);
			if(rs==true) {
				System.out.println(i+" ");
				n--;
			}
		}

	}


}
