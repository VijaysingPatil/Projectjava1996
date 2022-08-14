package LogicalProgram;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		//factorial Number  4!=4*3*2*1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int Num = sc.nextInt();
		int fct=1;
		for(int i = Num;i>=1;i--) 
		{
			fct=fct*i;
		}
       System.out.println("Enter Factorial Number "+fct);
	}

}
