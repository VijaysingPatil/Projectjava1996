package This_super_keywords;

public class This_study1 
{
String name  = "Vijaysing";
float weight = 67.5f;
	public static void main(String[] args)
	{
		This_study1 s = new This_study1();
		s.Studentinfo();
	}
public void Studentinfo() 
{
	String name = "Rohit";
	float weight = 65.46f;
	System.out.println("Local Variable");
	System.out.println("My name is "+name);
	System.out.println("My weight is "+weight);
}
{
 System.out.println("Global Variable"); 
 System.out.println("My Name is "+this.name);
 System.out.println("My Weight is "+this.weight);
}
{System.out.println("==================");

}}
