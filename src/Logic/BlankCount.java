package Logic;

public class BlankCount {

	public static void main(String[] args) {
		String s = "rho hdds j3if jejf ";
		   int counter = 0;
		   for(int i = 0;i<=s.length()-1;i++)
		{
		    char blank = s.charAt(i);
		    if(blank==' ')
		    { 
		        
		        counter++;
		}

		}
		System.out.println(counter);
	}

}
