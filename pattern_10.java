package test;

import java.util.Scanner;

public class pattern_10 {
	public static void pattern(int n,int m)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.print(j+" "+i+" ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated meth3od stub Scanner scan=new Scanner(System.in);
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter row :");
		
		int n=scan.nextInt(); 
		
		System.out.println("enter cols :");
		
		int m=scan.nextInt();
		
		pattern(n,m);
		

	}

}
