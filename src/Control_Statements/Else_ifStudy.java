package Control_Statements;

public class Else_ifStudy {

	public static void main(String[] args) 
		// if I got >=90 I am in Dist
        //else if  I got >=66 and<90 I am in first class
		//else if I got >=55 and <66 I am in Second class
		//else if I got >=45 and <55 I am in Pass class
        //els I am fail	
	{
		int marks = 8;
		if (marks>=90)
		{
		System.out.println("I am in Distigtion ");	
		}
		
		
		else if (marks>=66 &marks <90)
		{
			System.out.println(" I am in first class");
		}
		else if (marks>=55 & marks>=66)
		{
			System.out.println("I am in Second Class");
			
		}
		else if (marks>=45 & marks >=55)
		{
		System.out.println("I am in pass");	
		}
		else
		{
			System.out.println("I am i Fail");
		}
		{

		}
		
		
		
	}

}
