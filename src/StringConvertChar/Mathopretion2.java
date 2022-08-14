package StringConvertChar;

public class Mathopretion2 {

	public static void main(String[] args)
	{
		//class name object name = new class name
		
		Mathopretion2 m = new Mathopretion2();
		m.add();
		m.add(25, 56);//static with parameter
		//for static method
		subs();
		Mathopretion2.subtraction(35, 65);//  static method with parameter
	}
public void add()//non static regular method - without parameter\zero method 


{
	int a;
	int b;
	int addition;
	a = 20;
    b = 56;
    addition = a+b;
    System.out.println("the addition of a nad b "+addition);
}
public void add(int a,int b) //non static public method - with parameter
{
	int sum = a=b;
	System.out.println("sum is "+ sum);
}
public static void subs() //static regular method - without parameter
{
	int a;
	int b;
	int subs;
	a = 25;
	b = 46;
	subs = a-b;
	System.out.println("substraction is "+subs);
	
}
public static void subtraction(int a, int b) //with parameter
{
	int subtraction;
	subtraction = a - b;
	System.out.println("subtraction is "+subtraction);
}
}
