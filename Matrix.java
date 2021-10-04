import java.util.Scanner;

public class Matrix
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Rows and Column : ");
		
		int Row = scan.nextInt();
		int Column = scan.nextInt();
		
		int  arr[][] = new int[Row][Column];
		
		System.out.println("Enter elements of an array");
		
		for (int i = 0; i < Row; i++) 
		{
			for (int j = 0; j < Column; j++) 
			{
				arr[i][j] = scan.nextInt();
				
			}
		  System.out.println(" ");
		}
		
		for (int i = 0; i < Row; i++) 
		{
			for (int j = 0; j < Column; j++) 
			{
				arr[i][j] = scan.nextInt();
				
			}
		  System.out.println(" ");
		}
	
	}
}
