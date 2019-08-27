import java.util.Scanner;
public class bubblesort{
	int t=0;
	void bs(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					t=array[j];
					array[j]=array[j+1];
					array[j+1]=t;
				}
			}

		}
		System.out.println("after sort:");
			for(int i=0;i<array.length;i++)
			{
				System.out.println(array[i]);
			}
	    
	    
	}
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int size;
		System.out.println("Enter array size of array:");
		size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		bubblesort obj= new bubblesort();
	    obj.bs(array);
	}
}
	