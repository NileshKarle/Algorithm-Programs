package org.json.simple.parser;

import java.util.Scanner;

class FindYourNumber{
	static int low=1,high=0,mid=0;
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		int a;
		int n=Integer.parseInt(args[0]);
		System.out.println("think a value between 0 and "+(n-1));
			//assign the value for low,high and mid. 
		low=0;
		high=n-1;
		mid=(low+high)/2;
		for(;;) //for loop infinate.
		{
			if(low==mid)
			{
				System.out.println("is your value "+low+" if yes enter 1 else enter 0 ");	
			}
			else
			{
				System.out.println("if value is in range "+low+"-"+mid+" enter 1 else enter 0 ");
			}
			a=scan.nextInt(); //user choice.
				//if value lies in the range.
			if(a==1)
			{
				high=mid;
				low=low;
				mid=(high+low)/2;
			}
				//if value dose not lies in the range.
			if(a==0)
			{
				low=mid+1;
				high=high;
				mid=(low+high)/2;
			}
				//if search ends display the answer.
			if(low==high)
			{
				System.out.println("your value is "+low);
				System.exit(0);		
			}
		}
	}
}