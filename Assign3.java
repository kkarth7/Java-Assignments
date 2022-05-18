package com.te.basics;

import java.util.Scanner;

public class Assign3 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		n=sc.nextInt();
		int s=UserMainCode3.reverseNumber(n);
		System.out.println("Reversed number is "+s);
	}

}
