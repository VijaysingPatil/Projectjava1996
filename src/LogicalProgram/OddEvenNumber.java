package LogicalProgram;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) 
	{
		//Odd and Even Number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		if(number%2==0) 
		{
			System.out.println("The given number is Even");
		}
		else  
		{
			System.out.println("The given number is odd");
		}
		

	}

}
