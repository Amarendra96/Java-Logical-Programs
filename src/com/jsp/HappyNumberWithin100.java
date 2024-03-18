package com.jsp;

public class HappyNumberWithin100 {

	public static boolean isHappyNo(int n) {
		while (n>9) {
			int sum=0;
			do {
				int d= n%10;
				sum=sum+d*d;
				n=n/10;
			} while (n!=0);
			n=sum;
		}
		return n==1||n==7;
	}
    public static void main(String[] args) {
    	System.out.println("All the Happy number within 100:");
		for(int i=2;i<=100;i++) {
			boolean rs = isHappyNo(i);
			if (rs==true) {
				System.out.println(i+" ");
			} 
		}
	}
}
