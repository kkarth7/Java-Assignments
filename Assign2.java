package com.te.basics;

import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {

		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Positive number");
		n=sc.nextInt();
		int s=UserMainCode2.sumOfSquaresOfEvenDigits(n);
		System.out.println("SumOfSquaresOfEvenDigits is "+s);
	
	}

}
