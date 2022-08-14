package CollectionUse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistStudy {


	public static void main(String[] args) {
ArrayList al = new ArrayList();	
al.add("Velocity"); //0
al.add('M'); //1
al.add(null);//2
al.add(1996);//3
al.add("Vijay");//4
al.add(null);//5


System.out.println(al);
System.out.println(al.size());
System.out.println(al.get(3));
System.out.println(al.add("Vijay"));
System.out.println(al);
System.out.println(al.remove(6));
System.out.println(al);
System.out.println("====================");
System.out.println(al.get(0));
System.out.println(al.get(1));
System.out.println(al.get(2));
System.out.println(al.get(3));
System.out.println(al.get(4));
System.out.println(al.get(5));
System.out.println("====================");
//printing element using for loop .......static coding 
System.out.println("By useing for loop");
for(int i = 0;i<=4;i++) {
System.out.println(al.get(i));}
System.out.println("====================");
// printing element using for loop .......dynamic coding
for(int i=0;i<=al.size()-1;i++) 
{
	System.out.println(al.get(i));
	}
//For each loop
System.out.println("=======For Each loop==============");

for( Object r :al)
{

System.out.println(r);

}
//For iterator
System.out.println("=========For Iterator===========");
Iterator it = al.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
//for listiterator
System.out.println("====================");
System.out.println("===========for listI terator========");
ListIterator li = al.listIterator();
while(li.hasNext()) 
{
	System.out.println(li.next());
}


	}}
