package org.json.simple.parser;

import java.util.*;
class Binary
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the integer ");
		int n=scan.nextInt(); //collect the integer value.
		String arr;
		int i,j=0;
		double rev=0;
		arr=(String.format("%8s",Integer.toBinaryString(n)).replace(" ", "0")); //convert the integer into binary format.
		char q[]=new char[8];
		char x[]=new char[8];
		q=arr.toCharArray(); //convert to char array.
		for(i=0;i<8;i++)
		{
				//display the binary format.
			System.out.print(q[i]);
		}
			//swap the 4 bits.
		while(j<8)
		{
			for(i=4;i<8;i++)
			{
				x[j]=q[i];
				j++;
			}
			for(i=0;i<4;i++)
			{
				x[j]=q[i];
				j++;
			}
		}
		System.out.println("");
		j=8;
		for(i=0;i<8;i++)
		{
				//display the swaped binary form.
			System.out.print(x[i]);
		}
				//convert the binary to integer format.
			for(i=0;i<8;i++)
			{
				if(x[i]=='1')
				{
					rev=rev+Math.pow(2,j);
				}
				j--;
			}
		int ans=(int) rev/2;
		System.out.println(" ");
		System.out.println(" "+ans);
		i=2;
		while(i<ans)
		{
			i=i*2;
		}
		if(i==ans) //the swaped value is power of 2.
		{
			System.out.println("yes it is a power of 2 ");
		}
		else
		{
			System.out.println("no it is not a power of 2 ");
		}
		System.out.println(" ");
	}
}
