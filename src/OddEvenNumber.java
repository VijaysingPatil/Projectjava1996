import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) 
	{   // Odd & Even Number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Valide number ");
		int number = sc.nextInt();
		if(number%2==0) 
		{
			System.out.println("The given number is odd");
			
		}
		else 
		{
			System.out.println("The given number is Even");
		}


	}

}
