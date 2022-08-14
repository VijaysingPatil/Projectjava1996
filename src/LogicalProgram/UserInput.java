package LogicalProgram;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1");
		int num1 = sc.nextInt();
		System.out.println("Enter Number2");
		int num2 = sc.nextInt();
		
		int sum = num1+num2;
        System.out.println("Sum of Num1&Num2 "+sum);

	}

}
