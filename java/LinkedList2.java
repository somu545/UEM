import java.util.Scanner;
import java.util.LinkedList;

class LinkedList_search{

  public static void main(String[] args) {

		String s;
     // create a LinkedList
     LinkedList<String> list = new LinkedList<String>();

     // Adding elements to the LinkedList
     list.add("India");
     list.add("Australia");
     list.add("japan");
     list.add("New Zealand");
	 list.add("China");
     list.add("Nepal");
     list.add("Maldives");
     list.add("Mexico");
	 list.add("Portugal");
     list.add("Norway");
	 
	 System.out.println("Enter country name: ");
	 Scanner sc = new Scanner (System.in);
	 s = sc.next();
	 boolean flag = false;
	 for(int i=0; i < list.size(); i++){
	 if(s.equals(list.get(i)))
	 {
		System.out.println(s+" is present");
		flag = true;
		break;
	}
	}
	if(flag==false)
	{
	System.out.println("not found");
	}
	
}
}