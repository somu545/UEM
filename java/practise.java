import java.util.*;
import java.util.LinkedList;

class practise
{
	public static void main(String args[])
	{
		LinkedList<String> Linkedlist = new LinkedList<String>();
		Linkedlist.add("Somu");
		Linkedlist.add("raju");
		Linkedlist.add("deba");
		Linkedlist.add("Aniket");

System.out.println("--FOR Loop---");
		for(int i =0;i<Linkedlist.size();i++)
		{
			System.out.println(Linkedlist.get(i));
		}
System.out.println("---Advanced for loop----");
		for(String str:Linkedlist)
		{
			System.out.println(str);
		}
	}
}
		