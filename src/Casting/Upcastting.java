package Casting;

public class Upcastting {

	public static void main(String[] args)
	{
		Father f = new Father ();
		f.Bike();
		f.car();
		System.out.println("===================");
		Son s = new Son ();
		s.car();
		s.Bike();
		s.Degree();
		System.out.println("========================");
		// For up casdting 
		Father r = new Son();
		r.Bike();
		r.car();
		//r.Degree();  Becose this is son Property not common 

	}

}
