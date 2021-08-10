//Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
import java.util.*;
public class largest_smallest
{
    public static void main(String[] args)
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of elements");
        int n= sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        //largest 2 numbers
        //sorting
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(array[i]<array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        // OR 
        // Using Arrays Function to sort
        // Arrays.sort(array);

        System.out.println("The 2 largest element are "+ array[n-1]+ "  " + array[n-2]);
        System.out.println("The 2 smallest element are "+ array[0]+ "  " + array[1]);
    }
}
