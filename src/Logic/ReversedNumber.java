package Logic;

public class ReversedNumber {

	public static void main(String[] args) 
	{
		int a=12345;
		String r = "";
		String s = Integer.toString(a);
		for(int i =s.length()-1;i>=0;i--) 
		{
			r=r+s.charAt(i);
		}
    int revNum = Integer.parseInt(r);
    
    System.out.println("Reversed Number is "+revNum);

	}

}
