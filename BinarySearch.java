import java.util.Scanner;
public class BinarySearch{
/*
public void BinarySearch(int[]a, int d)


{
	int l=o;
	h=a.length;
	int mid;
	while(l<=h)
	{
		mid=(l+h)/2;
		if(a[mid]==d)
		return mid;
	}
	else if(a[mid]<d)
	{
		l=mid+1;
	}
	else (a[mid]>d)
	{
		h=mid-1;
	}
	

return -1;
}	
*/
public int BinarySearch(int[]a, int d, int l, int h)
{
    if(l<=h)
    {
        int mid=(l+h)/2;
        {
            if(a[mid]==d)
            return mid;
        }
        if(a[mid]<d)
        {
        return BinarySearch(a,d,mid+1,h);
        }
        else
        return BinarySearch(a,d,l,mid-1);
    }
    return -1;
}	
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int array[]=new int[5];
int num;
System.out.println("Enter element of array:");
for(int i=0;i<array.length;i++)
{
	array[i]=sc.nextInt();
}
System.out.println("Enter element to be searched");
num=sc.nextInt();
BinarySearch obj=new BinarySearch();
int value=obj.BinarySearch(array,num,0,array.length-1);
if(value==-1)
{
    System.out.println("Not found");
}
else
{
    System.out.println("found");
}
}
}