package constructors;

public class testwithparameter1
{
	// Global variable...........step1
	int a;
	int b;
	int c;
	
	
	public testwithparameter1() //create constructor...step3
	{
		// initialize variable
    a= 11;
    b= 22;
    c= 33;
		
	}
	public testwithparameter1(int x)//user defined constructor with Parameter
	{
		a=x;
	//  b=default
	//  c=default
		
	}
	public testwithparameter1(int x,int y) 
	{
     a=x;
     b=y;
     //c=default

	}
     public testwithparameter1(int x,int y,int z) 
     {
    	 a=x;
    	 b=y;
         c=z;
     
     }
	
	
	public static void main(String[] args)
	{
		//create object        ......step4
		testwithparameter1 tp = new testwithparameter1();
		
		tp.addition();
		testwithparameter1 tq = new testwithparameter1(56);
		tq.addition();
		
		testwithparameter1 tr = new testwithparameter1(45,36);
		
		tr.addition();
		testwithparameter1 ts = new testwithparameter1(57,47,98);
		ts.addition();
	}
public void addition() //non static method without parameter..step2

{
	int addition = a+b+c;
	System.out.println("sum of "+addition);
}
}
