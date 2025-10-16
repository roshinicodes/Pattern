package test;

import java.util.Scanner;

public class pattern_8 {
	
	public static void pattern(int rows,int cols)
	{
		int k=2;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				System.out.print(k);
				k=k+2;
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
			
			System.out.println("enter row :");
			
			int n=scan.nextInt(); 
			
			System.out.println("enter cols :");
			
			int m=scan.nextInt();
			
			pattern(n,m);
			

	}

}
