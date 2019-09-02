import java.util.Scanner;  
  
public class Selectionsort
{  
   public static void main(String args[])  
   {  
       int size, i, j, y;  
       int arr[] = new int[10];  
       Scanner scan = new Scanner(System.in);  
         
       System.out.print("Enter Array Size : ");  
       size = scan.nextInt();  
         
       System.out.print("Enter Array Elements : ");  
       for(i=0; i<size; i++)  
       {  
           arr[i] = scan.nextInt();  
       }  
         
       System.out.print("Sorting the Array \n");  
       for(i=0; i<size; i++)  
       {  
           int min=i;
           for(j=i+1; j<size; j++)  
           {  
                if(arr[min]>arr[j]){
                    min=j;
                }
                if(min!=i){
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
           }  
       }  
         
       System.out.print("the Array after Sorting is :\n");  
       for(i=0; i<size; i++)  
       {  
           System.out.print(arr[i]+ "  ");  
       }  
   }  
}  