package com.shah.imtiyaj;

import java.util.Scanner;

public class Armstrong {
	private static Scanner input;
	private static int sum=0;
	private static int r;
	private static int temp;
	
	public static void main(String[] args) {
	    int n;
		input=new Scanner(System.in);
		System.out.print("Please Enter a Number: ");
		n=input.nextInt();
		temp=n;
		
		while (n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;		
		}
		
		if (temp==sum) {
			System.out.println("Armstrong Number !");
		}
		else {
			System.out.println("Not Armstrong Number !");
		}
	}
}
