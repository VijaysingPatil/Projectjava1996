package globalAndlocalVariable;

public class G_V {

	int a = 23;
	static int b = 37;
	public static void main(String[] args) {
		G_V g = new G_V();
		g.Add();
		System.out.println("In non Static method "+g.a);
		
		Sub();
		System.out.println("In static method "+b);
	}
public void Add()
{
	int sum = a+12;
	System.out.println("Sum is "+sum);
	}
public static void Sub() 
{
	int sub = 40-b;
	System.out.println("Sub is "+sub);
}
}
