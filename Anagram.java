package org.json.simple.parser;

import java.util.*;
class Util
{
		//static function to check for anagram.
	static void fAnagram(String a,String b)
	{
		int i=0,num1=0,num2=0,j=0;
			//convert to character array.
		char fst[]=a.toCharArray();
		char sec[]=b.toCharArray();
			//sort the array.
		Arrays.sort(fst);
		Arrays.sort(sec);
		int ln1=a.length(),ln2=b.length();
		while(i<a.length() && j<b.length())
		{
				//ignore space.
			if(fst[i]==' ')
			{
				ln1-=1;
				i++;
			}
			if(sec[j]==' ')
			{
				ln2-=1;
				j++;
			}
				//compare each character.
			if(fst[i]!=sec[j])
			{
				System.out.print("not anagram");
				System.out.println("");
				System.exit(0);
			}
			i++;
			j++;
		}
		if(ln1==ln2) //if length is equal.
		{
			System.out.println(" Yes it is a anagram");
			System.out.println("");
		}
		else //if length is not equal.
		{
			System.out.println("no it is not a anagram");
			System.out.println("");
		}
	}
	public static void main(String []args)
	{
		String a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first  string. ");
		a=scan.nextLine();
		System.out.println("Enter the Second string. ");
		b=scan.nextLine();
		fAnagram(a,b); //function call to check if two strings are anagram.
	}
}
