package Inheritance_Study;

public class SingleLevalInheritance_Study {

	public static void main(String[] args) 
	
	{ //calling to anther mehod in non static method 
		Son s=new Son();
		s.Mobile();
		Mother m = new Mother();
		m.look();
        s.look();
        
        System.out.println("=============================");
        
        // calling to anther class in static method 
        Mother.Mony();
        
        Son.Laptop();
        
        Son.Mony();
        System.out.println("=================================");
        //For Non static Variable
        System.out.println("Mother properties is "+m.a);
        System.out.println("Son properties is "+s.b);
        System.out.println("Son properties Extends Mother "+s.a);
        //For Static Variable
        System.out.println("Son properties is "+Son.c);
        System.out.println("Mother properties is "+Mother.d);
        System.out.println("Son properties Extends by MOther "+Son.d);
        
	}
	}
