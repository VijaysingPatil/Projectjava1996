package LogicalProgram;

public class Palindrome123 {

	public static void main(String[] args) {
		String s = "rotator";
		String r = "";
		for(int i=s.length()-1;i>=0;i--) 
		{
			r=r+s.charAt(i);
		}
		if(s.equals(r))
		{
		System.out.println("String is Palindrome");
	}
		else 
		{
			System.out.println("String Not Palindrome");
		}

}}
