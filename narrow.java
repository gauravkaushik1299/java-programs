import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/* class Narrow
{ */
  //default constructor is called auto matically
   /* Narrow()
    {
       System.out.println("hello world");
    }  */
        
     /*   int id;
        String name;
       
        Narrow()
        {
   
        }
      
         Narrow(int id)
        {
           
        }

        Narrow(String name)
        {
   
        }
        Narrow(int id,String id)  
        {
   
        } */

     
          
      
     // Narrow obj=new Narrow();


  /* System.out.println("welcome to vending machine");   
   System.out.println("Enter amount to shop ");
   */
   
   /* double myInt=9.789;
   double myDouble=(int)myInt;
   System.out.println(myDouble);
   */

   /*  int age=60;
    if(age>=0&&age<=12)
    {
       System.out.println("Child ");

    } 
     else if (age>=13&&age<=17)
     {
        System.out.println("Potential Voter");
     }
    else
     {
        System.out.println("Voter");
     }
      */

   /* int age=12;
    if(age>=0&&age<=5)
    {
       System.out.println("Toddler ");

    }  
     if(age>=6&&age<=12)
    {
       System.out.println("Kids ");

    } 
   else if(age>=0&&age<=12)
    {
       System.out.println("Child ");

    } 
     else if (age>=13&&age<=15)
     {
        System.out.println("juniors");
     }
    else
     {
        System.out.println("Senior");
     }
     */
    
    /*  int money=30;

      switch(money)
      {
       case (10):
       {
        System.out.println("I can offer you CRUNCHY CHIPS");
        break;
       }
       case (20):
      {
         System.out.println("I can offer you COLA CAN");
         break;
      }
       case (30):
       {
          System.out.println("I can offer you YUMM CHOCOLATE");
          break;
       }
      default:
        {
           System.out.println("please enter money :)");
        }

        }*/

     /*for(int i=0;i<10;i++)
     {
       System.out.println(i);
       if(i==7)
       { 
          System.out.println(" seven is here");
          break;
       }
     } */

     /* for(int i=0;i<10;i++)
     {
       System.out.println(i);
       if(i==7)
       {   
          
          continue ;
       }
     } */

  
  /*  int o='N';

do{


      Scanner sc=new Scanner(System.in);
      int money;
       
      
      money=sc.nextInt();
      
      switch(money)
      {
       case (10):
       {
        System.out.println("I can offer you CRUNCHY CHIPS");
        break;
       }
       case (20):
      {
         System.out.println("I can offer you COLA CAN");
         break;
      }
       case (30):
       {
          System.out.println("I can offer you YUMM CHOCOLATE");
          break;
       }
      default:
        {
           System.out.println("please enter money :)");
           break;
        }
       
      } 
      
  
       System.out.println("Do you want to continue purchase ?");
       System.out.println("if yess then press Y and if no then press N "); 
            o=sc.next().charAt(0);  


      } while(o=='y'||o=='Y');    
        */

  /*  try{
       int data=50/0;

    }catch(Exception e)
    {
       System.out.println(e);
    } */
   

    /*  Narrow ()
     {
         String brand;
         String model;
         int cost;
   
     }
     
      Narrow ( String brand)
     {
        System.out.println(" BRAND ="+brand);
     }
    
      Narrow (String brand,String model)
     {
        System.out.println(" BRAND ="+brand+" MODEL="+model);
     }
      Narrow (String brand,String model,int cost)
     {
        System.out.println(" BRAND ="+brand+" MODEL="+model+" COST"+cost);
     }
  

   public static void main(String[] args){
   
      Narrow obj=new Narrow();
      Narrow obj1=new Narrow("AUDI"); 
      Narrow obj2=new Narrow("AUDI","A7");
      Narrow obj3=new Narrow("AUDI","a7",50000);
  }
     */
     
   /*  static int amount=1000;
     Narrow()
     {
        amount=amount+0;
     }
      Narrow(int addamount)
     {  
       amount=amount+addamount;
       System.out.println(amount);
       
     }
    public static void main(String[] args)
     {  
       Scanner sc=new Scanner(System.in);
       int addamount =sc.nextInt();
       Narrow obj=new Narrow();
       Narrow obj1=new Narrow(addamount);
       Narrow obj2=new Narrow(addamount);
    } */

  /*  public void m1(int i,float f)
    {
       System.out.println("1st is called");
    }
    public void m1(float f,int i)
    {
       System.out.println("2nd is called");
    }
    public static void main(String[] args)
 {
      Narrow n=new Narrow();
      n.m1(20,20);
 }  */

