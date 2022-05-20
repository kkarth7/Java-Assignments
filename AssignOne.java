package Day2assignment;

import java.util.Scanner;

public class AssignOne {

	public static void main(String[] args) {

		int n,n1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter two Positive numbers");
		n=sc.nextInt();
		System.out.println("enter 2nd number");
		n1=sc.nextInt();
		int ffnl=UserMainCodeOne.addPalindrome(n,n1);
		System.out.println(ffnl);
	}

}
