package test;
import java.util.Scanner;
public class pattern_4 {
	public static void pattern(int rows,int cols)
	{
		for(int i=rows;i>=1;i--)
		{
			for(int j=cols;j>=1;j--)
			{
				System.out.print(i);
				
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
