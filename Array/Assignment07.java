/*Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}

Using Hashset(collection)
*/
import java.util.*;
public class Duplicate
{
    public static void main (String[] args)
    {
        System.out.println("Enter the number of elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int[]array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("New Array without Duplicate");
        HashSet<Integer> hs= new HashSet();
        for(int i:array)
        hs.add(i);
        //iterator is class for iteration
        Iterator<Integer> i=hs.iterator();
        //hasNext - next variable
        //next-each variable print
        while(i.hasNext())
        System.out.println(i.next());
        
    }
}
