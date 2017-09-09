package org.json.simple.parser;

import java.util.*;
class Insertion_Sort
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of words you want to enter");
		int n= scan.nextInt();
		String words[]=new String[n];
		String temp;
		int i,j,count=0;
		for(i=0;i<n;i++)
		{
			j=0;
			if(i==0)
			{
				words[i]=scan.next();
			}
			if(i!=0)
			{
				temp=scan.next();
				while(j!=i)
				{
					for(String a:words)
					{
						int cmpare=a.compareToIgnoreCase(temp);
						if(cmpare>0)
						{
							String z;
							z=words[j];
							words[i]=words[j];
							words[j]=temp;
						}
						j++;
						if(count==i)
						{
							words[i]=temp;
							break;
						}
					}
				}
			}
		}
	}
}