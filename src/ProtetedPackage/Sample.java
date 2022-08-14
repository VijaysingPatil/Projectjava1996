package ProtetedPackage;

import AccessSpecifire.Protected_AccessSpecifire;

public class Sample extends Protected_AccessSpecifire   //.....step2
{

	public static void main(String[] args)
	{
		Protected_AccessSpecifire a = new Protected_AccessSpecifire();
		a.test1(); // calling public test      .......step1
		
		Sample s = new Sample ();      //.............step3
		s.test1();
		s.test4();
		

	}
public void test1() 
{
	System.out.println("Public Sample class in test1 method ");
}
}
