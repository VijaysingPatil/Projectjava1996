package LogicalProgram;

public class ReversedNumWithoutString {

	public static void main(String[] args) {
		int num=123;
		int revNum = 0;
		
//		System.out.println(num/10);
//		System.out.println(num%10);
//		System.out.println(12/10);
//		System.out.println(12%10);
		for(int i = num;i>=0;i=i/10) 
		{
			int rem = i%10;
			revNum= revNum*10+rem;
		}
		System.out.println(revNum);
	}

}
