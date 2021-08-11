/*Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
*/
import java.util.*;
public class duplicate
{
    public static void main(String [] args)
    {
        
        System.out.println("Enter the number of elements");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        // read array
        int[] ary=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            ary[i]=sc.nextInt();
        }
        //create dummy array
        int m=0;//m for max value of
        for(int i=0;i<n;i++)
        m=Math.max(m,ary[i]);
        //
        int temp[]=new int[m+1];
        for(int i=0;i<temp.length;i++)
        {
             temp[i]=0;
        }
        //Counting elements 
        // temp array
        for(int i=0;i<n;i++)
        {
            temp[ary[i]]++;
        }
        
        System.out.println("New Array ");
        // temp(element positon  value inc)
        //printing final array
       for(int i=0;i<temp.length;i++)
        {
             if(temp[i]>0)
             System.out.println(i);
        }
        
    }
}
