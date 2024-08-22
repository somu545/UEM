import java.util.LinkedList;
import java.util.*;
class LinkedList {

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
	 
	 System.out.println("Enter countey name: ");
	 Scanner sc = new Scanner (System.in);
	 s = sc.next();
	 boolean flag=false;
	 for(int i=0; i < list.size(); i++){
	 if(list[i]== s)
	 {
		System.out.println("present");
		flag=true;
		break;
	}
	if(flag==false)
	{
	System.ou.println("not found");
	}
	
	
  }
}