package Day2assignment;

public class UserMainCodeFive {

	static int getLuckySum(int a,int b,int c)
	{ int sum=0;
		if(a==13)
		{
			sum=c;}
		else if(b==13)
			 {
				sum=a;
			}
		else if(c==13)
		{
			sum=a+b;
		}
		else if(a!=13||b!=13||c!=13)
		{
			sum=a+b+c;
		}
		return sum;
	}
}
