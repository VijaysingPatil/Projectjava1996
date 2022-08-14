package Revsrse;

import java.util.Scanner;

public class ReversedString {

	public static void main(String[] args) {
//Normal method
//String s = "Vijaysnig";
String r = "";
//By Useing Scaner Class
Scanner sc = new Scanner(System.in);
System.out.println("pleas Enter String");
String s = sc.next();
for(int i = s.length()-1;i>=0;i--) 
{
	r=r+s.charAt(i);
	
}
System.out.println("Reverse Strin "+r);
}
	}


