package com.jsp;

import java.util.Scanner;

public class AllThePerfectNumberWithinN {
      public static boolean isPerfectNo(int x) {
    	  int sum=0;
    	  for(int i=1;i<=x/2;i++) {
    		  if (x%i==0) {
				sum=sum+i;
			}
    	  }
    	  return sum==x;
      }
      public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = scanner.nextInt();
		System.out.println("All the perfect number within "+n+" are");
	    for(int i=1;i<=n;i++) {
	    	boolean rs = isPerfectNo(i);
	    	if (rs==true) {
				System.out.println(i+" ");
			}
	    }
		
	}
}
