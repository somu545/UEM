interface area   
      {    
		 float pi=3.14f;
		  
          void cal(float r);
     }   
 
interface Circle      
   {    
    void display();
  }
  
 class C implements area,Circle
 {
	 float a;
	 public void cal(float r)
	 {
		a =(pi*(r*r));
	 }
	 
	 public void display()
	 {
		 System.out.println("Area is :"+a);
	 }
 }
	 
    
class Circle_area_multiple_inh
  {    
     public static void main(String arg[])    
       {    
          C obj = new C();  
			obj.cal(10);
			obj.display();
        }    
  }