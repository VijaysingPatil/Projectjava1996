package StringConvertChar;

public class Gen {
public static void main(String[] args) {
System.out.println("=======Convert String to char =======");
	String s ="Rohit";
	char c = s.charAt(1);
	System.out.println(c);
	
	System.out.println("=======Convert String to int =======");
	{
	String r = "Rohit";
	for(int i =0 ;i<s.length();i++){
		char ce = s.charAt(i);
		System.out.println(i);
	}
	System.out.println("=======Convert Char to String =======");
	char h ='R';
	String v = String.valueOf(h);
	System.out.println(v);
	
	System.out.println("=======Convert String to int =======");
	String st="200";
	int i = Integer.parseInt(st);
	System.out.println(i);
	
	String qr = "Rohit";
	char t = r.charAt(1);
	System.out.println(t);
	
	String d = "Rohit";
	System.out.println("==========Revesed===========");
	for(int j=d.length()-1;j>=0;j--) 
	{
		System.out.println(d.charAt(j));
	}
	
}
	
}}

			
		


	

