package com.jsp;

public class AllThreeDigitArmstrongNumber {

	public static boolean isArmstrong(int x) {
		int sum=0;int temp=x;
		while(x!=0) {
			int d=x%10;
			sum=sum+d*d*d;
			x=x/10;
		}
		return temp==sum;
	}
	public static void main(String[] args) {
		System.out.println("All the three digit armstrong number are:");
		for(int i=100;i<=999;i++) {
			boolean rs = isArmstrong(i);
			if(rs==true)
				System.out.println(i+" ");
		}
	}

}
