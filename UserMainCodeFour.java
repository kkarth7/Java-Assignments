package Day2assignment;

public class UserMainCodeFour {

	static int getSumOfSquaresOfDigits(int n)
	{
		int rem,sq=0,sum=0;
		while(n>0)
		{
			rem=n%10;
			sq=rem*rem;
			sum=sum+sq;
			n=n/10;
		}
		return sum;
	}
}
