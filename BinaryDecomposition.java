package org.json.simple.parser;

import java.util.*;
class BinaryDecomposition
{
	static void mToBinary(int n)
	{
		String arr;
		int i,j=15;
		double rev=0;
		arr=(String.format("%16s",Integer.toBinaryString(n)).replace(" ","0")); //convert to binary format.
		char q[]=new char[16];
		double x[]=new double[16];
		q=arr.toCharArray(); //convert the string into character array.
		for(i=0;i<16;i++)
		{
			System.out.print(q[i]); //display the binary format.
		}
		for(i=0;i<16;i++)
		{
			if(q[i]=='1')
			{
				x[j]=Math.pow(2,j); //power to 2 values in array to display result.
				j--;
			}
			else
			{
				x[j]=0;
				j--;
			}
		}
		j=0;
		System.out.println(" ");
		System.out.print(n+" = ");
		for(i=15;i>=0;i--)
		{
			if(x[i]!=0) //if array location not equal to zero print it.
			{
				if(j==0) //to properly display the + sign in answer.
				{
					System.out.print(x[i]);
					j=1;
				}
				else
				{
					System.out.print(" + "+x[i]);
				}
			}
		}
		System.out.println(" ");	
	}
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the integer ");
		int n=scan.nextInt(); //collect the value from the user.
		if(n<=0)
		{
			System.out.println("Enter a greater number next time ");
			System.exit(0);
		}
		mToBinary(n); //function call.
	}
}
