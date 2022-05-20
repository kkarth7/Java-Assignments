package Day2assignment;

public class UserMainCodetwo 
{
	static int getSumOfNfibos(int n)
	{
		int sum=0,a=0,b=1,c=0,count=0;
		
		c=a+b;
		for(int i=n;i>0;i--)
		{
			sum=sum+a;
			a=b;
			b=c;
			c=a+b;
			count++;
		if(count==n)
		{
			break;
		}
		}
		return sum;
	}
 }
