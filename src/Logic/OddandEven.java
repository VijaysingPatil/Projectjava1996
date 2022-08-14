package Logic;

import java.util.Scanner;

public class OddandEven {

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Please Enter value");
		   int  number=sc.nextInt();
		   if(number%2==0)
		   {
		       System.out.println("Given Number is Even");
		   
		   }
		   else
		   {
		       System.out.println("Given Number is Odd");
		   }

	}

}
