package constructors;

public class testwithoutparameter {
	//Variable declaration
	int a;                      //step 1
	static int b;
	
	public testwithoutparameter() //user defined constructor  ......step 2
	{  
		System.out.println("Running user defined");
		//initialize..assign.. data member and variable
		a = 20;
		b = 45;
		
	}
	public static void main(String[] args)
	{
		//created object                   ......step 5
		testwithoutparameter t= new testwithoutparameter();
		t.add();
		subs();
		
	}
public void add()
{
	int sum = a+b ;//local variable .............step 3
	
	System.out.println("sum of two member is "+sum);
}
public static void subs()
{ 
	int sub= 10-b;
	                   //.............step 4
	System.out.println("Hi my name Rohit "+sub);
}
}
