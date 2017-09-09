package org.json.simple.parser;

import java.util.*;
class Payment
{
	static void monthlyPayment(int p,int y,float r)
	{
		int n=12*y;
		float R=r/(12*100);
		float q=(float)Math.pow(R+1,-n);
		float answer=(float) (p*R)/(1-q);
		System.out.println("your payment is  = "+answer+" .");
	}
	public static void main(String []args)
	{
		int p=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		float r=Integer.parseInt(args[2]);
		monthlyPayment(p,y,r);
	}
}