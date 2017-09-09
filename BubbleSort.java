package org.json.simple.parser;

import java.util.*;
class BubbleSort
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
			//collect the values from user.
		System.out.println("enter the no. of values to be sorted. ");
		int n=scan.nextInt();
		int arr[]=new int[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the "+i+" element  ");
			arr[i]=scan.nextInt();
		}
		int r=n-1;
			//in each itereation the greatest number will be placed on its position.
		while(r>0)
		{
			for(i=0;i<r;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			r--;
		}
		System.out.println("");
			//display the sorted array.
		System.out.println("the sorted order is");
		for(i=0;i<n;i++)
		{
			System.out.print("  "+arr[i]);
		}
		System.out.println("");
	}
}
