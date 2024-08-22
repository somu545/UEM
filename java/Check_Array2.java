import java.util.Scanner;
class ForInput {
	Scanner sc = new Scanner(System.in);
	int size, search, c = 0, array[];
	void getArray() {
		System.out.print("\nEnter the size of the array: ");
		size = sc.nextInt();
		array = new int[size];
	}
	void getInput(){
		System.out.print("\nEnter "+size+" integers for the array:\n");
		int i = 0;
		while(i < size){
			array[i] = sc.nextInt();
			i++;
		}
	}
}
interface ForSreach {
	void toSearch();
}
class ShowOutput extends ForInput implements ForSreach {
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
public class CheckArray2 {
	public static void main(String[] args) {
		ShowOutput sh = new ShowOutput();
		sh.getArray();
		sh.getInput();
		sh.toSearch();
		sh.show();
	}
}