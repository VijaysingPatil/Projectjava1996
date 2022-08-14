package Multilevel_inheretasnce;

public class MultilevelInheritance {

	public static void main(String[] args)
	{   // Non Static method  
		Son s = new Son ();
		s.Laptop();
		s.Mony();
		s.Recipe();
		
		//Static Method 
		Son.Mobile();
		Son.Home();
		Son.Key();

	}

}
