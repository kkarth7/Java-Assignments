package Day2assignment;

public class UserMainCodeOne

{
	static int addPalindrome(int n, int n1)
	{
		int sum=0;
		for(int i=n;i<=n1;i++)
		{
			int rev=0;
			int copy=i;
			while(copy>0)
			{
				int rem=copy%10;
				rev=rev*10+rem;
				copy=copy/10;
			}
			if(i==rev)
			{
				sum=sum+rev;
			}
		}
		return sum;
	}
}
