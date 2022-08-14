package Interface_study;

public class ImpClass implements MyInterface {

	public static void main(String[] args)
	{ ImpClass i = new ImpClass();    //object create in Impclass
	i.m1();
	i.m2();
	i.m3();                  //owen method of Imp class
   System.out.println(a);   //calling for variable interface 
	}

	@Override
	public void m1()      // provide defination to incomplite method from interface   
	{
		System.out.println("method m1 is complited in Implementetion class");
	}

	@Override
	public void m2() {
		
		System.out.println("method m2 is complited in Implementetion Class ");
	}
	public void m3 () // owen method in Imp class
	{
		System.out.println("method m2 is complited in Implementetion Class");
	}

}