// } 


/*class Circle{
   
   private double radius=1.0;
   public String color="red";
      
 Circle()
{

}
 Circle(double r)
{
  
}
void getRadius()
{
    
}
void getArea()
{
    double area;
    area=(3.14*radius*radius);
    System.out.println("area of the circle="+area);
}

public static void main(String[] args)
{
   Circle obj=new Circle();
   obj.getArea();
   
   
}
}*/

/*class Lexographical
{
  public static void main(String[] args)
  {
     String str1="This is exercise 1";
     String str2="This is exercise 2";

     int result= str1.compareTo(str2);
     System.out.println(" the result after comparison is "+result);
     
     if(result<0)
     {
        System.out.println(" str2 is greater than str1");
     }
     else if(result>0)
     {
        System.out.println(" str1 is greater than str2");
     }
      else
     {
        System.out.println("both strings are equal ");
     }

  } 
}*/

/*class MyClass
{
  public static void main(String[] args){
   
   String obj1=new String("hello");
   String obj2=new String("Hello");
    
      boolean rs = obj1.equals(obj2);
      System.out.println(" result="+rs);
  }
}
  */
  



/*class MyException extends Exception{
     MyException()
     {
        super("Wrong Key Pressed");
     }
}
class MyMain{
 public static void main(String[] args){
    
   
    Scanner sc=new Scanner(System.in);
     while(true){
       try{ int input=sc.nextInt();
         if(input==5||input==6)
        {
            continue;
        }
        else{
           throw new MyException();
           
        }
       }
       catch(Exception e)
       {
          System.out.println(e.getMessage());
       }
     }

   }
 } */

 /*class Matrix{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of 2d array:");
      int size=sc.nextInt();

      int twodarray[][]=new int[size][size];

      System.out.println("enter elements of the 2darray:");

      for(int i=0;i<size;i++)
      {
         for(int j=0;j<size;j++)
         {
                twodarray[i][j]=sc.nextInt();
         }
      } 

      int getMax=twodarray[0][0];
      int getMin=twodarray[0][0];
      for(int i=0;i<size;i++)
      {
         for(int j=0;j<size;j++)
         {
            if (getMax<twodarray[i][j])
            {
               getMax=twodarray[i][j];
            }
            else if(getMin>twodarray[i][j])
            {
               getMin=twodarray[i][j];
            }
         }

      }
       System.out.println("max element ="+getMax);
      System.out.println("min element ="+getMin);
   }
 }  */


 /*class FindDuplicate{
    public static void main(String[] args)
    {  
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        
        System.out.println("enter elements of 1st array:");
        for(int i=0;i<5;i++)
        {
           arr1[i]=sc.nextInt();
        } 
        System.out.println("enter elements of 1st array:");
          for(int j=0;j<5;j++)
        {
           arr2[j]=sc.nextInt();
        } 
        
        System.out.println("duplicate elements of 1st and 2nd array:");
        for(int i=0;i<5;i++)
        { 
           for(int j=0;j<5;j++)
           {
           if(arr1[i]==arr2[j])
           {
               System.out.println(" "+arr2[j]); 
               break; 

           }
           }
         
        }
       
    }
 } */

 /*class Factorial{
  public static void main(String[] args){
      
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int result=1;
     for(int i=n;i>=1;i--)
      {
       result=result*i;

      }
      System.out.println("factorial of "+n+"="+result);

  }
 } */
 

 /*class MatrixMultiplication{
  
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);

     int arr1[][]=new int[3][3];
     int arr2[][]=new int [3][3];
     int result[][]=new int [3][3];
     System.out.println("enter elements of 1st the 2darray:");

      for(int i=0;i<3;i++)
      {
         for(int j=0;j<3;j++)
         {
                arr1[i][j]=sc.nextInt();
         }
      } 
    
      System.out.println("enter elements of 2nd the 2darray:");
  for(int i=0;i<3;i++)
      {
         for(int j=0;j<3;j++)
         {
                arr2[i][j]=sc.nextInt();
         }
      } 
      
       System.out.println(" after multiplication result is  : ");
      for(int i=0;i<3;i++)
      {
         for(int j=0;j<3;j++)
         {
           for(int k=0;k<3;k++){
  
             result[i][j]+=arr1[i][k]*arr2[k][j];  
           }

         }

      }
      System.out.println("Multiplication Matrix :");
  for(int i=0;i<3;i++)
      {
         for(int j=0;j<3;j++)
         {
                System.out.print(" "+result[i][j]);
         }
         System.out.println();
      } 

  }
 } */



 /* class Transpose{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int arr1[][]=new int[3][3];

      for(int i=0;i<3;i++)
      {
         for(int j=0;j<3;j++)
         {
             arr1[i][j]=sc.nextInt();
         }
      }
       for(int i=0;i<3;i++)
      {
         for(int j=0;j<3;j++)
         {
             System.out.println("  "+arr1[j][i]);
         }
         System.out.println("" )
      }

  }
 }*/

