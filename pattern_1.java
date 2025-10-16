package test;
import java.util.Scanner;

public class pattern_1 {
	
	public static void pattern(int row,int cols)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void  main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the number of rows:");
		
		int row=scan.nextInt();
		
		System.out.println("enter the number of columns:");
		
		int cols=scan.nextInt();
		
		pattern(row,cols);
		
	}

}
