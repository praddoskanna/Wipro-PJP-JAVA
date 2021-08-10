  
/*Write a program to initialize an integer array with values and check if a given number is present in the array or not.
If the number is not found, it will print -1 else it will print the index value of the given  number in the array.
Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.
Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
*/
  
/*Write a program to initialize an integer array with values and check if a given number is present in the array or not.
If the number is not found, it will print -1 else it will print the index value of the given  number in the array.
Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.
Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
*/
import java.util.*;
public class ArrayDemo
{
public static void main(String [] args)
{
    int n=0,num=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    n=sc.nextInt();
    int[]ary=new int[n];
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++)
        ary[i]=sc.nextInt();
    System.out.println("Enter the number");
    num=sc.nextInt();
   //searching number
    for(int i=0;i<n;i++)
    {
        if(num == ary[i])
        System.out.println("Item Found "+ (i+1));
        
    }
    System.out.println("Output array");
    for(int i:ary)
    System.out.println(i);
    System.out.println("max "+ max + "\tmin is "+ min);
}
}