/* class MainClass{
   public static void main(String[] args)
   {
         List <String> listobj=new ArrayList();
         listobj.add(new Integer(25));
         listobj.add("Muskaan");
         System.out.print(listobj);
   }
} */


//type parameter 

/* class Box<T>{
     String label=new String();
     List<T> list=new ArrayList<T>();

     Box(String label)
     {
       this.label=label;
     }
     public void add( T t)
     {  
        list.add(t);
     }
     public String toString()
     {
         
         return label+""+list;
          
     }

}
 class MainClass{
   public static void main(String[] args){
     
   Box <Integer> boxobj =new Box <Integer> ("Box of INTEGER");
   Integer i1=new Integer(2);
   Integer i2=new Integer(3);
   Integer i3=new Integer(4);       
    
   boxobj.add(i1);
   boxobj.add(i2);
   boxobj.add(i3);

   System.out.println(boxobj);

   }
 } */

/*
class Student<T>{
  String label=new String();
   List<T> namelist=new ArrayList<T>();

   Student(String label)
   {
      this.label=label;
   }
    public void add(T t)
     {  
        namelist.add(t);
     }
     public String toString()
     {
         return label+" "+namelist;      
     }
}
class MainClass{
   public static void main(String[] args)
   {
   Student <Student> stuobj =new Student <Student> ("Name of Students ");
   Student i1=new Student("muskaan");
   Student i2=new Student("shreya");
   Student i3=new Student("rashmi");       
    
   stuobj.add(i1);
   stuobj.add(i2);
   stuobj.add(i3);

   System.out.println(stuobj);
   }
  }
    */


   /* class MyNode{
     public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       int index;
        ArrayList <ArrayList> arr=new ArrayList<ArrayList>();
       ArrayList <Integer> arr1=new ArrayList<Integer>();
       ArrayList <Integer> arr2=new ArrayList<Integer>();
       ArrayList <Integer> arr3=new ArrayList<Integer>();
       ArrayList <Integer> arr4=new ArrayList<Integer>();
       ArrayList <Integer> arr5=new ArrayList<Integer>();


        arr.add(arr1);
        arr.add(arr2);
        arr.add(arr3);
        arr.add(arr4);
        arr.add(arr5);


        arr1.add(2);
        arr1.add(4);
        arr2.add(1);
        arr2.add(4);        
        arr2.add(5);
        arr2.add(3);
        arr3.add(2);
        arr3.add(5);
        arr4.add(1);
        arr4.add(5);
        arr4.add(2);
        arr5.add(4);
        arr5.add(2);
        arr5.add(3);

       index=sc.nextInt();
       System.out.println(arr.get(index-1));
   

     }
    } */

    /*class Example{
       public float ar;
        public void area(float r)
         { 
            ar=r*r*3.14f;
            System.out.println("Area of circle:"+ar);
         
         } 
        public void area(int s)
         {
            ar=s*s;
            System.out.println("Area of square"+ar);
         
         }
         public void area(int l,int b)
         {
            ar=l*b;
            System.out.println("Area of rectangle:"+ar);
         }

    public static void main(String[] args) {
      
         float radius;
         int side,length,breadth;
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter radius of circle:");
         radius=sc.nextFloat();

         System.out.println("Enter side of square:");
         side=sc.nextInt();

         System.out.println("Enter length & breadth of rectangle :");
         length=sc.nextInt();
         breadth=sc.nextInt();

         Example obj=new Example();
         obj.area(radius);
         obj.area(side);
         obj.area(length,breadth);
         
      

      }
    } */

    //using recursion
    class Factorial{
        public int fac(int n)
        {
          if(n==1)
             System.out.println(" FACTORIAL IS "+1);
          else
             return n*fac(n-1); 
               
        }
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int number;
         number=sc.nextInt();
         Factorial fobj=new Factorial();
         fobj.fac(number);
      }
    }








