package This_super_keywords;

public class This_study {
	
	int p =23;
	int q =20;

	public static void main(String[] args) 
	{
		This_study t = new This_study();
		t.add();

	}
public void add() 
{
	int a = 25;
	int sum = 100+a;
	System.out.println("sum is "+sum);
	
	
	int sum1 = this.p+100;
	System.out.println("sum1 is "+sum1);
	
	System.out.println("Local value is "+a);
	System.out.println("Global value is "+this.p);
}
}
