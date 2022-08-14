package globalAndlocalVariable;

public class GandLVariable {
	
	int i = 23;
	static int j = 34;

	public static void main(String[] args) {
		GandLVariable gl = new GandLVariable();
		gl.Add();
		Sub();

	}
	public void Add() 
	{
		int Sum = i+27;
		System.out.println("sum Value is "+Sum);
	}
	public static void Sub() 
	{      int b = 23;
	      int Add =37+b;
	      System.out.println(Add);
		int sub = j-12;
		System.out.println("Sub value is "+sub);
	}

}
