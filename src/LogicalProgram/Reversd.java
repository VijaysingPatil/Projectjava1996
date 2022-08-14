package LogicalProgram;

import java.util.Scanner;

public class Reversd {

	public static void main(String[] args) {
		//String s = "Rohit";
		String r = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter String");
		String s = sc.next();
		for(int i =s.length()-1;i>=0;i--) 
		{
			r=r+s.charAt(i);
		}
        System.out.println("Reversed String "+r);
	}

}
