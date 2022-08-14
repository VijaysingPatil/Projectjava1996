package Generalisation;

public class TestGenrat 
{  public static void main(String[] args) {
	

	Airtel a = new Airtel();
	System.out.println("====Airtel=====");
	a.calls();
	a.data();
	a.msg();
	a.Airtel();
	
	VI v = new VI();
	System.out.println("======VI=======");	
	v.calls();
	v.data();
	v.msg();
	v.VI();
	
	BSNL b = new BSNL();
	System.out.println("=====BSNL======");
	b.calls();
	b.data();
	b.msg();
	b.BSNL();
}
}
