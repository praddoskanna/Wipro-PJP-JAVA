//Write a program to initialize an integer array and print the maximum and minimum of the array.
import java.util.*;
public class ArrayDemo
{
public static void main(String [] args)
{
    int max=0,min=0,n=0;;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    n=sc.nextInt();
    int[]ary=new int[n];
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++)
        ary[i]=sc.nextInt();
    //checking max and min 
    min=ary[0];
    max=ary[0];
    for(int i:ary)
    {
        if(i<min)
        min=i;
        if(i>max)
        max=i;
    }
    System.out.println("Output array");
    for(int i:ary)
    System.out.println(i);
    System.out.println("max "+ max + "\tmin is "+ min);
}
}
