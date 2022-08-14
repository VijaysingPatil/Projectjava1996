package Control_Statements;

public class Elseif_study {

	public static void main(String[] args) 
	//if got>90 i am in Dist
	//else if i got>=60 and<90 i am n first class
	//else if i got>=50 and<60 i am n second class
	//else if i got>=40 and<50 i am n third class
	//else i am fail
	
	{
		int marks =10;
		if (marks>=90)
		{
			System.out.println("I am in Dist");
		}
		else if(marks>=60 & marks<90)
		{
		System.out.println("I am in first class");
		
	}
		else if (marks>=50 & marks<60)
		{
		System.out.println("I am in Second Class");	
		}
		else if (marks>=40 & marks<50)
		{
		System.out.println("I am in third Class");	
		}
		else 
		{
		System.out.println("I am in fail");	
		}

	}
}
