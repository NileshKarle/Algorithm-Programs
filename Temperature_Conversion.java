<<<<<<< HEAD
//package nilesh;

import java.util.*;
class Second
{
	static void TemperaturConversion(int value)
	{
		float ans;
		ans=0.0f;
			ans=(float) (value*1.8);
			ans=ans+32;
			System.out.println("value is "+ans+" ");
			System.exit(0);
	}
		static void Temperatur(float v)
		{
			v=v-32;
			float r=0.5555f;
			float ans =v*r;
			System.out.println("value is "+ans+" ");
			System.exit(0);
		}
}
class Temp
{
=======
import java.util.*;
class Util
{
	static double temperaturConversion(int n,float value)
	{
		double ans;
		if(n==0)
		{
			value=value+32;
			ans=1.8*value;
			return ans;
		}
		if(n==1)
		{
			value=value-32;
			ans=value*0.5556;
			return ans;
		}
		return 0;
	}
>>>>>>> 627acfab8b19c0f4ba2aac4f5470127ef135dd4b
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		int n;
<<<<<<< HEAD
		Second s=new Second();
		System.out.println("0-to convert celsius to fahrenheit ");
		System.out.println("1-to convert fahrenheit to celsius");
		n=scan.nextInt();
		if(n==0)
		{
			int value;
			System.out.println("enter the celsius value ");
			value=scan.nextInt();
			s.TemperaturConversion(value);
		}
		else if(n==1)
		{
			float value;
			System.out.println("enter the fahrenheit value ");
			value=scan.nextFloat();
			s.Temperatur(value);
=======
		float value;
		double ans;
		System.out.println("0 to convert celsius to fahrenheit ");
		System.out.println("1 to convert fahrenheit to celsius");
		n=scan.nextInt();
		if(n==0)
		{
			System.out.println("enter the celsius value ");
			value=scan.nextInt();
			ans=temperaturConversion(n,value);
			System.out.println("the fahrenheit value is "+ans+" .");
		}
		else if(n==1)
		{
			System.out.println("enter the fahrenheit value ");
			value=scan.nextInt();
			ans=temperaturConversion(n,value);
			System.out.println("the Celsius value is "+ans+" .");
>>>>>>> 627acfab8b19c0f4ba2aac4f5470127ef135dd4b
		}
		else
		{
			System.out.println("you entered a invalid number");
		}
	}
}