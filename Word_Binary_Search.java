import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Word_Binary_Search
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		String path="/home/bridgeit/Desktop/nilesh/srch.txt";
		String temp="";
		int comp=0;
		try
		{
			FileReader fr=new FileReader(path);
			BufferedReader br=new BufferedReader(fr);
			String arr[]=new String[8];
			String tem=" ";
			int i=0,j=0;
			while((temp=br.readLine())!=null)
			{
				StringTokenizer str=new StringTokenizer(temp,",");
				while(str.hasMoreTokens())
				{
					String token=str.nextToken();
					arr[i]=token;
					i++;
				}
			}
			
			for(i=0;i<8;i++)
			{
				for(j=0;j<8;j++)
				{
					comp=arr[i].compareToIgnoreCase(arr[j]);
					if(comp<0)
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println(" ");
			for(j=0;j<8;j++)
			{
				System.out.print(arr[j]+"  ");
			}
			System.out.println(" ");
			System.out.println("enter key to search");
			String key=scan.nextLine();
			int low=0,high=7,mid;
			while(low<=high)
			{
				mid=(low+high)/2;
				comp=key.compareToIgnoreCase(arr[mid]);
				if(comp==0)
				{
					System.out.println("key found");
					System.exit(0);
				}
				if(comp>0)
				{
					low=mid+1;
				}
				if(comp<0)
				{
					high=mid-1;
				}
				if(low>high)
				{
					System.out.println("key not found");
				}
			}
		}
		finally
		{
			System.out.println(" ");
		}
	}
}
