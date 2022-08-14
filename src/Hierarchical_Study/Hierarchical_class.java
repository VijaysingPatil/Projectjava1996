package Hierarchical_Study;

public class Hierarchical_class {

	public static void main(String[] args) 
	{    
		//For Son1 class
		// For Non static  method 
		Son1 s = new Son1();// create object
		s.Mobile();
		s.Sample();
		//For Son class
		// For static  method 
		Son n = new Son();  // creat object
		n.Test1();
		n.Sample();
		
		// Son1 class.......For static method ......
		Son1.Laptop();
		Son1.Display();
		
		//Son class ..........For static method....
		Son.Test2();
		Son.Display();

	}

}
