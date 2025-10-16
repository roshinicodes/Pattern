package test;

import java.util.Scanner;

public class pattern_9 {
	public static void pattern(int row,int col)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print(i*j);		
		    }
			System.out.println();
		}
			
		
	}
	
	public static void main(String[] args) {
		
		 Scanner scan=new Scanner(System.in);
			
			System.out.println("enter row :");
			
			int n=scan.nextInt(); 
			
			System.out.println("enter cols :");
			
			int m=scan.nextInt();
			
			pattern(n,m);
			

	}

}
