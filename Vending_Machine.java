<<<<<<< HEAD
//package nilesh;

=======
<<<<<<< HEAD
=======
package nilesh;

>>>>>>> b4473088f1298c37c3b8acc4fc2d69238247a790
>>>>>>> 627acfab8b19c0f4ba2aac4f5470127ef135dd4b
import java.util.*;
class Vending_Machine
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
<<<<<<< HEAD
		System.out.println("Enter the amount you want to enter in the vending machine");
		int rs=scan.nextInt();
		int count=0,i=0;
		int change[]={1000,500,100,50,10,5,2,1};
=======
<<<<<<< HEAD
		System.out.println("enter the amount");
		int N=scan.nextInt();	
		int Notes[]={1000,500,100,50,10,5,2,1};
		int i=0;
		int TotalNotes=0;
		count_notes(N,Notes,i,TotalNotes);
	}

	public static void count_notes(int N,int Notes[],int i,int TotalNotes)
	{
		int count=0;
		if(N==0)
		{
			System.out.println("Total number of notes :"+ TotalNotes);
			System.exit(0);
		}
		else
		{
			count=N/Notes[i];
			TotalNotes=TotalNotes+count;
			System.out.println(Notes[i]+"Rs notes are  "+count);
			N=N%Notes[i];
			i++;
		}
		count_notes(N,Notes,i,TotalNotes);
	}
}
=======
		System.out.println("Enter the amount you want to enter in the vending machine");
		int rs=scan.nextInt();
		int count=0,i=0;
		int change[]=new int[8];
		change[0]=1000;
		change[1]=500;
		change[2]=100;
		change[3]=50;
		change[4]=10;
		change[5]=5;
		change[6]=2;
		change[7]=1;
>>>>>>> 627acfab8b19c0f4ba2aac4f5470127ef135dd4b
		while(rs!=0)
		{
			for(i=0;i<8;i++)
			{
				count=0;
				while(rs>=change[i])
				{
					count++;
					rs-=change[i];
				}
				if(count!=0)
				{
					System.out.println("there are "+count+" number of "+change[i]+" rs notes.");
				}
				if(rs==0)
				{
					System.exit(0);
				}
			}
		}
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> b4473088f1298c37c3b8acc4fc2d69238247a790
>>>>>>> 627acfab8b19c0f4ba2aac4f5470127ef135dd4b
