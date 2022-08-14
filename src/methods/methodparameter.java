package methods;

public class methodparameter {

	public static void main(String[] args) 
	{
		//non static regular ....without parameter
		// object creation
		methodparameter mp = new methodparameter();
		mp.studentmarks();
		//with parameter
		mp.studentmarks(70, 84, 74 );
		//static method...... without parameter
		methodparameter.studentscore();
		// static method ....with parameter
		methodparameter.studntmarks(75, 74, 65);
	}
	
	//non static method without parameter
	
public void studentmarks() 
{
	int Math;
	Math = 56;
	
	int Science;
	Science = 76;
	
	int English;
	English = 87;
	System.out.println("========================");
	System.out.println("My Math Marks is "+Math);
	System.out.println("My Science Marks is "+Science);
	System.out.println("My English Marks is "+English);
	System.out.println("========================");
}

public void studentmarks(int Math,int Science,int English)

{
	System.out.println("========================");
	System.out.println("My Math Marks is "+Math);
	System.out.println("My Science Marks is "+Science);
	System.out.println("My English Marks is "+English);
	System.out.println("========================");
	
}

//static regular method without parameter

public static void studentscore()
{
	int Math;
	Math = 76;
	
	int Science;
	Science = 85;
	
	int English;
	English = 75;
	
	
	System.out.println("========================");
	System.out.println("My Math Marks is "+Math);
	System.out.println("My Science Marks is "+Science);
	System.out.println("My English Marks is "+English);
	System.out.println("========================");
		
	
}
public static void studntmarks(int Math,int Science,int English) 
{
	System.out.println("========================");
	System.out.println("My Math Marks is "+Math);
	System.out.println("My Science Marks is "+Science);
	System.out.println("My English Marks is "+English);
	System.out.println("========================");
		
}
}