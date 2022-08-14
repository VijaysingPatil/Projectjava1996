package methods;

public class NonStaticMethod {

	public static void main(String[] args) 
	{
		NonStaticMethod n=new NonStaticMethod();// creat object of class
		//classname objectname = new classname();
		n.test(); //calling nonstatic method from class
		//objectname.methodname
        Myclass m=new Myclass();//creat object in My class
        m.mymethod();//calling non static method from anther class
	}
	public void test()
	{
		System.out.println("this is test method");
	}
	
}