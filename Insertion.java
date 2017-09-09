package org.json.simple.parser;

import java.util.*;
public class Insertion
{  
	public static void insertionSort(String array[]) 
	{  
    	int n = array.length;  
        for (int j = 1; j < n; j++)
		{  
        String key = array[j];  
        	int i = j-1;  
			int p=array [i].compareToIgnoreCase(key);
        	while ( (i > -1) && (p>=0) ) 
			{  
				p=array [i].compareToIgnoreCase(key);
            	array [i+1] = array [i];  
                i--;  
            }  
                array[i+1] = key;  
		}
	}
	public static void main(String []args)
	{    
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter ");
		int n=scan.nextInt();
		int i=0;
		String arr[]=new String[n];
		for(i=0;i<n;i++)
		{
			System.out.println("enter the "+i+" element.");
			arr[i]=scan.next();
		}     
            System.out.println();    
                
            insertionSort(arr);//sorting array using insertion sort    
               
            System.out.println("After Insertion Sort");    
			for(i=0;i<n;i++)
			{
				System.out.print(arr[i]+"  ");
			}     
			System.out.println("");   
        }    
    }    