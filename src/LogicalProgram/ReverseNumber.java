package LogicalProgram;

public class ReverseNumber {

	public static void main(String[] args)
	{
		int Numb = 2468;
	 
	 String s = Integer.toString(Numb);
	 String r = "";
	 for(int i = s.length()-1;i>=0;i--) 
	 {
		 r=r+s.charAt(i);
	 }
	 int RevNum = Integer.parseInt(r);
	 
	 System.out.println(RevNum);
		
	}
	
}
