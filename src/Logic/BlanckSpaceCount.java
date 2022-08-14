package Logic;

public class BlanckSpaceCount {

	public static void main(String[] args)
	{
		String s = " My Name Is Vijaysing Rajput ";
		int counter = 0;
		for (int i =0 ; i<=s.length()-1;i++) 
		{
			 char blank = s.charAt(i);
			 if(blank==' ')
{
			 counter++;
		}
		

	}
System.out.println("Blamk Space"+counter);


	}}
