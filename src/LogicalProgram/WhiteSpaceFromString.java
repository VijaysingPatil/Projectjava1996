package LogicalProgram;



public class WhiteSpaceFromString {

	public static void main(String[] args)
	{
		String s = "Vijay Pandurang patil";
		int Counter = 0;
		for(int i =0;i<=s.length()-1;i++) 
		{
			char blank = s.charAt(i);
			if(blank==' ') 
			{
				Counter++;
			}
			
		}

		System.out.println("Number of blank is "+Counter);

	}

}
