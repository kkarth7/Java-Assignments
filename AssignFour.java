package Day2assignment;

import java.util.Scanner;

public class AssignFour {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter positive number");
		n=sc.nextInt();
		System.out.println(UserMainCodeFour.getSumOfSquaresOfDigits(n));
	}

}
