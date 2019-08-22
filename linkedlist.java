/*linked list algorithm*/
import java.util.*;
public class linkedlist
{
    public static void main(String args[])
    {
        LinkedList <String> data = new LinkedList<String>();
        data.add("A");
        data.add("B");
        data.add("c");
        data.add(2,"D");
        System.out.println("Element added in the list : --"+data);
        data.remove("B");
        data.remove(2);
        System.out.println("Element added in the list : --"+data);
        data.clear();
        System.out.println("Element added in the list : --"+data);    
    }
}