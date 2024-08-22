import java.util.Scanner;
 interface class ForInput {
	void getArray();
	void getInput();
}
interface ForSreach {
	void toSearch();
}
class ShowOutput implements ForInput,ForSreach {
	Scanner sc = new Scanner(System.in);
	int size, search, c = 0, array[];
	
	 public void getArray()
	 {
	System.out.print("\nEnter the size of the array: ");
		size = sc.nextInt();
		array = new int[size];
	 }
	 
	 
	 public void getInput()
	 {
	 System.out.print("\nEnter "+size+" integers for the array:\n");
		int i = 0;
		while(i < size){
			array[i] = sc.nextInt();
			i++;
		}
	 }
	
	public void toSearch() {
		System.out.print("\nEnter the element to search: ");
		search = sc.nextInt();
		int i = 0;
		while(i < size){
			if(search == array[i]){
				c++;
			}
			i++;
		}
	}
	void show() {
		if(c != 0){
			System.out.print("\nThe element "+search+" is present for "+c+" times in the array.");
		}
		else{
			System.out.print("\nThe element "+search+" is not present in the array.");
		}
	}
}
public class Check_array3 {
	public static void main(String[] args) {
		ShowOutput sh = new ShowOutput();
		sh.getArray();
		sh.getInput();
		sh.toSearch();
		sh.show();
	}
}