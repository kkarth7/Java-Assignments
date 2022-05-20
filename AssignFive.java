package Day2assignment;

import java.util.Scanner;

public class AssignFive {

	public static void main(String[] args) {

		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println(UserMainCodeFive.getLuckySum(a, b, c));
	}

}
