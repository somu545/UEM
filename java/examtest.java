public class examtest  
{     
    int x = 2; 
    Test(int i)
	{ 
		x = i;
	}  
    public static void main(String[] args) {     
	examtest t = new examtest(5); 
         System.out.println("x = " + t.x); 
    } 
} 