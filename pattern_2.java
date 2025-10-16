package test;
import java.util.Scanner;

public class pattern_2 {
	
	public static void pattern(int rows,int cols) {
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of rows:");
		
		int rows=sc.nextInt();
		
		System.out.println("enter the number of cols: ");
		
		int cols=sc.nextInt();
		
		pattern(rows,cols);
		
		sc.close();
		
		
		
	}

}
