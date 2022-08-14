package Casting;

public class UpcastingAandB {

	public static void main(String[] args) {
		A a = new A ();
		a.Land();
		a.Mony();
		
		B b = new B();
		b.Book();
		b.Mony();
		b.Land();
		
		//Upcasting 
		A i = new B ();
		i.Mony();
		i.Land();
		//i.Book();    // Not method name 
		
		
		

	}

}
