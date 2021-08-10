//Write a program to initialize an integer array and print the sum and average of the array.
import java.util.*;
public class ArrayDemo
{
public static void main(String [] args)
{
    int n=0,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    n=sc.nextInt();
    int[]ary=new int[n];
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++)
    {
        ary[i]=sc.nextInt();
        sum+=ary[i];
    }
    //output array
    int avg=sum/n;
    System.out.println("Output array");
    for(int i:ary)
    System.out.println(i);
    System.out.println("SUM is "+ sum + "Avg is "+ avg);
    
    
}
}
