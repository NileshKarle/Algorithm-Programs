package org.json.simple.parser;

import java.util.*;
class Squareroot{
    public static double sqrt(double c) 
	{
	  if(c<2)
	  {
		  return 0;
	  }
        double EPSILON = 1E-15;
        double t = c;
        while (Math.abs(t - c/t) > EPSILON*t)
            t = (c/t + t) / 2.0;
        return t;
    }
   
}
class Square
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value");
		Squareroot sr=new Squareroot();
		int c=scan.nextInt();
		double r=sr.sqrt(c);
		int t=c;
		System.out.println(r);
		System.exit(0);
	}
}
