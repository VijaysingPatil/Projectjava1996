package globalAndlocalVariable;

public class VariableType

{ 
	//Non static global Variable
     int x = 287;  //variable declaration + assign value.......step 1
     
	//static global variable
	static int y = 374;
	
	
	public static void main(String[] args)
	{
		VariableType vt = new VariableType();
		vt.test();//calling non static method from same class
        test1();//calling static method from same class
		
		System.out.println("Global valu of x is "+vt.x);//calling non static global variable from same class
		
		System.out.println("Globlal valu of y is "+y);//calling static Global variable from same class
		
		//int sum = 120+vt.x;//usage of non static global variable from same class
		
		//int sub = 200-y;//usage of static global variable from same class
		
		Sample s = new Sample(); // created Object of anther class 
		
		System.out.println("valu of non static global variable from anther class is "+s.p);
		//calling non static global variable from anther class
		System.out.println("valu of static global variable from anther class is "+Sample.q);
		// calling static global variable from anther class
	}
public void test() 

{
	int a = 80;// local variable  //.....step2
	int sum = a+100;
	System.out.println("sum is "+sum);
	
}
public static void test1() 
{
	int sub= 200-y;
	System.out.println("running static test1 method "+sub  );
}
}
