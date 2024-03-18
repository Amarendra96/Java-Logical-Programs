package com.jsp;

public class PrimeNumberWithin100 {

	public static boolean isPrime(int x) {
		for(int i=2;i<=x/2;i++) {
			if(x%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("The prime number between 100' are:");
		for(int i=2;i<=100;i++) {
			boolean rs = isPrime(i);
			if(rs==true) {
				System.out.println(i+" ");
			}
		}
	}
}
