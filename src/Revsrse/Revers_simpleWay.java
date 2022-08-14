package Revsrse;

public class Revers_simpleWay {

	public static void main(String[] args) {
		String s = "Vijaysing";
		System.out.println("==========Reversed Char===========");
		for(int i =s.length()-1;i>=0;i--) 
		{
			System.out.print(s.charAt(i));
			
		}
		System.out.println("==============");
		for(int i=0;i<=s.length()-1;i++) 
		{
			System.out.println(s.charAt(i));
			
		}
		
		System.out.println("==========Count of String===============");
		
		System.out.println(s.length());
	}
}
