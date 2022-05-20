package Day2assignment;

public class UserMainCodeThree {

static int addNumbers(int n)
{ 
	int sum=1;

		for(int i=2;i<=n;i++)
		{
			int a=2;
			while(a<=i/2)
			{	
			if(i%a==0)
			{
			break;
			}
			a++;
			}	
			if(a<=i/2)
			{
				sum=sum+i;
			}
		}
	return sum;	
	}
	}


