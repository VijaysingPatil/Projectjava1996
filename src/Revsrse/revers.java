package Revsrse;

import java.util.Scanner;

public class revers {

	public static void main(String[] args)
	{
		String s = "Mayur";
		String r = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("plz Enter String ");
		//String s = sc.next();

      for(int i = s.length()-1;i>=0;i--) 
      {
    	 r=r+s.charAt(i);
      }
		System.out.println(r);
	}

}
