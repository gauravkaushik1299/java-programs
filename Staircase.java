import java.util.Scanner;
public class Staircase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter blocks:");
        int block=sc.nextInt();
        int n=0;
        int h=0;
        while(h<=block)
        {
            n++;
            h=(n*(n+1))/2;
        } 
        System.out.println(n-1);
    }
}