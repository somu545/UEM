interface area   
      {    
		  float pi=3.14f;
		  
           void cal(float r);
      }   
    
class Circle implements area      
   {    
	 float a;
      public void cal(float r)    
        {    
			 a = (pi*(r*r));
        } 
		 
    void display()
	{
		System.out.println("Area is = " +a);
	}
  }
    
    
class Circle_area 
  {    
     public static void main(String arg[])    
       {    
          Circle obj = new Circle();  
			obj.cal(10);
			obj.display();
        }    
  }