package org.json.simple.parser;
class Modifiedprimenumber{
	static int n=2;
	static int Prime(int n){
		int i,count=0,num=n,rev=0,dig=0;
			for(i=2;i<n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				while(num!=0)
				{
					dig=num%10;
					rev=rev*10+dig;
					num=num/10;
				}
				if(rev==n)
				{
					return n;
				}
				else
				{
					return 0;
				}
			}
			return 0;
	}
	public static void main(String []args)
	{
		System.out.println("the prime numbers between 0-1000 are as follows ");
		System.out.println("");
		int val=0,i;
		System.out.println("the numbers which are prime and palandrome are");
		for(i=2;i<=1000;i++)
		{
			val=Prime(i);
			if(val!=0)
			{
				System.out.print(" "+val+ " ");
			}
		}
	}
}