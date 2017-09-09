package org.json.simple.parser;

import java.util.*;

class Prime_Number{
	static void Prime(int s,int e)
	{
		int i,count=0;
		while(s<=e)
		{
			count=0;
			for(i=2;i<s;i++)
			{
				if(s%i==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(s+"  ");
			}
			s++;
		}
		System.out.println("");
	}
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range between 0-1000");
		System.out.println("starting point ");
		int start=scan.nextInt();
		System.out.println("end point ");
		int end=scan.nextInt();
		if(start<0 || end>1000 || start>end)
		{
			System.out.println("you enter a invalid range ");
			System.exit(0);
		}
		System.out.println("");
		Prime(start,end);
	}
}