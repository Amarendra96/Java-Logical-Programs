package com.jsp;

import java.util.Scanner;

public class FirstNPrimeNumber {

	
	static boolean isPrime(int x) {
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		System.out.println("The first "+ n+" prime number are:");
		for(int i=2; n>0;i++)
		{
			boolean rs=isPrime(i);
			if(rs==true) 
			{
				System.out.println(i+" ");
				n--;
			}
		}
	}
}







