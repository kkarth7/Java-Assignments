package com.te.basics;

import java.util.Scanner;

public class Assign4 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		n=sc.nextInt();
		int s=UserMainCode4.getUnique(n);
		if(s<=1)
		{
			System.out.println("This number is unique");
		}
		else
		{
			System.out.println("this number is not unique");
		}
	
	}

}
