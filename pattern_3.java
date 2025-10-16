package test;
import java.util.Scanner;

public class pattern_3 {
	
	public static void pattern(int rows,int cols)
	{
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			
		}
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter n of rows");
		
		int n=sc.nextInt();
		
		System.out.println("enter n of cols");
		
		int m=sc.nextInt();
		
		pattern(n,m);
		
		
	}
}
