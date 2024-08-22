interface Rectangle_area   
      {    
          float pi = 3.14;    
          float cal(float a,float b);    
       }    
    
class Rectangle implements Rectangle_area      
   {    
      public float cal(float a,float b)    
        {    
            return(a*b);    
         }    
   }    
    
class circle implements Rectangle_area   
   {    
      public float cal(float a,float b)    
        {    
            return(pi*a*b);    
         }    
   }    
    
class Interface_rect  
  {    
     public static void main(String arg[])    
       {    
          Rectangle obj = new Rectangle();    
          circle obj2 = new circle();    
          Rectangle_area   a;    
    
          a = obj;    
          System.out.println("\nArea of Rectangle is : " +a.cal(10,20));    
    
          a = obj2;    
          System.out.println("\nArea of Circle is : " +a.cal(15,15));    
        }    
  }