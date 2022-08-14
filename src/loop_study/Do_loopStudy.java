package loop_study;

public class Do_loopStudy {

	public static void main(String[] args)
	{//i want 9 table
	    //initialization---->9
		//condition-------a<=90  // Increament
		//updation-------a+9
		
		int a=9;        // initialize.......step 1
		do 
		{
			System.out.println(a);
			a=a+9;	   //    18,27,36       updation .........step 2
		
		}
		while (a<=90);   // condition......step3
		{
			System.out.println("................");
		}
  
		int b = 90;
		do 
		{
			System.out.println(b);
			b=b-9;
		}
		while(b>=9);
				
		}
}
	
